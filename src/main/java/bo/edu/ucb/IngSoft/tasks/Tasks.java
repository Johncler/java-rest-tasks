package bo.edu.ucb.IngSoft.tasks;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Tasks {

    @GetMapping("/holasrun")
    public String Hello(){
        return "hola mundo";
    }
}
