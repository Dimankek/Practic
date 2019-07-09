package test.demo.controller;
import javax.persistence.EntityManager;
import test.demo.model.SpareParts;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
public class SparePartsService {

    public EntityManager em = Persistence.createEntityManagerFactory("COLIBRI").createEntityManager();

    public SpareParts add(SpareParts spareParts){
        em.getTransaction().begin();
        SpareParts sparePartsFromDB = em.merge(spareParts);
        em.getTransaction().commit();
        return sparePartsFromDB;
    }

    public void delete(long id){
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public SpareParts get(long id){
        return em.find(SpareParts.class, id);
    }

    public void update(SpareParts spareParts){
        em.getTransaction().begin();
        em.merge(spareParts);
        em.getTransaction().commit();
    }

    public List<SpareParts> getAll(){
        TypedQuery<SpareParts> namedQuery = em.createNamedQuery("SpareParts.getAll", SpareParts.class);
        return namedQuery.getResultList();
    }

}