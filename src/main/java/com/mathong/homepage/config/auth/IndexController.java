package com.mathong.homepage.config.auth;

import com.mathong.homepage.config.auth.dto.SessionUser;
import javax.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class IndexController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(){
        SessionUser member = (SessionUser) httpSession.getAttribute("member");
        return member.getName();
    }
}
