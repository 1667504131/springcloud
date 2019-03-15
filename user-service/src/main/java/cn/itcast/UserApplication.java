package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: dongjw26541
 * @Date: 2019/3/14 17:41
 * @Version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("cn.itcast.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }
}
