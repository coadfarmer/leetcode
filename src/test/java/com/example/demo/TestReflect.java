package com.example.demo;

import org.junit.jupiter.api.Test;

/**
 * @Author: xjjiang
 * @Data: 2022/1/7 16:14
 * @Description:
 */
public class TestReflect {

    @Test
    public void test() {
        User user = new User();
//        user.setAge(13);
        user.setName("Max");
        System.out.println(user);
//        Class<User> userClass = User.class;
//        try {
//            Field name = userClass.getDeclaredField("name");
//            System.out.println(name);
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
    }

}
