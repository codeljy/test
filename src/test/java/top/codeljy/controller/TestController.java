package top.codeljy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by thinkpad on 2018/10/23.
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello() {
        return "<h1>Hello World!</h1>";
    }

}
