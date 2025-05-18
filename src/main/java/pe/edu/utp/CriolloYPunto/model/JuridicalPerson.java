package pe.edu.utp.CriolloYPunto.model;

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

@Table(name="juridical_person")
public class JuridicalPerson extends Person {

@Column(name = "ruc" ,length = 11 , nullable = false , unique = true)
private String ruc;

@Column(name = "company_name" , length = 100 , nullable = false)
private String companyName;

@Column(name = "type" )
private String type;

@Column(name="activity_economic" ,length=400)
private String activityEconomic;

@Column(name="type_billing" , nullable = false , length = 100)
private String typeBilling ; 

    
}
