package test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ctl1 {
    @RequestMapping("/t1")
    @ResponseBody
    public String sayhi() {
        return "hi";
    }
}
