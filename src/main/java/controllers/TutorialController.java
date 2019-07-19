package controllers;


import data.Tutorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.TutorialRepository;

import java.util.ArrayList;
import java.util.List;



@RestController
public class TutorialController {


    @Autowired(required = true)
    private TutorialRepository repository;



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

        repository.deleteTutorialById(id);

    }


    @RequestMapping(value="/add",method = RequestMethod.POST, headers = "Accept=application/json")
    public void add(@RequestBody  Tutorial tut) {

        repository.save(tut);


    }





}
