package com.sinhaj.item.repository;

import com.sinhaj.item.cache.ItemCache;
import com.sinhaj.item.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepository {

    @Autowired
    private ItemCache itemCache;

    public Item getItem(String itemId) {
        return itemCache.get(itemId);
    }

    public Item addItem(Item item) {
        return itemCache.put(item);
    }
}
