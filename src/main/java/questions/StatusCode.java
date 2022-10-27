package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static utils.Constants.VALIDATION_STATUS_CODE;

public class StatusCode implements Question<Boolean> {

    private final int code;

    public StatusCode(int code) {
        this.code =  code;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.should(
                seeThatResponse(VALIDATION_STATUS_CODE,
                        response -> response
                                .statusCode(code)
                )
        );
        return true;
    }

    public static StatusCode is(int statusCode) {
        return new StatusCode(statusCode);
    }
}
