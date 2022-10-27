package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import questions.Schema;
import questions.StatusCode;
import tasks.ConsumeGet;
import utils.WebServiceEndPoints;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GetPetStoreStep {

    @Given("que el usuario desea consultar las mascotas")
    public void queElUsuarioDeseaConsultarLasMascotas() {

        theActorInTheSpotlight().describedAs("Envia la siguiente solicitud");
    }

    @When("envia la peticion")
    public void enviaLaPeticion() {

        theActorInTheSpotlight().attemptsTo(
                ConsumeGet.service(WebServiceEndPoints.URI.getUrl1())
        );
    }

    @Then("Valida la respuesta con un codigo {int}")
    public void validaLaRespuestaConUnCodigo(int responseCode) {

        theActorInTheSpotlight()
                .should(seeThat(StatusCode.is(responseCode)));

    }

    @Then("Se valida el siguiente esquema {string}")
    public void seValidaElSiguienteEsquema(String SchemaResponse) {

        theActorInTheSpotlight()
                .should(seeThat(Schema.esperado(SchemaResponse)));
    }

}
