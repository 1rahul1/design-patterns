package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreathe());
        fish.breatheProcess(); // Output: Fish is breathing through gills.

        LivingThings dog = new Dog(new LandBreathe());
        dog.breatheProcess(); // Output: Dog is breathing through lungs.

        // using this pattern, we can add/remove more things(like Dog, Fish, Tree, etc.)
        // and
        // implementors(LandBreathe, WaterBreathe, TreeBreathe, etc.) independently
    }
}
