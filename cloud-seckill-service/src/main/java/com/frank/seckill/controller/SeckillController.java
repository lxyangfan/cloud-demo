package com.frank.seckill.controller;

import com.frank.seckill.config.TomcatConfig;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Set;

@RestController
@RequestMapping("/api/seckill")
@Slf4j
public class SeckillController {

    @Autowired
    private TomcatConfig tomcatConfig;

    @GetMapping("/call")
    public Object call() {
        log.info("maxThreads: {}", tomcatConfig.getMaxThreads());
        return new HashMap();
    }

}
