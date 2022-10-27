package interactions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import utils.templates.MergeFrom;

import java.util.Map;

import static utils.Constants.BODY;
import static utils.Constants.PATH_TEMPLATE;

public class Create implements Interaction {
    private final String template;
    private final Map<String, String> clientData;
    public Create(String template, Map<String, String> clientData) {
        this.template = template;
        this.clientData = clientData;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        String templatePath = String.format(PATH_TEMPLATE, template);
        String body = MergeFrom.template(templatePath).withFieldsFrom(clientData);
        actor.remember(BODY, body);
    }
    public static Create messageBody(String template, Map<String, Object> clientData) {
        return Tasks.instrumented(Create.class, template, clientData);
    }

}
