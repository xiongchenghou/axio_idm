package jp.co.axio.masterMentsetSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@MapperScan("jp.co.axio.masterMentsetSystem.repository")
public class MasteMentSetSystemApplication {


	public static void main(String[] args) {
		SpringApplication.run(MasteMentSetSystemApplication.class, args);
	}

}
