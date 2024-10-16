package helpers;

import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class DataProvider {

    public static Stream<Arguments> providerCheckingLapTops() {
        return Stream.of(
                Arguments.of("Яндекс Маркет",
                        "Ноутбуки",
                        "10000",
                        "30000",
                        "HP",
                        "Lenovo",
                        12)

        );
    }
}
