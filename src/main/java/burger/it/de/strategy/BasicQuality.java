package burger.it.de.strategy;

import burger.it.de.model.QualityData;
import burger.it.de.model.enums.QualityName;
import burger.it.de.model.enums.QualityPrio;
import burger.it.de.model.enums.QualityType;
import org.springframework.stereotype.Component;

@Component
public class BasicQuality implements QualityStandart {
    @Override
    public QualityData getQuality() {
        return QualityData.builder()
                .prio(QualityPrio.Prio_3.getPrio())
                .name(QualityName.basic.getName())
                .type(QualityType.Type2.getQuality())
                .build();
    }
}
