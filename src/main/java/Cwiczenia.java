import entity.Klient;
import entity.Produkt;
import org.hibernate.Session;

import java.util.List;

public class Cwiczenia {
    public static void main(String[] args) {
        Session session=HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Klient klientDB=session.find(Klient.class, 1L);
        Produkt produktDB=session.find(Produkt.class,5L);
        Produkt nowyProdukt = new Produkt();
        nowyProdukt.setNazwa("nowiutki produkt");
        session.persist(nowyProdukt);
        //List<Produkt> produkty = session.createNativeQuery("select * from Produkt where id_producenta=:idproducenta",Produkt.class).setParameter("idproducenta",1).getResultList();
        //klientDB.getProdukty().addAll(produkty);
        klientDB.getProdukty().add(nowyProdukt);
        session.getTransaction().commit();
        session.close();
    }
}
