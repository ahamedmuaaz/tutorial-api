package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import service.TutorialRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = TutorialRepository.class)
public class Application{

    @Autowired(required = true)
    private TutorialRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);


    }
}