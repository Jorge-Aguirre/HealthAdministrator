package com.jorgeaguirre.healthadministrator;

import com.jorgeaguirre.healthadministrator.domain.Hospital;
import com.jorgeaguirre.healthadministrator.repository.HospitalRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HealthAdministratorApplication {

	private static final Logger log =
			LoggerFactory.getLogger(HealthAdministratorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HealthAdministratorApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(HospitalRepository repository) {
		return args -> {
			repository.deleteAll();

			// save a few hospitals
			repository.save(new Hospital("Viedma"));
			repository.save(new Hospital("Salomon Clein"));
			repository.save(new Hospital("Harri Williams"));
			repository.save(new Hospital("Hospital del Sur"));

			// fetch all hospitals
			log.info("Hospitals found with findAll():");
			log.info("-------------------------------");
			for (Hospital hospital : repository.findAll()) {
				log.info(hospital.toString());
			}
			log.info("");

			// fetch hospitals by name
			log.info("Hospital found with findByName('Salomon Clein'):");
			log.info("-----------------------------------------");
			repository.findByName("Salomon Clein").forEach(hospital1 ->
				log.info(hospital1.toString())
			);
			log.info("");
		};
	}
}
