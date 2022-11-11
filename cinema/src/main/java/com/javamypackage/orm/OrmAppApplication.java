package com.javamypackage.orm;

import com.javamypackage.orm.repository.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


@SpringBootApplication
public class OrmAppApplication implements CommandLineRunner {

	@Autowired
	SeanceRepository seanceRepository;

	public static void main(String[] args) {
		SpringApplication.run(OrmAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		int page = 0;
		int size = 3;
		Pageable pageable = PageRequest.of(page,size);

		System.out.println("cos");
//		seanceRepository.findByMovieId(1, (java.awt.print.Pageable) pageable).forEach(
//				val -> System.out.println(val + "\n"));
	}
}
