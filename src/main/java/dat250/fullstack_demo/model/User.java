package dat250.fullstack_demo.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name="user_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //One user to many polls
    @OneToMany(mappedBy = "creator")
    private List<Poll> polls;

    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "email", unique = true, nullable = false)
    private String email;
}
