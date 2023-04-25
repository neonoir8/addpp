package com.akhmzv.addpp.service.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private String password;



}
