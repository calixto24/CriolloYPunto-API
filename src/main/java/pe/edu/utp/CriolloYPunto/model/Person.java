package pe.edu.utp.CriolloYPunto.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "person")
@Inheritance(strategy=InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public abstract class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Integer person_Id;

    @Column(name = "addres", length = 100)
    private String address;

    @Column(name = "phone_number", length = 9, unique = true)
    private String phone_Number;

    @Column(name = "email", unique = true, length = 100)
    private String email;
}