package com.ecom.ecommercebackendpart.entities;
import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Category  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "category")
    private Collection<Product> products;
}
