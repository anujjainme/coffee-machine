package dunzo;

import java.util.List;
import java.util.Map;

public class BeverageResultFormatter {
    public static String getFormattedOutput(BeverageResult br) {
        StringBuffer stringBuffer = new StringBuffer();
        for(String bev: br.getPossibleBeverages()) {
            stringBuffer.append(bev);
            stringBuffer.append(" is prepared\n");
        }
        for(String bev : br.getNotPossibleBeverages().keySet()) {
            stringBuffer.append(bev);
            stringBuffer.append(" can't be prepared because ");
            stringBuffer.append(br.getNotPossibleBeverages().get(bev).get(0));
            stringBuffer.append(" is missing\n");
        }
        return stringBuffer.toString();
    }
}
