import entity.KategoriaProduktu;
import org.hibernate.Session;

public class Cwiczenie2 {
    public static void main(String[] args) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        KategoriaProduktu kategoriaDB=session.find(KategoriaProduktu.class, 1L);
        kategoriaDB.setNazwa("nowa nazwa kategorii");
        session.getTransaction().commit();
        session.close();
    }
}
