package pe.edu.utp.CriolloYPunto.model;

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
@Table(name = "menu_category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuCategory {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "menu_category_id")
  private Integer menuCategoryId;

  @Column(name = "name", unique = true, nullable = false)
  private String name;
}
