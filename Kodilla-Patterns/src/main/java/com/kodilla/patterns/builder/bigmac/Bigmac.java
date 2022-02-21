package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder {

        public final String PLAIN_BUN = "plain bun";
        public final String SESAME_BUN = "sesame bun";
        public final String STANDARD = "standard";
        public final String THOUSAND_ISLANDS = "thousand islands";
        public final String BARBEQUE = "barbeque";
        public final String LETTUCE = "lettuce";
        public final String ONION = "onion";
        public final String BACON = "bacon";
        public final String CUCUMBER = "cucumber";
        public final String CHILLI_PEPPERS = "chilli peppers";
        public final String PORTOBELLO_MUSHROOMS = "portobello mushrooms";
        public final String SHRIMPS = "shrimps";
        public final String CHEESE = "cheese";

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals(PLAIN_BUN) || bun.equals(SESAME_BUN)) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Bun can only be plain or with sesame seeds");
            }
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String suace) {
            if (suace.equals(STANDARD) || suace.equals(THOUSAND_ISLANDS) || suace.equals(BARBEQUE)) {
                this.sauce = suace;
                return this;
            } else {
                throw new IllegalStateException("Sauce can only be standard, thousand islands or barbeque");
            }
        }

        public BigmacBuilder ingredients(String ingredient) {
            if (ingredient.equals(LETTUCE) || ingredient.equals(ONION) || ingredient.equals(BACON) || ingredient.equals(CUCUMBER) ||
                    ingredient.equals(CHILLI_PEPPERS) || ingredient.equals(PORTOBELLO_MUSHROOMS) || ingredient.equals(SHRIMPS) || ingredient.equals(CHEESE)) {
                ingredients.add(ingredient);
            }
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

    public Bigmac(String bun, int burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac{" + bun +
                ", " + burgers + " burgers" +
                ", " + sauce + " sauce, with " + ingredients +
                '}';
    }

}
