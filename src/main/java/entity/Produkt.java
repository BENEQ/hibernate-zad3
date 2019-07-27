package entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(schema = "sklep", name = "Produkt")
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_produktu")
    private Long id;
    @Column
    private String nazwa;
    @Column
    private Double cena;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_producenta")
    private Producent producent;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_kategorii")
    private KategoriaProduktu kategoriaProduktu;
    @ManyToMany(mappedBy = "produkty",cascade = CascadeType.PERSIST)
    private List<Klient> klienci;

    public Produkt() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    public Producent getProducent() {
        return producent;
    }

    public void setProducent(Producent producent) {
        this.producent = producent;
    }

    public KategoriaProduktu getKategoriaProduktu() {
        return kategoriaProduktu;
    }

    public void setKategoriaProduktu(KategoriaProduktu kategoriaProduktu) {
        this.kategoriaProduktu = kategoriaProduktu;
    }

    public Produkt(String nazwa, Double cena, Producent producent, KategoriaProduktu kategoriaProduktu) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.producent = producent;
        this.kategoriaProduktu = kategoriaProduktu;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                ", producent=" + producent +
                ", kategoriaProduktu=" + kategoriaProduktu +
                '}';
    }
}
