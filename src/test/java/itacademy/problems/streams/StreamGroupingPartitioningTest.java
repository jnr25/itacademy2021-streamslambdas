package itacademy.problems.streams;

import itacademy.streams.Meal;
import static itacademy.streams.Meal.FatsType;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static junit.framework.Assert.assertEquals;

public class StreamGroupingPartitioningTest {
    // use Meal.menu as a test data
    // Partition the menu with meals with calories > 350
    @Test
    public void partitionMeals() {
        Map<Boolean, List<Meal>> partitionedMeals = null;

        assertEquals(2, partitionedMeals.get(false).size());
        assertEquals(7, partitionedMeals.get(true).size());
    }

    // Group meals by fats type. Tip - you can use getCaloricLevel
    @Test
    public void groupMeals() {
        Map<FatsType, List<Meal>> groupedMeals = null;

        assertEquals(4, groupedMeals.get(FatsType.DIET).size());
        assertEquals(4, groupedMeals.get(FatsType.NORMAL).size());
        assertEquals(1, groupedMeals.get(FatsType.FAT).size());
    }

    private FatsType getCaloricLevel(Meal meal) {
        if (meal.getCalories() <= 450)
            return FatsType.DIET;
        else if (meal.getCalories() <= 750)
            return FatsType.NORMAL;
        else
            return FatsType.FAT;
    }
}
