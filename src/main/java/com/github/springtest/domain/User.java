package com.github.springtest.domain;

import io.github.linpeilie.annotations.AutoMapper;
import io.github.linpeilie.annotations.AutoMappers;
import lombok.Data;

@Data
@AutoMappers({
        @AutoMapper(target = UserDto.class),
        @AutoMapper(target = UserVo.class)
})
public class User {
    private String username;
    private int age;
    private boolean young;
}
