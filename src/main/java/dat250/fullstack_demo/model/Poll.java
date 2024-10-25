package dat250.fullstack_demo.model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="poll_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // Many polls to one user
    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;

    @Column(name = "question", unique = true, nullable = false)
    private String question;
}
