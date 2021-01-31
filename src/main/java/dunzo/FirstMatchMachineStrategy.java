package dunzo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FirstMatchMachineStrategy implements CoffeeMachineStrategy {
    @Override
    public BeverageResult giveBeverageCombination(CoffeeInput coffeeInput) {
        BeverageResult beverageResult = new BeverageResult();
        Machine machine = coffeeInput.getMachine();
        for(String beverage: machine.getBeverages().keySet()) {
            Map<String, Integer> beverageIngredients = machine.getBeverages().get(beverage);
            if(isBeveragePossible(beverageIngredients,machine.getTotalItemsQuantity())) {
                beverageResult.addPossibleBeverage(beverage);
                updateTotalItemsQuantity(beverageIngredients,machine.getTotalItemsQuantity());
            } else {
                List<String> notEnoughIngredients = getNotEnoughIngredients(beverageIngredients,machine.getTotalItemsQuantity());
                beverageResult.addNotPossibleBeverage(beverage,notEnoughIngredients);
            }
        }
        return beverageResult;
    }

    private void updateTotalItemsQuantity(Map<String, Integer> beverageIngredients, Map<String, Integer> totalItemsQuantity) {
        for(String ingredient: beverageIngredients.keySet()) {
            int required = beverageIngredients.get(ingredient);
            int existingQuantity = totalItemsQuantity.get(ingredient);
            totalItemsQuantity.put(ingredient,existingQuantity-required);
        }
    }

    private boolean isBeveragePossible(Map<String, Integer> beverageIngredients, Map<String, Integer> totalItemsQuantity) {
        return getNotEnoughIngredients(beverageIngredients,totalItemsQuantity).isEmpty();
    }

    private List<String> getNotEnoughIngredients(Map<String, Integer> beverageIngredients, Map<String, Integer> totalItemsQuantity) {
        List<String> missing = new ArrayList<>();
        for (String ingredient : beverageIngredients.keySet()) {
            if (totalItemsQuantity.containsKey(ingredient)) {
                int requiredQuantity = beverageIngredients.get(ingredient);
                int available = totalItemsQuantity.get(ingredient);
                if (available - requiredQuantity < 0) {
                    missing.add(ingredient);
                }
            } else {
                missing.add(ingredient);
            }
        }
        return missing;
    }
}
