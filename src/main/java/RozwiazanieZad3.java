import entity.*;
import org.hibernate.Session;

import java.util.List;

public class RozwiazanieZad3 {

    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Klient klient1 = new Klient("Jan", "Niezbedny", "123456789");
        Klient klient2 = new Klient("Adam", "Nowy", "123456781");
        Klient klient3 = new Klient("Pawel", "Adamski", "123456782" );
        Klient klient4 = new Klient("Anna", "Kowalska", "123456222");
        Klient klient5 = new Klient("Kasia", "Nowak", "123453333");

        Adres adres1 = new Adres("Gdanska", "2", "13", "80-131", "Gdansk",klient1);
        Adres adres2 = new Adres("Dluga", "21", "6", "80-561", "Gdansk",klient2);
        Adres adres3 = new Adres("Wiejska", "2a", "23", "86-541", "Sopot",klient3);
        Adres adres4 = new Adres("Polnocna", "5", "3", "83-131", "Gdynia",klient4);
        Adres adres5 = new Adres("Grunwaldzka", "3", "16", "80-125", "Rewa",klient5);



        KategoriaProduktu kategoria1 = new KategoriaProduktu("ksiazka techniczna");
        KategoriaProduktu kategoria2 = new KategoriaProduktu("ksiazka fantastyczna");
        KategoriaProduktu kategoria3 = new KategoriaProduktu("ksiazka sensacyjna");

        Producent producent1 = new Producent("Helion");
        Producent producent2 = new Producent("PWN");

        Produkt produkt1 = new Produkt("ksazka techniczna1", 30.0, producent1, kategoria1);
        Produkt produkt2 = new Produkt("ksazka techniczna2", 130.0, producent1, kategoria1);
        Produkt produkt3 = new Produkt("ksazka techniczna3", 50.0, producent2, kategoria1);
        Produkt produkt4 = new Produkt("ksazka techniczna4", 90.0, producent2, kategoria1);
        Produkt produkt5 = new Produkt("ksazka fantastyczna1", 83.99, producent1, kategoria2);
        Produkt produkt6 = new Produkt("ksazka fantastyczna2", 31.0, producent2, kategoria2);
        Produkt produkt7 = new Produkt("ksazka fantastyczna3", 53.50, producent2, kategoria2);
        Produkt produkt8 = new Produkt("ksazka sensacyjna1", 32.0, producent1, kategoria3);
        Produkt produkt9 = new Produkt("ksazka sensacyjna2", 40.0, producent1, kategoria3);
        Produkt produkt10 = new Produkt("ksazka sensacyjna3", 30.0, producent1, kategoria3);

        klient1.getProdukty().add(produkt1);
        klient1.getProdukty().add(produkt2);
        klient1.getProdukty().add(produkt3);
        klient1.getProdukty().add(produkt4);

        klient2.getProdukty().add(produkt1);
        klient2.getProdukty().add(produkt2);
        klient2.getProdukty().add(produkt3);
        klient2.getProdukty().add(produkt4);

        klient3.getProdukty().add(produkt1);
        klient3.getProdukty().add(produkt2);
        klient3.getProdukty().add(produkt3);
        klient3.getProdukty().add(produkt4);

        klient4.getProdukty().add(produkt1);
        klient4.getProdukty().add(produkt2);
        klient4.getProdukty().add(produkt3);
        klient4.getProdukty().add(produkt4);

        session.persist(adres1);
        session.persist(adres2);
        session.persist(adres3);
        session.persist(adres4);
        session.persist(adres5);

        session.flush();
        session.close();
    }
}
