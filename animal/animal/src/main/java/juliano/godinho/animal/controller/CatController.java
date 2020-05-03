package juliano.godinho.animal.controller;

import juliano.godinho.animal.model.Cat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class CatController {

    @GetMapping("/cat")
    public Cat getCat () {

    Cat cat = new Cat();

    cat.setName("Mathias");
    cat.setAge("2");
    cat.setWeight("8");
    cat.setGenre("Male");
    return cat;

    }

    @GetMapping("/cats")
    public ArrayList<Cat> getRegister() {

        Cat cat1 = new Cat();

        cat1.setName("Abigail");
        cat1.setAge("4");
        cat1.setWeight("5");
        cat1.setGenre("Female");

        Cat cat2 = new Cat();

        cat2.setName("Pretinha");
        cat2.setAge("2");
        cat2.setWeight("4");
        cat2.setGenre("Female");

        Cat cat3 = new Cat();

        cat3.setName("Veinha");
        cat3.setAge("2");
        cat3.setWeight("5");
        cat3.setGenre("Female");

        ArrayList<Cat> register = new ArrayList<>();

        register.add(cat1);
        register.add(cat2);
        register.add(cat3);

        return register;
    }

}
