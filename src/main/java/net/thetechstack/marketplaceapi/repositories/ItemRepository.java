package net.thetechstack.marketplaceapi.repositories;

import net.thetechstack.marketplaceapi.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, String> {}
