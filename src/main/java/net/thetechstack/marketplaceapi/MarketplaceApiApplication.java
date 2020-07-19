package net.thetechstack.marketplaceapi;

import net.thetechstack.marketplaceapi.model.Item;
import net.thetechstack.marketplaceapi.repositories.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class MarketplaceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceApiApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ItemRepository itemRepository) {
		return args -> {
			Item item = new Item();
			item.setId("1");
			item.setTitle("New item");
			itemRepository.save(item);
		};
	}
}
