package cn.bw.springstuff;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 09:54
 */

@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = "cn.bw.springstuff")
@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
        new SpringApplicationBuilder()
                .sources(Application.class)
                .run(args);

    }
}
