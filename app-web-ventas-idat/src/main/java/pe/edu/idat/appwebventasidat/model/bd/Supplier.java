package pe.edu.idat.appwebventasidat.model.bd;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SupplierID;

    @Column(name = "CompanyName")
    private String CompanyName;

    @Column(name = "ContactName")
    private String ContactName;


    @Column(name = "ContactTitle")
    private String ContactTitle;

    @Column(name = "Address")
    private String Address;

    @Column(name = "City")
    private String City;

    @Column(name = "Region")
    private String Region;

    @Column(name = "PostalCode")
    private String PostalCode;

    @Column(name = "Country")
    private String Country;

    @Column(name = "Phone")
    private String Phone;

    @Column(name = "Fax")
    private String Fax;

    @Column(name = "HomePage")
    private String HomePage;
}
