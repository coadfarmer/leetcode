package com.example.demo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: xjjiang
 * @Data: 2022/1/6 13:40
 * @Description:
 */
public class HashMapTest {

    public static void print(Map<String, String> map) {
        try {
            Class<?> mapType = map.getClass();
            Method capacity = mapType.getDeclaredMethod("capacity");
            capacity.setAccessible(true);
            System.out.println("capacity : " + capacity.invoke(map) + "    size : " + map.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testTableSizeFor() {
        int i = 1 << 6;
        Map hashMap = new HashMap<>(i);
        print(hashMap);
    }

}
