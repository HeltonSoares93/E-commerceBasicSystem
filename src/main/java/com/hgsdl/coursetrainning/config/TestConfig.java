package com.hgsdl.coursetrainning.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hgsdl.coursetrainning.entites.Category;
import com.hgsdl.coursetrainning.entites.Order;
import com.hgsdl.coursetrainning.entites.OrderItem;
import com.hgsdl.coursetrainning.entites.Product;
import com.hgsdl.coursetrainning.entites.User;
import com.hgsdl.coursetrainning.enumOrder.OrderStatus;
import com.hgsdl.coursetrainning.repositories.CategoryRepository;
import com.hgsdl.coursetrainning.repositories.OrderItemRepository;
import com.hgsdl.coursetrainning.repositories.OrderRepository;
import com.hgsdl.coursetrainning.repositories.ProductRepository;
import com.hgsdl.coursetrainning.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private ProductRepository productRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");

		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5);
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0);
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0);
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0);
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99);

		p1.getCategories().add(cat2);
		p2.getCategories().add(cat1);
		p3.getCategories().add(cat3);
		p4.getCategories().add(cat3);
		p5.getCategories().add(cat2);

		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

		User u1 = new User(null, "Bill", "example@email.com", "9999.9999", "@!x9");
		User u2 = new User(null, "Jeff", "example@email.com", "1111.1111", "bBv16");
		User u3 = new User(null, "Elon", "example@email.com", "2222.2222", "xxx*8");
		User u4 = new User(null, "Alice", "alice@example.com", "3333.3333", "xxx*8");
		User u5 = new User(null, "Bob", "bob@example.com", "4444.4444", "xxx*8");
		User u6 = new User(null, "Carol", "carol@example.com", "5555.5555", "xxx*8");
		User u7 = new User(null, "David", "david@example.com", "6666.6666", "xxx*8");
		User u8 = new User(null, "Eve", "eve@example.com", "7777.7777", "xxx*8");
		User u9 = new User(null, "Frank", "frank@example.com", "8888.8888", "xxx*8");
		User u10 = new User(null, "Grace", "grace@example.com", "9999.9999", "xxx*8");
		User u11 = new User(null, "Hank", "hank@example.com", "1010.1010", "xxx*8");
		User u12 = new User(null, "Ivy", "ivy@example.com", "1111.1111", "xxx*8");

		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));

		OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPrice());

		orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4));

	}

}
