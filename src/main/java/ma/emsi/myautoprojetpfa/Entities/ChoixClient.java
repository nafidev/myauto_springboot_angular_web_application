package ma.emsi.myautoprojetpfa.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ChoixClient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long Id;
    private String nomVoiture;
    private String fabricant;
    private Long prixInitial;
    private String imageUrl;

    //Properties to customize
    private String couleur;
    private String jantes;
    private String pneus;
    private String typeVerre;
    private String siege;
}
