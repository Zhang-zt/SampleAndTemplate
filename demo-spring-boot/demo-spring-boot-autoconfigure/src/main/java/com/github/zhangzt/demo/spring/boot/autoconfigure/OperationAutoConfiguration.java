package com.github.zhangzt.demo.spring.boot.autoconfigure;

import com.github.zhangzt.demo.spring.OperationBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(OperationProperties.class)
public class OperationAutoConfiguration {
    @Autowired
    private OperationProperties properties;

    @Bean
    @ConditionalOnMissingBean(name = "operationBean")
    //@ConditionalOnProperty(prefix = "demo.operation", value = "enable", matchIfMissing = true)
    public OperationBean operationBean() {
        OperationBean bean = new OperationBean();
        bean.setId(properties.getId());
        bean.setName(properties.getName());
        bean.setApCost(properties.getApCost());
        return bean;
    }
}
