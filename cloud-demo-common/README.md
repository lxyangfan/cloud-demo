# CircuitBreaker 服务熔断使用说明

增加一个注解`@CircuitBreaker(fallback=)`，用于标记需要熔断的方法，当方法执行失败时，会触发熔断器，熔断器会在一段时间内拒绝执行该方法，直到熔断器关闭。