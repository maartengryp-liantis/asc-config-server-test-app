package configserver.test.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    @Value("${asc.test-config-server.status:unKnown}")
    private String property;

    @GetMapping
    public String getProperty() {
        return property;
    }
}
