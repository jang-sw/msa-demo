package auth;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class AuthServerApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(AuthServerApplication.class, args);

	}

}
