package com.conagora.conagorabackend;

import com.conagora.conagorabackend.dao.dishDao;
import com.conagora.conagorabackend.model.Dish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConagoraBackendApplication implements CommandLineRunner {

	private dishDao dishdao;

	// private final dishDao = dishdao;
	@Autowired
	public ConagoraBackendApplication(dishDao dishdao) {
		this.dishdao = dishdao;
	}

	public static void main(String[] args) {
		SpringApplication.run(ConagoraBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if (dishdao.findAll().isEmpty()) {
			dishdao.save(new Dish("Pizza", "any description", 12.500));
			dishdao.save(new Dish("Chicken berger", "any description", 9.500));
		}
		for (Dish dish : dishdao.findAll()) {
			System.out.println(dish);
		}

	}

}
