package com.proyectorecetas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyectorecetas.entidades.Receta;
import com.proyectorecetas.logicanegocio.AdminNegocio;

@SpringBootApplication
public class ProyectoRecetasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoRecetasApplication.class, args);
	}

	@Autowired
	protected AdminNegocio admin;

	@Override
	public void run(String... args) throws Exception {

		for (Receta p : admin.listadoRecetas()) {
			System.out.println(p);
		}
	}

}
