package com.example.Ejercico3;

import jakarta.persistence.*;


@Entity
@Table(name = "coches")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "manufacturer")
    private String fabricante;
    @Column(name = "model")
    private String model;
    @Column(name = "`year`")
    private Integer year;

    public Coche() {
    }

    public Coche(Long id, String fabricante, String model, Integer year) {
        this.id = id;
        this.fabricante = fabricante;
        this.model = model;
        this.year = year;
    }

// getter y setter

    public Coche(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", fabricante='" + fabricante + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
