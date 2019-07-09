package test.demo.model;

import javax.persistence.*;
import java.util.Date;
import test.demo.model.Car;


@Entity
@Table(name = "spareparts")
@NamedQuery(name = "spareparts.getAll", query = "SELECT c from SpareParts c")

    public class SpareParts {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idSparePart;
    private long idCar;

    @Column(name = "namesparepart", length = 32)
    private String NameSpareParts;      //Название запчасти

    @Column(name = "price")
    private float Price;       //стоимость



    public SpareParts(String NameSpareParts, float Price) {
        this.NameSpareParts = NameSpareParts;
        this.Price = Price;
    }

    public SpareParts() {
    }

    public String getNameSpareParts() {
        return NameSpareParts;
    }

    public void setNameSpareParts(String NameSpareParts) {
        this.NameSpareParts = NameSpareParts;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public long getIdS() {
        return idSparePart;
    }
    public long getIdC() {
        return idCar;
    }


    @Override
    public String toString() {
        return "SpareParts{" +
                "idSparePart=" + idSparePart +
                ", namespareparts='" + NameSpareParts +
                ", price=" + Price +'\'' +
                "idCar=" + idCar +
                '}';
    }
}