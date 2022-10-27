package tasks;


import interactions.CrearRegistro;
import models.RegistrarMascota;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import utils.Constants;

import static utils.Constants.BODY;

public class ConsumirRegistro implements Task {

    private final String resource;

    public ConsumirRegistro(String resource) {
        this.resource = resource;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        String body = actor.recall(BODY).toString();
        actor.attemptsTo(
                CrearRegistro.servicio(resource, body)
        );


    }

    public static ConsumirRegistro consumir(String resource) {

        return Tasks.instrumented(ConsumirRegistro.class, resource);
    }
}
