package com.javamypackage.orm;

import com.javamypackage.orm.entity.User;
import com.javamypackage.orm.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmAppApplication implements CommandLineRunner {

	@Autowired
	InvoiceRepository invoiceRepository;
	@Autowired
	InvoiceItemsRepository invoiceItemsRepository;
	@Autowired
	UserRepository userRepository;
	@Autowired
	PartRepository partRepository;


	public static void main(String[] args) {
		SpringApplication.run(OrmAppApplication.class, args);
	}

	@Override
	public void run(String... args)
	{
		// ----
		long count = invoiceRepository.count();
		System.out.println("number of transactions" + " " + count);
		// ----
		count = invoiceItemsRepository.countByPartId(10);
		System.out.println("number of transactions for a specific product" + " " + count);
		count = invoiceItemsRepository.countByPartId(9);
		System.out.println("number of transactions for a specific product" + " " + count);
		count = invoiceItemsRepository.countByPartId(8);
		System.out.println("number of transactions for a specific product" + " " + count);
		// ----
		count = invoiceRepository.countByUserId(3);
		System.out.println("number of transactions for a specific user" + " " + count);
		count = invoiceRepository.countByUserId(1);
		System.out.println("number of transactions for a specific user" + " " + count);
		// ----
		User user = userRepository.findByEmailEquals("piotr.kowalski@gmail.com");
		System.out.println("user by email\n" + user);
		// ----
		System.out.println("products by price between min max");
		partRepository.findByPriceBetween(100,400).forEach(
				val -> System.out.println(val + "\n")
		);
	}
}
