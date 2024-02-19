package burger.it.de;

import burger.it.de.model.enums.QualityName;
import burger.it.de.strategy.QualityContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RequiredArgsConstructor
public class Main {

    private static final QualityContext qualityContext = QualityContext.getInstance();
    public static void main(String[] args) {
        log.info("\nStarting....\n");
        log.info("Permium...\n");
        log.info(qualityContext.getQualityData("Permium").toString());
        log.info("\nStandard...\n");
        log.info(qualityContext.getQualityData(QualityName.standard).toString());
        log.info("\nBasic...\n");
        log.info(qualityContext.getQualityData(QualityName.basic).toString());
        log.info("\nException...\n");
        log.info(qualityContext.getQualityData("Exception").toString());
    }
}