package com.jcjrta.desafio;

import com.jcjrta.entities.Order;
import com.jcjrta.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.jcjrta"})
public class DesafioApplication implements CommandLineRunner {
    @Autowired
	private OrderService orderService;

	public static void main(String[] args) {

		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println();
		Order order = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total : R$ " + orderService.total(order));

	}
}
