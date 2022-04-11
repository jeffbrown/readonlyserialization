package readonlyserialization;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/widget")
public class WidgetController {
    private final WidgetRepository widgetRepository;

    public WidgetController(WidgetRepository widgetRepository) {
        this.widgetRepository = widgetRepository;
    }

    @Get
    public Iterable<Widget> list() {
        return widgetRepository.findAll();
    }
}
