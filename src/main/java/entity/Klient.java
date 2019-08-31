package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "Klient")
public class Klient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_klient")
    private Long id;
    @Column
    private String imie;
    @Column
    private String nazwisko;
    @Column
    private String telefon;
    @OneToOne(mappedBy = "klient")
    private Adres adres;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @JoinTable(name = "Klinet_produkt",
            joinColumns = @JoinColumn(name = "idklineta"),
            inverseJoinColumns = @JoinColumn(name = "idproduktu"))
    private List<Produkt> produkty;

    public Klient() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public List<Produkt> getProdukty() {
        if (produkty == null) {
            produkty = new ArrayList<Produkt>();
        }
        return produkty;
    }


    public Klient(String imie, String nazwisko, String telefon) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.telefon = telefon;
    }
}
