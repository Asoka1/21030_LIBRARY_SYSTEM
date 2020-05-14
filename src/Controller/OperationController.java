
package Controller;

import java.util.List;
import Model.Operations;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author asoka
 */
public class OperationController {
       public void CreateOpe(Operations o) {
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(o);
        s.getTransaction().commit();
        s.close();
     
    }
    public List<Operations> findAll(){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
      Query q = s.createQuery("from Operations");
        List<Operations> li = q.list();
        s.close();
        return li;
    }
}
