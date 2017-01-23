/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityes;

import java.awt.List;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author MAGA
 */
public class EntityManagerTest {

  EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyPersistenceUnit");

  EntityManager em = emf.createEntityManager();
  public static ArrayList<EmpDetailsView> employees;

  public EntityManagerTest() {

  }

  public String[] runMyTest() {

    String[] es;
    em.getTransaction().begin();

    Query query = em.createNamedQuery("EmpDetailsView.findAll");

    employees = new ArrayList(query.getResultList());

    es = new String[employees.size()];
    for (int i = 0; i < employees.size(); i++) {
      es[i] = employees.get(i).getFirstName() + ", " + employees.get(i).getLastName();

    }
//    System.out.println("employees " + employees);
//    employees.stream().forEach(e -> System.out.println(
//            e.getFirstName() + ", "
//            + e.getLastName() + " | "
//            + e.getCity()));

    em.getTransaction().commit();

    em.close();

    emf.close();

    return es;

  }

}
