package ec.com.students.sofka.api.config;

import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.data.mongodb.core.mapping.event.ValidatingMongoEventListener;
        import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
        import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@EnableMongoRepositories("ec.com.students.sofka.api")
public class MongoConfig {

    @Bean
    public ValidatingMongoEventListener validatingMongoEventListener(
            final LocalValidatorFactoryBean factory) {
        return new ValidatingMongoEventListener(factory);
    }
}