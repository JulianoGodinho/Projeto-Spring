package juliano.godinho.musica.controller;

import juliano.godinho.musica.model.Rock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RockControl {

    @GetMapping("/rock")
    public Rock getRock() {

        Rock rock = new Rock();

        rock.setName("B.Y.O.B");
        rock.setArtist("System of a down");
        rock.setTime("4:23");

        return rock;
    }

    @GetMapping("/rocks")
    public ArrayList<Rock> getRegister() {

        Rock rock1 = new Rock();

        rock1.setName("Hypnotize");
        rock1.setArtist("System of a down");
        rock1.setTime("3:48");

        Rock rock2 = new Rock();

        rock2.setName("Bed of roses");
        rock2.setArtist("Bon Jovi");
        rock2.setTime("6:43");

        Rock rock3 = new Rock();

        rock3.setName("Hole in my soul");
        rock3.setArtist("Aerosmith");
        rock3.setTime("6:21");

        ArrayList<Rock> register = new ArrayList<>();

        register.add(rock1);
        register.add(rock2);
        register.add(rock3);

        return register;
    }
}
