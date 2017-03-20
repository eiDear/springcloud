package com.glodon.eidea.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jiangl-e on 2017/3/17.
 */
@RestController
@RefreshScope
public class Configuration {
    @Value("${app.message:默认值}")
    private String message;

    @Value("${user.username:默认值}")
    private String username;

    @Value("${user.userage:默认值}")
    private String userage;

    @RequestMapping("/test")
    public String test(){
        return message + " >> " + username + " >> " + userage;
    }
}
