package juliano.godinho.games.controller;

import juliano.godinho.games.model.Rpg;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RpgControl {

    @GetMapping("/rpg")
    public Rpg getRpg() {

        Rpg rpg = new Rpg();

        rpg.setName("Final Fantasy VII Remake");
        rpg.setStudio("Square Enix");
        rpg.setValue(250);

        return rpg;
    }

    @GetMapping("/rpgs")
    public ArrayList<Rpg> getRegister() {

        Rpg rpg1 = new Rpg();

        rpg1.setName("Final Fantasy XV");
        rpg1.setStudio("Square Enix");
        rpg1.setValue(90);

        Rpg rpg2 = new Rpg();

        rpg2.setName("The Witcher 3 Wild Hunter");
        rpg2.setStudio("CD Projekt RED");
        rpg2.setValue(150);

        Rpg rpg3 = new Rpg();

        rpg3.setName("Persona 5");
        rpg3.setStudio("Atlus");
        rpg3.setValue(85);

        ArrayList<Rpg> register =  new ArrayList<>();

        register.add(rpg1);
        register.add(rpg2);
        register.add(rpg3);

        return register;
    }
}
