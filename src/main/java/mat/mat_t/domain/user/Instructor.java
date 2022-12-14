package mat.mat_t.domain.user;

import lombok.Getter;
import mat.mat_t.domain.class_.Classes;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Instructor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id")
    private Long instructorId;

    //회원매핑
    @OneToOne(mappedBy = "instructor")
    private User userIn;

    @Column(nullable = false)
    private String major;

    //클래스 매핑
    @OneToMany(mappedBy = "instructorC")
    private List<Classes> classList = new ArrayList<>();
}
