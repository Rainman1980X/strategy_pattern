package burger.it.de.strategy;

import burger.it.de.model.QualityData;
import burger.it.de.model.enums.QualityName;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class QualityContext {

    private static QualityContext instance;

    private final Map<QualityName, QualityStandart> qualityStandardMap = new HashMap<>();


    private  QualityContext() {
        QualityStandart premiumQuality = new PremiumQuality();
        qualityStandardMap.put(QualityName.premium, premiumQuality);
        QualityStandart standardQuality = new StandardQuality();
        qualityStandardMap.put(QualityName.standard, standardQuality);
        QualityStandart basicQuality = new BasicQuality();
        qualityStandardMap.put(QualityName.basic, basicQuality);
    }

    public static synchronized QualityContext getInstance() {
        if (instance == null) {
            instance = new QualityContext();
        }
        return instance;
    }

    public QualityData getQualityData(QualityName qualityName) {
        return qualityStandardMap.get(qualityName).getQuality();
    }

    public QualityData getQualityData(String qualityName) {

        try {
            return qualityStandardMap.get(QualityName.fromString(qualityName)).getQuality();
        } catch (Exception e){
            log.error(e.getLocalizedMessage());
            throw new IllegalArgumentException("No quality standard found for " + qualityName,e);
        }

    }
}
