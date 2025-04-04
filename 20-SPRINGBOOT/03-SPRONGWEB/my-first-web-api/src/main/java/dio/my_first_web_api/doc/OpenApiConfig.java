package dio.my_first_web_api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

        @Bean
        public OpenAPI customOpenAPI() {
                return new OpenAPI()
                                .info(new Info()
                                                .title("My First Web API")
                                                .version("1.0")
                                                .description("API REST para cadastro de usuários")
                                                .termsOfService("Termo de uso: Use a vontade")
                                                .license(new License()
                                                                .name("Licença - Open Source")
                                                                .url("https://opensource.org/licenses/MIT"))
                                                .contact(new Contact()
                                                                .name("Jeovane dos Santos")
                                                                .url("https://jj.com")
                                                                .email("jeova@gmail.com")));
        }
}