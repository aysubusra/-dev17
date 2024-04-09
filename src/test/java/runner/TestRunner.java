package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // Özellik dosyalarının bulunduğu dizin
        glue = "src/test/java/stepdefinitions", // Step tanımlarının bulunduğu paket
        plugin = {"pretty", "html:target/cucumber-reports"} // Raporlama formatları
)
public class TestRunner {
    // Boş sınıf, sadece annotation'ları içerir
}

