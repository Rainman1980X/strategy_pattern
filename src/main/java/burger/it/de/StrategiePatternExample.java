package burger.it.de;

import burger.it.de.model.enums.QualityName;
import burger.it.de.strategy.QualityContext;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class StrategiePatternExample {

    private static final QualityContext qualityContext = QualityContext.getInstance();
    public static void main(String[] args) {
        SpringApplication.run(StrategiePatternExample.class, args);
        log.info("Starting....\n");
        log.info("Premium...\n");
        log.info(qualityContext.getQualityData("Premium").toString());
        log.info("Standard...\n");
        log.info(qualityContext.getQualityData(QualityName.standard).toString());
        log.info("Basic...\n");
        log.info(qualityContext.getQualityData(QualityName.basic).toString());
        log.info("Exception...\n");
        log.info(qualityContext.getQualityData("Exception").toString());
    }
}