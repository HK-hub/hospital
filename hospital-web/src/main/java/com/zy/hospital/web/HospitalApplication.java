package com.zy.hospital.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @author : HK意境
 * @ClassName : HospitalApplication
 * @date : 2023/2/27 14:37
 * @description :
 * @Todo :
 * @Bug :
 * @Modified :
 * @Version : 1.0
 */
@MapperScan("com.zy.hospital.*.mapper")
@SpringBootApplication(scanBasePackages = "com.zy.hospital")
public class HospitalApplication {

    public static void main(String[] args) {

        SpringApplication.run(HospitalApplication.class, args);

    }

}
