package ma.emsi.myautoprojetpfa.Controllers;

import ma.emsi.myautoprojetpfa.Entities.Rendezvous;
import ma.emsi.myautoprojetpfa.Services.RendezvousService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rendezvous")
public class RendezvousController {

    private final RendezvousService rendezvousService;

    @Autowired
    public RendezvousController(RendezvousService rendezvousService) {
        this.rendezvousService = rendezvousService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Rendezvous>> getAllRendezvous() {
        List<Rendezvous> listerendezvous = rendezvousService.findAllRendezVous();
        return new ResponseEntity<>(listerendezvous, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Rendezvous> getRendezvousById(@PathVariable("id") Long id) {
        Rendezvous rendezvous = rendezvousService.findRendezvousById(id);
        return new ResponseEntity<>(rendezvous, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Rendezvous> addRendezvous(@RequestBody Rendezvous rendezvous) {
        Rendezvous newRendezvous = rendezvousService.addRendezVous(rendezvous);
        return new ResponseEntity<>(newRendezvous, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Rendezvous> updateRendezvous(@RequestBody Rendezvous rendezvous) {
        Rendezvous updateRendezvous = rendezvousService.updateRendezVous(rendezvous);
        return new ResponseEntity<>(updateRendezvous, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRendezvous(@PathVariable("id") Long id) {
        rendezvousService.deleteRendezvousById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
