package com.ehang.springboot.lombok;

import com.ehang.springboot.lombok.beans.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLombokApplicationTests {

    @Test
    void contextLoads() {
        User user = new User();
        //user.setAge(10);
    }

}
