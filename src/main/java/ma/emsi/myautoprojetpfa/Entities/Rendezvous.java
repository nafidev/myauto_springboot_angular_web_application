package ma.emsi.myautoprojetpfa.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomClient;
    private String dateValidation;
    private String nomCommercial;
    private Date dateRendezvous;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "rendezvous_choixclient",
    joinColumns = {
            @JoinColumn(name = "rendezvous_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "choixclient_id")
    })
    private ChoixClient choixClient;


}
