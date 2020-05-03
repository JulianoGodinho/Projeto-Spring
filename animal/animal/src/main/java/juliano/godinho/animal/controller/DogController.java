package juliano.godinho.animal.controller;

import juliano.godinho.animal.model.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DogController {

    @GetMapping("/dog")
    public Dog getDog() {

        Dog dog = new Dog();

        dog.setName("Zé");
        dog.setAge("12");
        dog.setWeight("16");
        dog.setGenre("Male");

        return dog;

    }

    @GetMapping("/dogs")
    public ArrayList<Dog> getRegister() {

        Dog dog1 = new Dog();

        dog1.setName("Alemão");
        dog1.setAge("9");
        dog1.setWeight("14");
        dog1.setGenre("Male");

        Dog dog2 = new Dog();

        dog2.setName("Frank");
        dog2.setAge("7");
        dog2.setWeight("10");
        dog2.setGenre("Male");

        ArrayList<Dog> register = new ArrayList<>();

        register.add(dog1);
        register.add(dog2);

        return register;
    }

}
