package burger.it.de.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum QualityType {
    Type1("Type1"),
    Type2("Type2");

    private final String quality;

}
