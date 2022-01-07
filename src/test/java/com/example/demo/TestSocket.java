package com.example.demo;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: xjjiang
 * @Data: 2022/1/4 14:35
 * @Description:
 */
public class TestSocket {

    @Test
    public void testServer() throws IOException {
        ServerSocket ss = new ServerSocket(8888);

        //在8888端口上监听，看是否有连接请求过来
        System.out.println("监听在端口号:8888");
        Socket s = ss.accept();

        System.out.println("有连接过来" + s);

        s.close();
        ss.close();
    }


}
