package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by serdukovaa on 03.06.2016.
 */
@RestController
public class ConsumerAppController {


    @Value("${reply.message}")
    private String message;

    @RequestMapping(value = "/message", method = RequestMethod.GET)
    public String pongMessage() {
        return message;
    }

}
