package service;


import data.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TutorialRepository extends MongoRepository<Tutorial, String> {

     public Tutorial findById(int id);
     public void deleteTutorialById(int id);

    //public List<Tutorial> findByLastName(String lastName);


}
