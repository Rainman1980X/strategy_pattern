package burger.it.de.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class QualityData {

    private String prio;
    private String type;
    private String name;

}
