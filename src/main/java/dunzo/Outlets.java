package dunzo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Outlets {
    @JsonProperty("count_n")
    private int countn;

    public int getCountn() {
        return countn;
    }
}
