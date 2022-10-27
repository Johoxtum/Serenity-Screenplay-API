package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Consulta",
        features = "src/test/resources/features/petstore.feature",
        glue = {"stepdefinitions.hook",
                "stepdefinitions"
        }

)
public class PetRunner {
}
