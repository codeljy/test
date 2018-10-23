package top.codeljy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thinkpad on 2018/10/23.
 */
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "<h1>Hello World!</h1>";
    }

}
