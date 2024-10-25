package dat250.fullstack_demo.controller;


import dat250.fullstack_demo.model.Poll;
import dat250.fullstack_demo.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/polls")
public class PollController {

    @Autowired
    private PollService pollService;

    // POST - post user data to database
    @PostMapping("/addPoll")
    public ResponseEntity<String> addPoll(@RequestBody Poll poll) {
        try {
            pollService.addPoll(poll);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
}
