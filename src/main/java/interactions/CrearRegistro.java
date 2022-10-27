package interactions;


import models.RegistrarMascota;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static io.restassured.http.ContentType.JSON;

public class CrearRegistro implements Interaction {

    private final String resource;
    private final String body;

    public CrearRegistro(String resource, String body) {
        this.resource = resource;
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        SerenityRest.reset(); // me permite eliminar lo que se tenga en memoria

        actor.attemptsTo(
                Post.to(resource)
                        .with(request -> request
                                .contentType(JSON)
                                .body(body)
                                .headers("accept","application/json")
                                .relaxedHTTPSValidation()
                                .log().all()
                        )
        );


    }

    public static CrearRegistro servicio(String resource, String body) {

        return Tasks.instrumented(CrearRegistro.class, resource, body);
    }
}
