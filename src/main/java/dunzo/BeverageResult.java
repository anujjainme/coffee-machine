package dunzo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeverageResult {
    private List<String> possibleBeverages;
    private Map<String,List<String>> notPossibleBeverages;

    public BeverageResult() {
        this.possibleBeverages = new ArrayList<>();
        this.notPossibleBeverages = new HashMap<>();
    }

    public void addPossibleBeverage(String beverage) {
        this.possibleBeverages.add(beverage);
    }

    public void addNotPossibleBeverage(String beverage, List<String> missingIngredients) {
        this.notPossibleBeverages.put(beverage,missingIngredients);
    }

    public List<String> getPossibleBeverages() {
        return possibleBeverages;
    }

    public Map<String, List<String>> getNotPossibleBeverages() {
        return notPossibleBeverages;
    }
}
