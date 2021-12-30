package com.example.demo;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@SpringBootTest
class DemoApplicationTests {

    @Test
    public void test() {
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(String.valueOf(i));
        }
        strings.stream().map(s -> {
            int i = Integer.parseInt(s);
            return i + 3;
        }).map(s -> s + "b").forEach(System.out::println);
    }

    @Test
    public void test1() {
        String regExp = "^((13[0-9])|(14[579])|(15[0-3,5-9])|(166)|(17[35678])" +
                "|(18[0-9])|(19[8,9]))\\d{8}$";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher("17523456789");
        System.out.println(m.matches());
    }

    @Test
    public void test2() {
        boolean b = StringUtils.length("sss") < 16;
        System.out.println(b);
    }
}
