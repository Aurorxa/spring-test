package com.github.springtest.domain;

import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;

@Data
@AutoMapper(target = UserDto.class)
public class User {
    private String username;
    private int age;
    private boolean young;
}
