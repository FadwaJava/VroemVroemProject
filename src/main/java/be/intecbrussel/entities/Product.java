package be.intecbrussel.entities;

import javax.persistence.*;

@Entity
@Table(name ="products")
public class Product {
    @Id
    private String productCode;
    private String productName;

    @ManyToOne
    @JoinColumn(name = "productLine")
    private ProductLine productLine;



}
