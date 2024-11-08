package com.lucascrud.userdept.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_department")
public class Departament {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Departament() { //Construtor vazio
    }

    //agora os getters e setters (botão direito, generate...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
