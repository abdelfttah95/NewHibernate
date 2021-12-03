package src;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author abdel
 */
public class CRUD {

    public void insertBook() {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();

            Books b = new Books();
            b.setIsb(1458);

            ProBooks p = new ProBooks();
            p.setIsb(458);
            p.setLan("en");

            HeadSer h = new HeadSer();
            h.setLan("en");
            h.setPic("yes");

            se.save(b);
            se.save(p);
            se.save(h);

            se.getTransaction().commit();
        } catch (HibernateException e) {
            se.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
