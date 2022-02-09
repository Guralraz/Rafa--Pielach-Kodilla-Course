package com.kodilla.good_patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class FatFucksEatingRepository {

    private static List<OrderDTO> orders = new ArrayList<>();

    public static void createRepositoryEntry(OrderDTO orderDTO) {
        orders.add(orderDTO);
    }

    public static void checkRepositoryContents() {
        orders.stream()
                .forEach(System.out::println);
    }
}
