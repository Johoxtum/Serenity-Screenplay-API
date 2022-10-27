package stepdefinitions;

import exceptions.AssertionsServices;
import interactions.Create;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.TestData;
import questions.Schema;
import questions.StatusCode;
import tasks.ConsumirRegistro;
import utils.WebServiceEndPoints;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PetStoreStep {


    @Given("que el usuario desea registrar una mascota")
    public void queElUsuarioDeseaRegistrarUnaMascota() {

       theActorInTheSpotlight().describedAs("Envia la siguiente solicitud");
    }

    @When("registra los datos")
    public void registraLosDatos() {

        theActorInTheSpotlight().attemptsTo(
                Create.messageBody("Mascota.json", TestData.getData())
        );
        theActorInTheSpotlight().attemptsTo(
                ConsumirRegistro.consumir(WebServiceEndPoints.URI.getUrl())
        );

    }
    @Then("Valida la respuesta en {int}")
    public void validaLaRespuestaEn(int responseCode) {

       theActorInTheSpotlight()
                .should(seeThat(StatusCode.is(responseCode))
                        .orComplainWith(AssertionsServices.class,
                                AssertionsServices.THE_STATUS_CODE_SERVICE_IS_NOT_EXPECTED)
                );
    }
    @Then("Se valida el esquema {string}")
    public void seValidaElEsquema(String SchemaResponse) {

        theActorInTheSpotlight()
                .should(seeThat(Schema.esperado(SchemaResponse)));
    }

}
