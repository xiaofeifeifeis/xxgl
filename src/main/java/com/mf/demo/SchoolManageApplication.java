package com.mf.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description Spring Boot项目启动类
 * @Title StartApplication
 * @Author mengfei.zhang
 * @CreateDate
 * @UpdateUser mengfei.zhang
 * @UpdateDate
 * @UpdateRemark 修改内容
 * @Version : 1.0
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.mf.demo.*.*","com.mf.redis"})
@MapperScan("com.mf.demo.*.dao")
public class SchoolManageApplication {

	/**
	 * @Description
	 * @Title main
	 * @author  mengfei
	 * @date  2019/2/1 10:20
	 * @params  args
	 * @return  void
	 */
	public static void main(String[] args) {
		SpringApplication.run(SchoolManageApplication.class, args);
	}

}

