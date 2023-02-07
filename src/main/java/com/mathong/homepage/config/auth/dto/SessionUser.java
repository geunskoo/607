package com.mathong.homepage.config.auth.dto;

import com.mathong.homepage.domain.member.entity.Member;
import java.io.Serializable;
import lombok.Getter;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;

    public SessionUser(Member user) {
        this.name = user.getName();
        this.email = user.getEmail();
    }
}
