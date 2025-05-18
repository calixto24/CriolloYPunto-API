package pe.edu.utp.CriolloYPunto.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "natural_person")
public class NaturalPerson extends Person {

    @Column(name = "dni", length = 8, unique = true, nullable = false)
    private Integer dni;

    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "paternal_lastname", length = 100, nullable = false)
    private String paternalLastname;

    @Column(name = "maternal_lastname", length = 100, nullable = false)
    private String maternalLastname;

    @Column(name = "birthdate", nullable = false)
    private LocalDate birthdate;

}
