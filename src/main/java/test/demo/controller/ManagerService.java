package test.demo.controller;
import javax.persistence.EntityManager;
import test.demo.model.Manager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ManagerService {


    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();

    public Manager add(Manager manager){
        em.getTransaction().begin();
        Manager managerFromDB = em.merge(manager);
        em.getTransaction().commit();
        return managerFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public Manager get(long id){
        return em.find(Manager.class, id);
    }

    public void update(Manager manager){
        em.getTransaction().begin();
        em.merge(manager);
        em.getTransaction().commit();
    }

    public List<Manager> getAll(){
        TypedQuery<Manager> namedQuery = em.createNamedQuery("Manager.getAll", Manager.class);
        return namedQuery.getResultList();
    }

}