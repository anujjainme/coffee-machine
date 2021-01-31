package dunzo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class CoffeeInput {
    @JsonProperty("machine")
    private Machine machine;

    public Machine getMachine() {
        return machine;
    }
}
