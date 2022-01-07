package com.example.demo;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @Author: xjjiang
 * @Data: 2022/1/5 18:36
 * @Description:
 */
public class TestLocalDate {

    @Test
    public void testLocalDateTime() {
        LocalDate now = LocalDate.now();
        LocalDateTime startDateTime = LocalDateTime.of(now, LocalTime.MAX);
        long start = Timestamp.valueOf(startDateTime).getTime();
        System.out.println(start);
        LocalDateTime nowTime = LocalDateTime.now();
        LocalDateTime localDateTime = nowTime.plusHours(1);
        System.out.println(localDateTime);
    }

}
