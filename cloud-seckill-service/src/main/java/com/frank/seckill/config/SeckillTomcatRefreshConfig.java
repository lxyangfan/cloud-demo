package com.frank.seckill.config;

import com.ctrip.framework.apollo.model.ConfigChangeEvent;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfigChangeListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.boot.web.server.WebServer;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executor;


@Component
@org.springframework.cloud.context.config.annotation.RefreshScope
@Slf4j
public class SeckillTomcatRefreshConfig {

    @Autowired
    private RefreshScope refreshScope;
    @Autowired
    private TomcatConfig tomcatConfig;

    @Autowired
    private WebServer webServer;

    @ApolloConfigChangeListener(value="application",interestedKeyPrefixes = {"server.tomcat."})
    private void refresh(ConfigChangeEvent changeEvent){
        log.info("before refresh {} changeEvent {}", tomcatConfig.getMaxThreads(), changeEvent.getChange("server.tomcat.max-threads").getNewValue());
        refreshScope.refresh("tomcatConfig");
        log.info("after refresh {}", tomcatConfig.getMaxThreads());
    }

    protected void refreshTomcat() {
        if (webServer instanceof TomcatWebServer) {
            Executor executor = ((TomcatWebServer)webServer).getTomcat().getConnector().getProtocolHandler().getExecutor();
        }
    }

}
