package ma.emsi.myautoprojetpfa.Repositories;

import ma.emsi.myautoprojetpfa.Entities.ChoixClient;
import ma.emsi.myautoprojetpfa.Entities.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChoixClientRepository extends JpaRepository<ChoixClient, Long> {



}
