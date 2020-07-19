package net.thetechstack.marketplaceapi.controller;

import net.thetechstack.marketplaceapi.model.Item;
import net.thetechstack.marketplaceapi.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/{id}")
    private Optional<Item> get(@PathVariable String id){
        return itemRepository.findById(id);
    }
}
