package Week4.builder_design;

public class MainClass {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza.Builder("Large")
                .crust("Thin")
                .addTopping("Mushroom")
                .addTopping("Olives")
                .sauce("Tomato")
                .extraCheese(true)
                .build();

        System.out.println(pizza1.getCrust()+" "+pizza1.getSize()+" "+pizza1.getToppings()+" "+pizza1.isExtraCheese()+" "+pizza1.getSauce());

        Pizza pizza2 = new Pizza.Builder("Medium")
                .crust("Thin")
                .addTopping("Panner")
                .sauce("WhiteSauce")
                .extraCheese(false)
                .build();
    }
}
