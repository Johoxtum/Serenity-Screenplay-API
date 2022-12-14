package stepdefinitions.hook;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Hook {
    private EnvironmentVariables environmentVariables;

    @Before
    public void configureBaseUrl() {

        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Pablo");
        String theRestApiBaseUrl = environmentVariables.optionalProperty("environments.prod.base.url")
                .orElse("environments.stg.base.url");
        theActorInTheSpotlight().whoCan(CallAnApi.at(theRestApiBaseUrl));
    }
}
