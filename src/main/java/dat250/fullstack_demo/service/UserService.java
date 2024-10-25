package dat250.fullstack_demo.service;


import dat250.fullstack_demo.model.User;
import dat250.fullstack_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }
}
