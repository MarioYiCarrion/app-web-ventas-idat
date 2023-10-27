package pe.edu.idat.appwebventasidat.model.bd;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ProductID;

    @Column(name="ProductName")
    private String ProductName;

    @Column(name="contactitle")
    private Integer contacTitle;

    @Column(name="QuantityPerUnit")
    private String QuantityPerUnit;

    @Column(name="UnitPrice")
    private Double UnitPrice;

    @Column(name="UnitsInStock")
    private Integer UnitsInStock;

    @Column(name="UnitsOnOrder")
    private Integer UnitsOnOrder;

    @Column(name="ReorderLevel")
    private Integer ReorderLevel;

    @Column(name="Discontinued")
    private Boolean Discontinued;

    @ManyToOne
    @JoinColumn(name = "SupplierID")
    private Supplier supplier;

    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;

}
