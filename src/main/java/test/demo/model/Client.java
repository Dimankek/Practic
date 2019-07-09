package test.demo.model;


import java.util.Date;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "clients")
@NamedQuery(name = "Clent.getAll", query = "SELECT c from Client c")

    public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idCar;
    private long idManager;

    @Column(name = "surnameClient", length = 32)
    private String surnameClient;      //фамилия
    @Column(name = "nameClient", length = 32)
    private String nameClient;      //имя
    @Column(name = "lastnameClient", length = 32)
    private String lastnameClient;      //отчество




    public Client(String surnameClient ,String nameClient ,String lastnameClient) {
        this.surnameClient = surnameClient;
        this.nameClient = nameClient;
        this.lastnameClient = lastnameClient;
    }

    public Client() {
    }

    public String getsurnameClient() {
        return surnameClient;
    }

    public void setsurnameClient(String surnameClient) {
        this.surnameClient = surnameClient;
    }

    public String getnameClient() {
        return nameClient;
    }

    public void setnameClient(String nameClient) {
        this.nameClient = nameClient;
    }
    public String getlastnameClient() {
        return lastnameClient;
    }

    public void setlastnameClient(String lastnameClient) {
        this.lastnameClient = lastnameClient;
    }

    public long getIdC() {
        return idCar;
    }
    public long getIdM() {
        return idManager;
    }

    @Override
    public String toString() {
        return "Client{" +
                "idCar=" + idCar +
                ", surname='" + surnameClient +
                ", name=" + nameClient +
                ", lastname=" + lastnameClient +'\'' +
                "idCar=" + idManager +
                '}';
    }
}