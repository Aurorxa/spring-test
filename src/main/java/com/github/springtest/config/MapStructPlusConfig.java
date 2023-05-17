package com.github.springtest.config;

import io.github.linpeilie.annotations.MapperConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperConfig(mapperPackage = "com.github.springtest", adapterClassName = "DemoConvertMapperAdapter",
        adapterPackage = "io.github.linpeilie.adapter",
        mapAdapterClassName = "DemoMapConvertMapperAdapter")
public class MapStructPlusConfig {

}