package letscode.projetostreinamento.academiaapp.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Academia APP API")
                        .description("Lets Code - Banco do Brasil - Projeto do Módulo 4")
                        .version("v0.0.1")
                );
    }
}
