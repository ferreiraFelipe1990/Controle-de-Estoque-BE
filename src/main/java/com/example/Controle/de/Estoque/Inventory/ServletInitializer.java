package com.example.Controle.de.Estoque.Inventory;

import com.example.Controle.de.Estoque.ControleDeEstoqueApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ControleDeEstoqueApplication.class);
	}

}
