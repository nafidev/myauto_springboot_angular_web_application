package ma.emsi.myautoprojetpfa.Controllers;


import ma.emsi.myautoprojetpfa.Entities.ChoixClient;
import ma.emsi.myautoprojetpfa.Services.ChoixClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/choixclient")
public class ChoixClientController {

    private final ChoixClientService choixClientService;

    @Autowired
    public ChoixClientController(ChoixClientService choixClientService)
    {
        this.choixClientService = choixClientService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ChoixClient>> getAllChoixclient()
    {
        List<ChoixClient> listeChoixclient = choixClientService.findAllChoixClient();
        return new ResponseEntity<>(listeChoixclient, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<ChoixClient> addChoixClient(@RequestBody ChoixClient choixClient)
    {
        ChoixClient newChoixClient = choixClientService.addChoixClient(choixClient);
        return new ResponseEntity<>(newChoixClient, HttpStatus.CREATED);

    }

    @PutMapping("/update")
    public ResponseEntity<ChoixClient> updateChoixclient(@RequestBody ChoixClient choixClient)
    {
        ChoixClient updateChoixclient = choixClientService.updateChoixClient(choixClient);
        return new ResponseEntity<>(choixClient, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteChoixClient(@PathVariable Long id)
    {
        choixClientService.deleteChoixClientById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
