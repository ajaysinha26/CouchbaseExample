package com.sinhaj.item.controller;

import com.sinhaj.item.model.Item;
import com.sinhaj.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/api/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/{itemId}", produces = "application/json")
    @ResponseBody public Item getItem(@PathVariable(value = "itemId") String itemId) {
        return itemRepository.getItem(itemId);
    }

    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @ResponseBody public Item createItem(@RequestBody Item item) {
        return itemRepository.addItem(item);
    }

}
