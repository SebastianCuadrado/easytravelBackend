package pe.edu.upc.easytravelapi.entities;

import javax.persistence.*;

@Entity
@Table(name = "places")
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="namePlace", length = 20, nullable = false)
    private String namePlace;
    @Column(name="descriptionPlace", length = 200, nullable = false)
    private String descriptionPlace;
    @Column(name="country", length = 20, nullable = false)
    private String country;
    @Column(name="image", nullable = false)
    private String image;

    public Place() {
    }

    public Place(int id, String namePlace, String descriptionPlace, String country, String image) {
        this.id = id;
        this.namePlace = namePlace;
        this.descriptionPlace = descriptionPlace;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public String getDescriptionPlace() {
        return descriptionPlace;
    }

    public void setDescriptionPlace(String descriptionPlace) {
        this.descriptionPlace = descriptionPlace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
