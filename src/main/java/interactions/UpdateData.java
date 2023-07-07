package interactions;


import models.GetHeader;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Put;
import utils.Endpoints;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateData implements Interaction {

    //private final PatronBuilder updateRequestBody;


    private final String body;



    public UpdateData( String body) {
        this.body = body;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        SerenityRest.rest();


        actor.attemptsTo(

                Put.to(Endpoints.ADD_PET)
                        .with(requestSpecification -> requestSpecification
                                .headers(GetHeader.basicHeaders())
                                .body(body)
                                .relaxedHTTPSValidation()
                                .log().all())


        );

    }
    public static UpdateData UpdateBasicRequest (String body){
        return instrumented(UpdateData.class, body);
    }
}