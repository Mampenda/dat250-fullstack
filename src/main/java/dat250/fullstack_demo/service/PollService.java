package dat250.fullstack_demo.service;


import dat250.fullstack_demo.model.Poll;
import dat250.fullstack_demo.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    @Autowired
    private PollRepository pollRepository;

    public void addPoll(Poll poll) {
        pollRepository.save(poll);
    }
}
