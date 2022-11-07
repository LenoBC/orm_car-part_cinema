package com.javamypackage.orm;

import com.javamypackage.orm.car.entity.Car;
import com.javamypackage.orm.category.entity.Category;
import com.javamypackage.orm.invoice.entity.Invoice;
import com.javamypackage.orm.invoiceitem.entity.InvoiceItem;
import com.javamypackage.orm.part.entity.Part;
import com.javamypackage.orm.user.entity.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrmAppApplication {

	public static void main(String[] args) {SpringApplication.run(OrmAppApplication.class, args);}

}
