package ma.emsi.myautoprojetpfa.Repositories;

import ma.emsi.myautoprojetpfa.Entities.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RendezvousRepository extends JpaRepository<Rendezvous, Long> {

    Optional<Rendezvous> findRendezvousById(Long id);
}
