package app;

import data.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import service.TutorialRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = TutorialRepository.class)
public class Application implements CommandLineRunner {

    @Autowired(required = true)
    private TutorialRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {



        // save a couple of customers
        repository.save(new Tutorial(1,"g","n","h","j","h"));
        repository.save(new Tutorial(2,"gm","nm","hm","jm","hm"));

        // fetch all customers
        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        for (Tutorial customer : repository.findAll()) {
            System.out.println(customer);
        }
        System.out.println();

    }
}