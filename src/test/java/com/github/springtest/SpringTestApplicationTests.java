package com.github.springtest;

import com.github.springtest.domain.User;
import com.github.springtest.domain.UserDto;
import com.github.springtest.domain.UserVo;
import io.github.linpeilie.Converter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SpringTestApplicationTests {

    @Autowired
    private Converter converter;

    @Test
    public void test() {
        User user = new User();
        user.setUsername("jack");
        user.setAge(23);
        user.setYoung(false);

        UserDto userDto = converter.convert(user, UserDto.class);
        System.out.println("userDto = " + userDto);    // UserDto{username='jack', age=23, young=false}

        UserVo userVo = converter.convert(user, UserVo.class);
        System.out.println("userVo = " + userVo);

    }

}
