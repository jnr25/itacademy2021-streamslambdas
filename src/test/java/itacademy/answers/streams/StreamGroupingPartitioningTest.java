package itacademy.answers.streams;

import itacademy.streams.Meal;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static itacademy.streams.Meal.FatsType;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.partitioningBy;
import static junit.framework.Assert.assertEquals;

public class StreamGroupingPartitioningTest {

    // Partition meals with calories > 350
    @Test
    public void partitionMeals() {
        Map<Boolean, List<Meal>> partitionedDishes =
                Meal.menu.stream().collect(partitioningBy(d -> d.getCalories() > 350));

        assertEquals(3, partitionedDishes.get(false).size());
        assertEquals(4, partitionedDishes.get(true).size());
    }

    // Group meals by fats type
    @Test
    public void groupMeals() {
        Map<FatsType, List<Meal>> groupedDishes =
                Meal.menu.stream().collect(groupingBy(this::getCaloricLevel));

        assertEquals(3, groupedDishes.get(FatsType.DIET).size());
        assertEquals(3, groupedDishes.get(FatsType.NORMAL).size());
        assertEquals(1, groupedDishes.get(FatsType.FAT).size());
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
