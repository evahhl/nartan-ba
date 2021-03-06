package com.nartan.ba.resource.model.mappers;

import javax.persistence.*;

/**
 * Persistent zip code entity with JPA markup. Zip Codes are stored in an H2 relational database.
 *
 * @author Eva Hernandez
 */
@Entity
@Table(name = "zip_code")
public class ZipCode extends DateBase {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    protected int id;

    @Column(name = "zip_code", nullable = false)
    protected String zipCode;

    @Column(name = "neighborhood", nullable = false)
    protected String neighborhood;

    @Column(name = "status", nullable = false)
    protected int status;

    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private City city;

    @OneToOne
    @JoinColumn(name = "state_id", referencedColumnName = "id", nullable = false)
    private State state;

    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    private Country country;

    public ZipCode() {
    }

    public int getId() {
        return id;
    }

    public void setId(int zipCodeId) {
        this.id = id;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public City getMunicipality() {
        return city;
    }

    public void setMunicipality(City city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "ZipCode [id=" + id + ", zipCode=" + zipCode + ", neighborhood="
                + neighborhood
                + ", city=" + city + ", state=" + state + ", country=" + country
                + ", status=" + status + ", creationTime=" + getCreationTime() + ", modificationTime=" + getModificationTime()
                + "]";
    }

}

    