package com.akhmzv.addpp.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Data
public class SignupRequest {

    private String username;
    private String email;
    private Set<String> roles;
    private String password;
}