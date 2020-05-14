
package Controller;

import Model.Registration;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author asoka
 */
public class RegistrationController {
    public void insert(Registration registration){
    Session ss = NewHibernateUtil.getSessionFactory().openSession();
    ss.beginTransaction();
    ss.save(registration);
    ss.getTransaction().commit();
    ss.close();
 } 
    public List<Registration> listrecords(){
         Session ss = NewHibernateUtil.getSessionFactory().openSession();
         Query q = ss.createQuery("from Registration");
         List<Registration> lst = q.list();
         ss.close();
         return lst;
     }
}

