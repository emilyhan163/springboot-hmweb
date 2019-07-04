package com.hm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.hm.*.service.dao.impl.mapper"})
@SpringBootApplication
//(exclude = DataSourceAutoConfiguration.class)
public class HmwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmwebApplication.class, args);
    }

//    @Bean
//    public SqlSessionFactory sessionFactory() throws Exception {
//        SqlSessionFactory sqlSessionFactory =
//                new SqlSessionFactoryBean().getObject();
//        return sqlSessionFactory;
//    }

}
