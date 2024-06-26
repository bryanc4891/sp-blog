package com.sp.blog;

import com.sp.blog.entity.Role;
import com.sp.blog.repository.RoleRepository;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Blog App REST APIs",
                description = "Blog App REST APIs Documentation",
                version = "v1.0",
                contact = @Contact(
                        name = "Bryan",
                        email = "bryan.dev@test.com"
                ),
                license = @License(
                        name = "MIT",
                        url = "https://github.com/bryanc4891/sp-blog/blob/main/LICENSE"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Blog App Documentation",
                url = "https://github.com/bryanc4891/sp-blog"
        )
)
public class SpBlogRestApiApplication implements CommandLineRunner {

    @Autowired
    private RoleRepository roleRepository;

    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpBlogRestApiApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        Role adminRole = new Role();
        adminRole.setName("ROLE_ADMIN");
        roleRepository.save(adminRole);

        Role userRole = new Role();
        userRole.setName("ROLE_USER");
        roleRepository.save(userRole);

    }
}
