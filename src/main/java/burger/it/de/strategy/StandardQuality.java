package burger.it.de.strategy;

import burger.it.de.model.QualityData;
import burger.it.de.model.enums.QualityName;
import burger.it.de.model.enums.QualityPrio;
import burger.it.de.model.enums.QualityType;
import org.springframework.stereotype.Component;


@Component
public class StandardQuality implements QualityStandard {
    @Override
    public QualityData getQuality() {
        return QualityData.builder()
                .prio(QualityPrio.Prio_2.getPrio())
                .name(QualityName.standard.getName())
                .type(QualityType.Type1.getQuality())
                .build();
    }
}
