package com.mathong.homepage.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring framework 와 react 를 처음 연결해보는 영광스러운
 * Controller
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String test(){
        return "집가자";
    }

}
