package nr.sb.journalApp.Controllers;


import nr.sb.journalApp.Entities.JournalEntry;
import nr.sb.journalApp.Repository.JournalEntryRepository;
import nr.sb.journalApp.Service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;


    @GetMapping
    public ResponseEntity<?> getAll(){

        List<JournalEntry> all = journalEntryService.getAll();
        if(all != null && !all.isEmpty()){
            return new ResponseEntity<>(all, HttpStatus.OK);
        }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public  ResponseEntity<JournalEntry> createEntry( @RequestBody JournalEntry myEntry){
       try{
           journalEntryService.saveEntry( myEntry );
           return new ResponseEntity<>(myEntry, HttpStatus.CREATED);
       }catch(Exception e){
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       }


    }

   @GetMapping("id/{myId}")
    public ResponseEntity<JournalEntry> getEntryById(@PathVariable ObjectId myId){
        Optional<JournalEntry> journalEntry = journalEntryService.getEntryById(myId);
        if(journalEntry.isPresent()){
            return new ResponseEntity<>(journalEntry.get(), HttpStatus.OK);
        }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);


   }
    @DeleteMapping("id/{myId}")
    public ResponseEntity<?>  deleteEntryById(@PathVariable ObjectId myId){
     journalEntryService.deleteById(myId);
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);

    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable ObjectId id, @RequestBody JournalEntry myEntry){

        return null;
    }

}
