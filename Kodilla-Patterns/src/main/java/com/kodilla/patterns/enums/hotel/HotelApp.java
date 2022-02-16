package com.kodilla.patterns.enums.hotel;

public class HotelApp {

    public static void main(String[] args) {
        System.out.println("Accomodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getSingleBedRoomPrice());
        System.out.println("   - high season: " + Season.HIGH.getSingleBedRoomPrice());
        System.out.println("   - holiday season: " + Season.HOLIDAY.getSingleBedRoomPrice());
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + Season.LOW.getDoubleBedRoomPrice());
        System.out.println("   - high season: " + Season.HIGH.getDoubleBedRoomPrice());
        System.out.println("   - holiday season: " + Season.HOLIDAY.getDoubleBedRoomPrice());

        Season season = Season.HOLIDAY;

        System.out.println(season);
    }

}
