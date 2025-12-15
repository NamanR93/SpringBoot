//package nr.sb.journalApp.Controllers;
//
//
//import nr.sb.journalApp.Entities.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/_journal")
//public class JournalController {
//
//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//
//    @GetMapping
//    public List<JournalEntry> getAll(){
//        return new ArrayList<>(journalEntries.values());
//    }
//
//    @PostMapping
//    public boolean createEntry( @RequestBody JournalEntry myEntry){
//        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//   @GetMapping("id/{myId}")
//    public JournalEntry getEntryById(@PathVariable Long myId){
//
//        return journalEntries.get(myId);
//   }
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteEntryById(@PathVariable Long myId){
//
//        return journalEntries.get(myId);
//    }
//
//    @PutMapping("/id/{id}")
//    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry){
//        return journalEntries.put(id, myEntry);
//    }
//
//
//
//}
