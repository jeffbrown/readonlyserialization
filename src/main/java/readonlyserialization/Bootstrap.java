package readonlyserialization;

import io.micronaut.runtime.event.annotation.EventListener;
import io.micronaut.runtime.server.event.ServerStartupEvent;
import jakarta.inject.Singleton;

@Singleton
public class Bootstrap {

    private final WidgetRepository widgetRepository;

    public Bootstrap(WidgetRepository widgetRepository) {
        this.widgetRepository = widgetRepository;
    }

    @EventListener
    public void startup(ServerStartupEvent event) {
        widgetRepository.save(new Widget("Widget One"));
        widgetRepository.save(new Widget("Widget Two"));
    }
}
