# springboot-hmweb
test.sql 是数据库脚本，暂时放在了resources目录下

#事务
在Spring Boot中，当我们使用了spring-boot-starter-jdbc或spring-boot-starter-data-jpa依赖的时候，
框架会自动默认分别注入DataSourceTransactionManager或JpaTransactionManager。
所以我们不需要任何额外 配置就可以用@Transactional注解进行事务的使用。

#SpringBoot事务的使用
spring Boot 使用事务非常简单，首先使用注解 @EnableTransactionManagement 开启事务支持后，
然后在访问数据库的Service方法上添加注解 @Transactional 便可。
关于事务管理器，不管是JPA还是JDBC等都实现自接口 PlatformTransactionManager 
如果你添加的是 spring-boot-starter-jdbc 依赖，框架会默认注入 DataSourceTransactionManager 实例。
如果你添加的是 spring-boot-starter-data-jpa 依赖，框架会默认注入 JpaTransactionManager 实例。
你可以在启动类中添加如下方法，Debug测试，就能知道自动注入的是 PlatformTransactionManager 接口的哪个实现类。
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
