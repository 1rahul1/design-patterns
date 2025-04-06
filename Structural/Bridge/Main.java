package Structural.Bridge;

public class Main {
    public static void main(String[] args) {
        LivingThings fish = new Fish(new WaterBreathe());
        fish.breatheProcess(); // Output: Water Breathe Process

        LivingThings dog = new Dog(new LandBreathe());
        dog.breatheProcess(); // Output: Land breathe process

        // using this pattern, we can add/remove more things(like Dog, Fish, Tree, etc.)
        // and
        // implementors(LandBreathe, WaterBreathe, TreeBreathe, etc.) independently
    }
}
