package helpers;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:src/main/resources/tests.properties"
})
public interface TestsProperties extends Config {

    @Config.Key("marketyandex.url")
    String marketyandexUrl();

    @Config.Key("default.timeout")
    int defaultTimeout();
}
