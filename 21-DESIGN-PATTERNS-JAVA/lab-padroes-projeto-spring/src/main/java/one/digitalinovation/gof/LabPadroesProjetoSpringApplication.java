package one.digitalinovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto de exemplo para o curso de Padrões de Projetos com Spring
 * 
 * Listes as dependenicas do projeto
 * - spring-boot-starter-data-jpa
 * - spring-boot-starter-web
 * - h2-database
 * - spring-cloud-starter-openfeign
 * 
 * @author Jeovane dos Santos
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
