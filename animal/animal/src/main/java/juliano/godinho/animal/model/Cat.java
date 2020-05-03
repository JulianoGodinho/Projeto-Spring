package juliano.godinho.animal.model;

import lombok.*;

/**
 @author Juliano Godinho
 @since 29/04/2020  10:20
 @version Exemplo Veterinaria 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Cat {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private String age;
    @Getter @Setter
    private String weight;
    @Getter @Setter
    private String genre;
}
