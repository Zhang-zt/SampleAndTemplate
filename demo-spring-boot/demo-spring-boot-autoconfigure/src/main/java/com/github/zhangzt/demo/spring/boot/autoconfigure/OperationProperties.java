package com.github.zhangzt.demo.spring.boot.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import java.nio.charset.StandardCharsets;

@Setter
@Getter
@PropertySource(value = "application.properties", encoding = "utf-8")
@ConfigurationProperties(prefix = "demo.operation")
public class OperationProperties {
    private String name;
    private String id;
    private int apCost;

}
