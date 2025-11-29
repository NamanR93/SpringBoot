package in.sp.main.Config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.main.Beans.Student;

@Configuration
public class Config {
	
	@Bean
	public CommandLineRunner cmdLineRnner() {
		
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {

				stdBean1().displayStdInfo();
				System.out.println("-------------");
				stdBean2().displayStdInfo();
				
			}
			
			
		};
	}
	
	@Bean
	public Student stdBean1() {
		
		return new Student("Naman",15,24);
	}
	
	@Bean
	public Student stdBean2() {
		
		return new Student("Rishi",20,23);
	}
	
	

}
