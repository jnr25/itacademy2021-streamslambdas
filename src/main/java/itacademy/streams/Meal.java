package itacademy.streams;

import java.util.Arrays;
import java.util.List;

public class Meal {

    private int calories;

    public Meal(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public enum FatsType { DIET, NORMAL, FAT }

    public static final List<Meal> menu =
            Arrays.asList( new Meal(800),
                    new Meal(700),
                    new Meal(600),
                    new Meal(500),
                    new Meal(200),
                    new Meal(100),
                    new Meal(50));
}