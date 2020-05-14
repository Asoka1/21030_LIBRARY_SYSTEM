
package Controller;

import static Controller.NewHibernateUtil.getSessionFactory;
import Model.BookCategory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author asoka
 */
public class BookCategoryController {
    public void insert(BookCategory bookcategory){
    Session ss = getSessionFactory().openSession();
    ss.beginTransaction();
    ss.save(bookcategory);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void update(BookCategory bookcategory){
    Session ss = getSessionFactory().openSession();
    ss.beginTransaction();
    ss.update(bookcategory);
    ss.getTransaction().commit();
    ss.close();
 } 
 public void delete(BookCategory bookcategory){
    Session ss = getSessionFactory().openSession();
    ss.beginTransaction();
    ss.delete(bookcategory);
    ss.getTransaction().commit();
    ss.close();
 } 
  public List<BookCategory> listBookCategory(){
         Session ss = getSessionFactory().openSession();
         Query q = ss.createQuery("from BookCategory");
         List<BookCategory> lst = q.list();
         ss.close();
         return lst;
     }
}
