package dunzo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class Machine {
    @JsonProperty("outlets")
    private Outlets outlets;
    @JsonProperty("total_items_quantity")
    private Map<String,Integer> totalItemsQuantity;
    @JsonProperty("beverages")
    private Map<String,Map<String,Integer>> beverages;

    public Outlets getOutlets() {
        return outlets;
    }

    public Map<String, Integer> getTotalItemsQuantity() {
        return totalItemsQuantity;
    }

    public Map<String, Map<String, Integer>> getBeverages() {
        return beverages;
    }

}
