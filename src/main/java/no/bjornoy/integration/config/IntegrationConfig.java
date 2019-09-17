package no.bjornoy.integration.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("no.bjornoy.integration.domain")
@EnableConfigurationProperties
public class IntegrationConfig {

    private static final Logger LOGGER = LogManager.getLogger(IntegrationConfig.class);

    public IntegrationConfig() {
        LOGGER.debug("Initializing {}", IntegrationConfig.class.getSimpleName());
    }
}
