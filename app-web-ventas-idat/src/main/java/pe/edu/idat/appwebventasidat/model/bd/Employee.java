package pe.edu.idat.appwebventasidat.model.bd;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer EmployeeID;

    @Column(name = "categoryname")
    private  String categoryname;

    @Column(name = "LastName")
    private  String LastName;

    @Column(name = "FirstName")
    private  String FirstName;

    @Column(name = "Title")
    private  String Title;

    @Column(name = "TitleOfCourtesy")
    private  String TitleOfCourtesy;

    @Column(name = "BirthDate")
    private  String BirthDate;

    @Column(name = "HireDate")
    private  String HireDate;

    @Column(name = "Address")
    private  String Address;

    @Column(name = "City")
    private  String City;

    @Column(name = "Region")
    private  String Region;

    @Column(name = "PostalCode")
    private  String PostalCode;

    @Column(name = "HomePhone")
    private  String HomePhone;

    @Column(name = "Extension")
    private  String Extension;

    @Column(name = "Notes")
    private  String Notes;

    @Column(name = "ReportsTo")
    private  Integer ReportsTo;

    @Column(name = "PhotoPath")
    private  String PhotoPath;

    @Column(name = "Salary")
    private Double Salary;



}
