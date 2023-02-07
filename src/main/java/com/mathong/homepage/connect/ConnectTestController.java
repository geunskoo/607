package com.mathong.homepage.connect;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring framework 와 react 를 처음 연결해보는 영광스러운 Controller
 */
@RestController
public class ConnectTestController {

    @GetMapping("/test1")
    public String test1() {
        return "1번";
    }

    @GetMapping("/test2")
    public String test2() {
        return "2번";
    }
}
