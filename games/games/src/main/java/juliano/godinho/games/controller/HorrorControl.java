package juliano.godinho.games.controller;

import juliano.godinho.games.model.Horror;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HorrorControl {

    @GetMapping("/horror")
    public Horror getHorror() {

        Horror horror = new Horror();

        horror.setName("Resident Evil 2 Remake");
        horror.setStudio("Capcom");
        horror.setValue(150);

        return horror;
    }

    @GetMapping("/horrors")
    public ArrayList<Horror> getRegister() {

        Horror horror1 =  new Horror();

        horror1.setName("Silent Hill");
        horror1.setStudio("Konami");
        horror1.setValue(90);

        Horror horror2 = new Horror();

        horror2.setName("The Evil Within");
        horror2.setStudio("Tango Gameworks");
        horror2.setValue(130);

        Horror horror3 = new Horror();

        horror3.setName("Outlast 2");
        horror3.setStudio("Red Barrels ");
        horror3.setValue(125);

        ArrayList<Horror> register = new ArrayList<>();

        register.add(horror1);
        register.add(horror2);
        register.add(horror3);

        return register;
    }
}
