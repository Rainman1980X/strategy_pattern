package burger.it.de.strategy;

import burger.it.de.model.QualityData;
import burger.it.de.model.enums.QualityName;
import burger.it.de.model.enums.QualityPrio;
import burger.it.de.model.enums.QualityType;
import org.springframework.stereotype.Component;

@Component
public class PremiumQuality implements QualityStandard {
    @Override
    public QualityData getQuality() {
        return QualityData.builder()
                .prio(QualityPrio.Prio_1.getPrio())
                .name(QualityName.premium.getName())
                .type(QualityType.Type1.getQuality())
                .build();
    }
}
