package mat.mat_t.domain.class_;


import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class ClassInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "code_id")
    private Long codeId;

    @Column(name = "code_name")
    private String codeName;
}
