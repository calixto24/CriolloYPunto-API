package pe.edu.utp.CriolloYPunto.model;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

@Table(name = "natural_customer")
public class NaturalCustomer extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "natural_customer_id")
    private Integer natural_Customer_Id;
    
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
