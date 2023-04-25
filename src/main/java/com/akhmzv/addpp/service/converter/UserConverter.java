package com.akhmzv.addpp.service.converter;

import com.akhmzv.addpp.entity.User;

import com.akhmzv.addpp.service.dto.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public User toEntity(UserDto userDto) {
        if (userDto == null) {
            return null;
        }
        return User.builder()
                .username(userDto.getUsername())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();

    }
}
