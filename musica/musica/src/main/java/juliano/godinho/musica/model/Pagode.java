package juliano.godinho.musica.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

/**
 @author Juliano Godinho
 @since 29/04/2020  10:20
 @version Exemplo Musica 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Pagode {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String artist;
    @Getter @Setter
    private String time;

}
