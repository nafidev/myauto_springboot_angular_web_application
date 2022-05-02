package ma.emsi.myautoprojetpfa.Services;


import ma.emsi.myautoprojetpfa.Entities.ChoixClient;
import ma.emsi.myautoprojetpfa.Repositories.ChoixClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoixClientService {

    private final ChoixClientRepository choixClientRepository;

    @Autowired
    public ChoixClientService(ChoixClientRepository choixClientRepository)
    {
        this.choixClientRepository = choixClientRepository;
    }

    public List<ChoixClient> findAllChoixClient()
    {
        return choixClientRepository.findAll();
    }

    public ChoixClient addChoixClient(ChoixClient choixClient)
    {
        return choixClientRepository.save(choixClient);
    }

    public ChoixClient updateChoixClient(ChoixClient choixClient)
    {
        return choixClientRepository.save(choixClient);
    }

    public void deleteChoixClientById(Long id)
    {
        choixClientRepository.deleteById(id);
    }


}
