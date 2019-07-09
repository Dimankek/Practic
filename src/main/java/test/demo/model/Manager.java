package test.demo.model;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "managers")
@NamedQuery(name = "Manager.getAll", query = "SELECT c from Manager c")
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idManager;

    @Column(name = "surnameManager", length = 32)
    private String surnameManager;      //фамилия
    @Column(name = "nameManager", length = 32)
    private String nameManager;      //имя
    @Column(name = "lastnameManager", length = 32)
    private String lastnameManager;      //отчество

    @Column(name = "login", length = 32)
    private String login;      //логин
    @Column(name = "password", length = 32)
    private String password;      //пароль


    public Manager(String surnameManager ,String nameManager ,String lastnameManager, String login, String password) {
        this.surnameManager = surnameManager;
        this.nameManager = nameManager;
        this.lastnameManager = lastnameManager;
        this.login = login;
        this.password = password;
    }

    public Manager() {
    }

    public String getSurnameManager() {
        return surnameManager;
    }

    public void setsurnameManager(String surnameManager) {
        this.surnameManager = surnameManager;
    }

    public String getnamemanager() {
        return nameManager;
    }

    public void setnameManager(String nameManager) {
        this.nameManager = nameManager;
    }
    public String getlastnameManager() {
        return lastnameManager;
    }

    public void setlastnameManager(String lastnameManager) {
        this.lastnameManager = lastnameManager;
    }
    public String getlogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public long getId() {
        return idManager;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + idManager +
                ", surname='" + surnameManager +
                ", name=" + nameManager +
                ", lastname=" + lastnameManager +
                ", login=" + login +
                ", password=" + password +
                '}';
    }
}