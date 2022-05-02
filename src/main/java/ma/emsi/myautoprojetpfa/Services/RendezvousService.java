package ma.emsi.myautoprojetpfa.Services;


import ma.emsi.myautoprojetpfa.Entities.Rendezvous;
import ma.emsi.myautoprojetpfa.Exceptions.RendezvousNotFoundException;
import ma.emsi.myautoprojetpfa.Repositories.RendezvousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RendezvousService {

    private final RendezvousRepository rendezvousRepository;

    @Autowired
    public RendezvousService(RendezvousRepository rendezvousRepository)
    {
        this.rendezvousRepository = rendezvousRepository;
    }

    public List<Rendezvous> findAllRendezVous()
    {
        return rendezvousRepository.findAll();
    }

    public Rendezvous addRendezVous(Rendezvous rendezvous)
    {
        return rendezvousRepository.save(rendezvous);
    }

    public Rendezvous updateRendezVous(Rendezvous rendezvous)
    {
        return rendezvousRepository.save(rendezvous);
    }

    public void deleteRendezvousById(Long id)
    {
        rendezvousRepository.deleteById(id);
    }

    public Rendezvous findRendezvousById(Long id)
    {
        return rendezvousRepository.findRendezvousById(id)
                .orElseThrow(() -> new RendezvousNotFoundException("Rendez vous avec id" + id + "est introuvable"));
    }
}
