package com.willaevangelista.domainmodelorm.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_activity")
public class Activity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoria;

    @ManyToMany
    @JoinTable(name = "tb_activity_participant",
                joinColumns = @JoinColumn(name = "activity_id"),
                inverseJoinColumns = @JoinColumn(name = "participant_id"))
    private Set<Participant> participantes = new HashSet<>();

    @OneToMany(mappedBy = "atividade")
    private Set<TimeSlot> blocos = new HashSet<>();

    public Activity() {}

    public Activity(Integer id, String nome, String descricao, Double preco, Category categoria, Set<Participant> participantes, Set<TimeSlot> blocos) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.participantes = participantes;
        this.blocos = blocos;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Category getCategoria() {
        return categoria;
    }

    public void setCategoria(Category categoria) {
        this.categoria = categoria;
    }

    public Set<Participant> getParticipantes() {
        return participantes;
    }

    public Set<TimeSlot> getBlocos() {
        return blocos;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Activity activity)) return false;
        return Objects.equals(id, activity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
