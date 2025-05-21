package pe.edu.utp.CriolloYPunto.model;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "voucher")
@Inheritance(strategy=InheritanceType.JOINED)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Voucher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voucher_id")
    private Integer voucherId;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "time", nullable = false)
    private LocalTime time;

    @Column(name = "taxed", nullable = false)
    private Double taxed;

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;

    @Column(name = "discount")
    private Double discount = null;

    @Column(name = "additional_payments")
    private Double additionalPayments;

    @Column(name = "igv", nullable = false)
    private Double igv;

    @Column(name = "available", nullable = false)
    private boolean available;

    @Column(name = "turned")
    private double turned;

    @ManyToOne
    @JoinColumn(name = "payment_type_id")
    private PaymentType paymentType;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
