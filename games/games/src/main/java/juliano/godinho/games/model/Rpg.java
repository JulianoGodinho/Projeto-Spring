package juliano.godinho.games.model;

import lombok.*;

/**
 @author Juliano Godinho
 @since 29/04/2020  10:20
 @version Exemplo Games 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Rpg {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String studio;
    @Getter @Setter
    private float value;

}
