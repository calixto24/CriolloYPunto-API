package pe.edu.utp.CriolloYPunto.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "payment_type")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_type_id")
    private Integer paymentTypeId;

    @Column(name = "name")
    private String name;

}
