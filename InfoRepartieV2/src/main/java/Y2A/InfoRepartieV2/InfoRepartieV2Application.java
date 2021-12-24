package Y2A.InfoRepartieV2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class InfoRepartieV2Application {
	public static void main(String[] args) {
		SpringApplication.run(InfoRepartieV2Application.class, args);
	}

}
