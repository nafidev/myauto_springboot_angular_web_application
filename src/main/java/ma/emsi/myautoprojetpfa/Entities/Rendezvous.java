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
    private String nomclient;
    private String telclient;
    private String nomcommercial;
    private Long idchoix;
    private String telcommercial;
    private String daterdv;


}
