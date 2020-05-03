package juliano.godinho.musica.model;

import lombok.*;

/**
 @author Juliano Godinho
 @since 29/04/2020  10:20
 @version Exemplo Musica 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Rock {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String artist;
    @Getter @Setter
    private String time;

}
