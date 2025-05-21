package pe.edu.utp.CriolloYPunto.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ticket")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket extends Voucher {

    @ManyToOne
    @JoinColumn(name = "natural_customer_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private NaturalCustomer naturalCustomer;

}
