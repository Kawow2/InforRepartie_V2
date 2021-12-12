package Y2A.InfoRepartieV2;

import Service.EntrepriseService;
import Service.IEntrepriseService;
import models.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class InfoRepartieV2Application {

	@Bean
	public static IEntrepriseService transactionService() {
		return new EntrepriseService();
	}


	@Autowired
	private IEntrepriseService entrepriseService;

	public static void main(String[] args) {
		transactionService();
		SpringApplication.run(InfoRepartieV2Application.class, args);
	}

	@GetMapping("/hello")
	public Entreprise hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return entrepriseService.findById(1).get();
	}




}
