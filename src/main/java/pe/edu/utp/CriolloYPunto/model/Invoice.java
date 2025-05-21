package pe.edu.utp.CriolloYPunto.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "invoice")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice extends Voucher {

    @ManyToOne
    @JoinColumn(name = "juridical_customer_id")
    @OnDelete(action = OnDeleteAction.SET_NULL)
    private JuridicalCustomer juridicalCustomer;

}
