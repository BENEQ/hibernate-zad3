package entity;

import javax.persistence.*;

@Entity
@Table(schema = "sklep", name = "Adres")
public class Adres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adres")
    private Long id;
    @Column
    private String ulica;
    @Column(name = "nrdomu")
    private String nrDomu;
    @Column(name = "nrmieszkania")
    private String nrMieszkania;
    @Column(name = "kodpocztowy")
    private String kodPocztowy;
    @Column
    private String miejscowosc;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_klient", unique = true)
    private Klient klient;

    public Adres() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getNrDomu() {
        return nrDomu;
    }

    public void setNrDomu(String nrDomu) {
        this.nrDomu = nrDomu;
    }

    public String getNrMieszkania() {
        return nrMieszkania;
    }

    public void setNrMieszkania(String nrMieszkania) {
        this.nrMieszkania = nrMieszkania;
    }

    public String getKodPocztowy() {
        return kodPocztowy;
    }

    public void setKodPocztowy(String kodPocztowy) {
        this.kodPocztowy = kodPocztowy;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Adres(String ulica, String nrDomu, String nrMieszkania, String kodPocztowy, String miejscowosc,Klient klient) {
        this.ulica = ulica;
        this.nrDomu = nrDomu;
        this.nrMieszkania = nrMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miejscowosc = miejscowosc;
        this.klient = klient;
    }
}

