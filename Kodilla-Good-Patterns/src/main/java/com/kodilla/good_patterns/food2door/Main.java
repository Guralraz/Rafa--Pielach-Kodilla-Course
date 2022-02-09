package com.kodilla.good_patterns.food2door;

public class Main {

    public static void main(String[] args) {
        Food2Door food2Door = new Food2Door();
        food2Door.order(new UnhealthyFoods("lettuce", 1112));
        food2Door.getOrders();
        food2Door.order(new FatFucksEating("burger", 130));
        food2Door.getOrders();
        FatFucksEatingRepository.checkRepositoryContents();
        food2Door.finalizeOrders();
    }

}
