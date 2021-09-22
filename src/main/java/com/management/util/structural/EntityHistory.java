package com.management.util.structural;

import com.management.app.security.entity.Usuario;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="tb_auditory")
public class EntityHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat
    private LocalDate updateDate;

    @OneToOne
    @JoinColumn(name="id_user")
    private Usuario updatedBy;

}
