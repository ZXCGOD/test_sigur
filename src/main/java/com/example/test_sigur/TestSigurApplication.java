package com.example.test_sigur;

import com.example.test_sigur.data_access.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.sql.Date;

@SpringBootApplication
@EnableJpaRepositories("com.example.test_sigur.data_access")
@EntityScan("com.example.test_sigur.data_access")
@EnableAutoConfiguration
@EnableTransactionManagement
public class TestSigurApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestSigurApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.test_sigur.data_access");
        DepartmentRepository employeeMgr = (DepartmentRepository) context.getBean(DepartmentRepository.class);
        employeeMgr.save(new Department(1));
    }

}
