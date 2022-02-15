package com.ecom.ecommercebackendpart.entities;
import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Product implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private double currentPrice;
    private boolean promotion;
    private boolean selected;
    private boolean available;
    private String photoName;
    @ManyToOne
    private Category category;



}
