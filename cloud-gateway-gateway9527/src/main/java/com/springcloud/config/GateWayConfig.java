package com.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator customRouterLocator(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocatorBuilder.Builder routers = routeLocatorBuilder.routes();
        routers.route("path_router",
                r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
        return routers.build();
    }
}
