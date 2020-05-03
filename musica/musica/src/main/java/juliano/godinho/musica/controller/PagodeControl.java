package juliano.godinho.musica.controller;

import juliano.godinho.musica.model.Pagode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class PagodeControl {

    @GetMapping("/pagode")
    public Pagode getPagode() {
        Pagode pagode = new Pagode();

        pagode.setName("Deixa eu te querer");
        pagode.setArtist("Turma do pagode");
        pagode.setTime("3:31");

        return pagode;

    }

    @GetMapping("/pagodes")
    public ArrayList<Pagode> getRegister() {

        Pagode pagode1 = new Pagode();

        pagode1.setName("Tempo de aprender");
        pagode1.setArtist("Soweto");
        pagode1.setTime("4:03");

        Pagode pagode2 = new Pagode();

        pagode2.setName("Coisas de casal");
        pagode2.setArtist("Salgadinho");
        pagode2.setTime("3:48");

        Pagode pagode3 = new Pagode();

        pagode3.setName("Frenesi");
        pagode3.setTime("Pixote");
        pagode3.setTime("4:01");

        ArrayList<Pagode> register = new ArrayList<>();

        register.add(pagode1);
        register.add(pagode2);
        register.add(pagode3);

        return register;

    }
}
