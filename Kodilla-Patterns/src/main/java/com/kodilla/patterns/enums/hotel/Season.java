package com.kodilla.patterns.enums.hotel;

import java.math.BigDecimal;

public enum Season {
    LOW(new BigDecimal(250), new BigDecimal(350)),
    HIGH(new BigDecimal(320), new BigDecimal(400)),
    HOLIDAY(new BigDecimal(400), new BigDecimal(500));

    private BigDecimal singleBedRoomPrice;

    private BigDecimal doubleBedRoomPrice;

    Season(BigDecimal singleBedRoomPrice, BigDecimal doubleBedRoomPrice) {
        this.singleBedRoomPrice = singleBedRoomPrice;
        this.doubleBedRoomPrice = doubleBedRoomPrice;
    }

    public BigDecimal getSingleBedRoomPrice() {
        return singleBedRoomPrice;
    }

    public BigDecimal getDoubleBedRoomPrice() {
        return doubleBedRoomPrice;
    }
}
