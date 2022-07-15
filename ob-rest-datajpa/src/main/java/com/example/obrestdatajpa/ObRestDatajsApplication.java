package com.example.obrestdatajpa;

import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObRestDatajsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDatajsApplication.class, args);
		/*BookRepository repository = context.getBean(BookRepository.class);*/

		/*// Crear un libro
		Book book  = new Book(null, "El Señor de las moscas", "William", 226, 200.00, LocalDate.of(2018, 12, 1), true);
		Book book2  = new Book(null, "et", "Will", 226, 2560.00, LocalDate.of(2022, 2, 14), true);
		// Postear un libro
		System.out.println(repository.findAll().size());
		repository.save(book);
		repository.save(book2);
		
		// Recuperar todos los libros
		System.out.println(repository.findAll().size());
		

		// Eliminar un libro
		repository.deleteById(1L);
		System.out.println("Numero de libros en base de datos: " +repository.findAll().size());*/
	}

}
