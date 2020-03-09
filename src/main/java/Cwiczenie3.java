import entity.KategoriaProduktu;
import entity.Produkt;
import org.hibernate.Session;

public class Cwiczenie3 {
    public static void main(String[] args) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Produkt produktDB=session.createQuery("from Produkt where id=:id",Produkt.class).setParameter("id",1L).getSingleResult();
        KategoriaProduktu kategoriaDB=session.find(KategoriaProduktu.class, 2L);
        produktDB.setKategoriaProduktu(kategoriaDB);
        session.getTransaction().commit();
        session.close();
    }
}
