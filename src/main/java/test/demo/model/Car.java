package test.demo.model;


import java.util.Date;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cars")
@NamedQuery(name = "Car.getAll", query = "SELECT c from Car c")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCar;

    @Column(name = "nameCar", length = 32)
    private String NameCar;      //Название авто
    @Column(name = "modelCar", length = 32)
    private String ModelCar;      //Название авто


    public Car(String NameCar,String ModelCar) {
        this.NameCar = NameCar;
        this.ModelCar = ModelCar;

    }

    public Car() {
    }

    public String getName() {
        return NameCar;
    }

    public void setName(String NameCar) {
        this.NameCar = NameCar;
    }
    public String getModel() {
        return NameCar;
    }

    public void setModel(String ModelCar) {
        this.ModelCar = ModelCar;
    }


    public long getId() {
        return idCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + idCar +
                ", name='" + NameCar +
                ", modelt=" + ModelCar +
                '}';
    }
}