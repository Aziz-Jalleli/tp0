package tn.pi.msrestapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.pi.msrestapi.daos.ToDoRepository;
import tn.pi.msrestapi.model.ToDo;

import java.util.List;

@SpringBootApplication
public class MsRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsRestApiApplication.class, args);
        System.out.println("REST API starts successfully");
    }

    @Bean
    public CommandLineRunner initData(ToDoRepository repository) {
        return args -> {
            List<ToDo> todos = List.of(
                    ToDo.builder()
                            .title("Microservice")
                            .description("Microservice synchrone utilisant REST")
                            .build(),

                    ToDo.builder()
                            .title("DevOps")
                            .description("DevOps IA for microservices")
                            .build(),
                    ToDo.builder()
                            .title("LLMs")
                            .description("RAG using LLMs")
                            .build()
            );

            repository.saveAll(todos);
        };
    }
}
