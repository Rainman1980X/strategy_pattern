package burger.it.de.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor
public enum QualityName {

    premium("Premium"),
    standard("Standard"),
    basic("Basic");

    private final String name;

    public static QualityName fromString(String qualityName) {
        return  Arrays.stream(QualityName.values())
                .filter(qn -> qn.getName().equalsIgnoreCase(qualityName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(STR."There is no value with name \{qualityName} in Enum QualityName"));
    }
}
