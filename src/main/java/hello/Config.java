package hello;

import org.apache.log4j.Logger;
import simpleweb.DispatchFilter;

public class Config extends DispatchFilter {
    private static final Logger LOGGER = Logger.getLogger(Config.class);

    @Override
    public void configueControllers() {

        GET("/edit/{id}").invokes("hello").on(new HelloController());

    }
}
