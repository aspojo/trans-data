package top.logbug.transdata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.logbug.transdata.generator.mapper")
public class TransDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransDataApplication.class, args);
    }

}
