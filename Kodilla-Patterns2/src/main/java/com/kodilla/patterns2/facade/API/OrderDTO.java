package com.kodilla.patterns2.facade.API;

import java.util.ArrayList;
import java.util.List;

public class OrderDTO {

    private final List<ItemDTO> items = new ArrayList<>();

    public void addItem(final ItemDTO item) { items.add(item); }

    public List<ItemDTO> getItems() {
        return items;
    }

}
