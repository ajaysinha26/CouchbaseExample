package com.sinhaj.item.cache;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;
import com.sinhaj.item.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemCache {

    @Autowired
    private Bucket bucket;

    public Item get(String itemId) {
        JsonDocument jsonDocument = bucket.get(itemId);
        if(jsonDocument == null) {
            return null;
        }
        Item item = new Item();
        item.setItemId(itemId);
        item.setItemDescription(jsonDocument.content().getString("itemDescription"));
        item.setItemCategory(jsonDocument.content().getString("itemCategory"));
        return item;
    }

    public Item put(Item item) {
        JsonObject jsonObject = JsonObject.create();
        jsonObject.put("itemId", item.getItemId());
        jsonObject.put("itemDescription", item.getItemDescription());
        jsonObject.put("itemCategory", item.getItemCategory());
        JsonDocument jsonDocument = JsonDocument.create(item.getItemId(), jsonObject);
        bucket.insert(jsonDocument);
        return item;
    }
}
