package com.example.demo;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

    @Test
    public void testTimeStamp() {
        Long timeStamp = System.currentTimeMillis();  //获取当前时间戳
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));      // 时间戳转换成时间
        System.out.println("格式化结果：" + sd);
    }

    @Test
    public void testIP() throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        String ip = host.getHostAddress();
        System.out.println("本机ip地址：" + ip);
        System.out.println(ProcessHandle.current().pid());
    }

    @Test
    public void testGroupingBy() {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        // 分组
        Map<String, List<String>> result1 = items.stream().collect(
                Collectors.groupingBy(
                        Function.identity()
                )
        );
        //{papaya=[papaya], orange=[orange], banana=[banana, banana], apple=[apple, apple, apple]}
        System.out.println(result1);


        // 分组计数
        Map<String, Long> result2 = items.stream().collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );
        // {papaya=1, orange=1, banana=2, apple=3}
        System.out.println(result2);
        Map<String, Long> finalMap = new LinkedHashMap<>();


        //分组, 计数和排序
        result2.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        // {apple=3, banana=2, papaya=1, orange=1}
        System.out.println(finalMap);
    }

    @Test
    public void testStringToLong() {
        String s = "";
        Long aLong = Long.parseLong(s);
        System.out.println(aLong);
    }

    @Test
    public void testBitOperator() {
        int i = 99, j = 0;
        System.out.println(i & j);
    }
}
