package controllers;


import data.Greeting;
import data.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.TutorialRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


@RestController

public class TutorialController {


    @Autowired(required = true)
    private TutorialRepository repository;


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/")
    public List<Tutorial> alltutorials() {

        List<Tutorial> tutlist=new ArrayList<Tutorial>();
        tutlist=repository.findAll();
        return tutlist;
    }


    @RequestMapping("/find")
    public Tutorial alltutorials(@RequestParam(value ="id" ,defaultValue = "id") int id) {
        Tutorial founded =repository.findById(id);

        return founded;
    }

    @RequestMapping("/delete")
    public void delete(@RequestParam(value ="id" ,defaultValue = "id") int id) {
        System.out.println(id);
        repository.deleteTutorialById(id);

    }

    @RequestMapping("/update")
    public void update(@RequestParam(value ="tut" ,defaultValue = "tut")Tutorial tut) {
        repository.save(tut);


    }





}
