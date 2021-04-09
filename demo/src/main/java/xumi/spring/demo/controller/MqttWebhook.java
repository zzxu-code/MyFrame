package xumi.spring.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xumi.spring.demo.utils.GeneratorJson;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/mqtt/")
public class MqttWebhook {

    private Logger logger = LogManager.getLogger();

    @PostMapping("/register")
    public String register(HttpServletRequest request){
        logger.info("连接到request,{}",request.toString());
        return GeneratorJson.resultJson(GeneratorJson.success());
    }

}
