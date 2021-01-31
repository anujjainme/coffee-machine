import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dunzo.BeverageResult;
import dunzo.CoffeeInput;
import dunzo.CoffeeMachineStrategy;
import dunzo.FirstMatchMachineStrategy;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;

public class FirstMatchStrategyTest {

    @Test
    public void checkWithSampleInput() {
        ObjectMapper mapper = new ObjectMapper();
        CoffeeInput coffeeInput = null;
        try {
            coffeeInput = mapper.readValue(getSampleInput(), CoffeeInput.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        CoffeeMachineStrategy coffeeMachineStrategy = new FirstMatchMachineStrategy();
        BeverageResult br = coffeeMachineStrategy.giveBeverageCombination(coffeeInput);
        List<String> expectedAnswer = new ArrayList<>();
        expectedAnswer.add("hot_tea");
        expectedAnswer.add("hot_coffee");
        Assert.assertThat(br.getPossibleBeverages(),is(expectedAnswer));
    }

    private static String getSampleInput() {
        return "{\n" +
                "  \"machine\": {\n" +
                "    \"outlets\": {\n" +
                "      \"count_n\": 3\n" +
                "    },\n" +
                "    \"total_items_quantity\": {\n" +
                "      \"hot_water\": 500,\n" +
                "      \"hot_milk\": 500,\n" +
                "      \"ginger_syrup\": 100,\n" +
                "      \"sugar_syrup\": 100,\n" +
                "      \"tea_leaves_syrup\": 100\n" +
                "    },\n" +
                "    \"beverages\": {\n" +
                "      \"hot_tea\": {\n" +
                "        \"hot_water\": 200,\n" +
                "        \"hot_milk\": 100,\n" +
                "        \"ginger_syrup\": 10,\n" +
                "        \"sugar_syrup\": 10,\n" +
                "        \"tea_leaves_syrup\": 30\n" +
                "      },\n" +
                "      \"hot_coffee\": {\n" +
                "        \"hot_water\": 100,\n" +
                "        \"ginger_syrup\": 30,\n" +
                "        \"hot_milk\": 400,\n" +
                "        \"sugar_syrup\": 50,\n" +
                "        \"tea_leaves_syrup\": 30\n" +
                "      },\n" +
                "      \"black_tea\": {\n" +
                "        \"hot_water\": 300,\n" +
                "        \"ginger_syrup\": 30,\n" +
                "        \"sugar_syrup\": 50,\n" +
                "        \"tea_leaves_syrup\": 30\n" +
                "      },\n" +
                "      \"green_tea\": {\n" +
                "        \"hot_water\": 100,\n" +
                "        \"ginger_syrup\": 30,\n" +
                "        \"sugar_syrup\": 50,\n" +
                "        \"green_mixture\": 30\n" +
                "      }\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }
}
