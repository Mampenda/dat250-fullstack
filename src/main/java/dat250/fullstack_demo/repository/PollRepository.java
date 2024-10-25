package dat250.fullstack_demo.repository;

import dat250.fullstack_demo.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PollRepository extends JpaRepository<Poll, Integer> {
}
