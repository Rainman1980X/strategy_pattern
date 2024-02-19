package burger.it.de.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum
QualityPrio {
    Prio_1("1"),
    Prio_2("2"),
    Prio_3("3"),
    Prio_4("4");

    private final String prio;

}
