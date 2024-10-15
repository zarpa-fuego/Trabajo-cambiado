package pe.edu.upeu.sysalmacenfx;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import pe.edu.upeu.sysalmacenfx.pruebas.MainY;

@SpringBootApplication
public class SysAlmacenFxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SysAlmacenFxApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext context) { return args -> {
		//mx = context.getBean(MainX.class);
		MainY mx = context.getBean(MainY.class);
		mx.menu();
		};
	}

}
