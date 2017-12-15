package shenzhen.teamway.tms9000.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
@MapperScan("shenzhen.teamway.tms9000.portal.mapper")
public class SpringRun {
        public static void main(String[] args) {
            SpringApplication.run(SpringRun.class, args);
        }

        protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
            return application.sources(SpringRun.class);
        }

    }
