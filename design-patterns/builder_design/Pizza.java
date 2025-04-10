package Week4.builder_design;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String size;
    private String crust;
    private List<String> toppings;
    private String sauce;
    private boolean extraCheese;

    private Pizza(Builder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.toppings = builder.toppings;
        this.sauce = builder.sauce;
        this.extraCheese = builder.extraCheese;
    }

    public String getSize() {
        return size;
    }

    public String getCrust() {
        return crust;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isExtraCheese() {
        return extraCheese;
    }

    public static class Builder {
        private String size;
        private String crust;
        private List<String> toppings = new ArrayList<>();
        private String sauce;
        private boolean extraCheese;

        public Builder() {}

        public Builder(String size) {
            this.size = size;
        }

        public Builder crust(String crust) {
            this.crust = crust;
            return this;
        }

        public Builder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder extraCheese(boolean extraCheese) {
            this.extraCheese = extraCheese;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
