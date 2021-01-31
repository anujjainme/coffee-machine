package dunzo;

import com.fasterxml.jackson.databind.ObjectMapper;
import dunzo.CoffeeInput;

import java.io.IOException;
import java.nio.file.Paths;

public class SampleRun {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CoffeeInput coffeeInput = mapper.readValue(getSampleInput(),CoffeeInput.class);
        System.out.println(coffeeInput);
        CoffeeMachineStrategy coffeeMachineStrategy = new FirstMatchMachineStrategy();
        BeverageResult br = coffeeMachineStrategy.giveBeverageCombination(coffeeInput);
        System.out.println(BeverageResultFormatter.getFormattedOutput(br));
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
