package com.integracaobackend.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "line")
@Getter
@Setter
@NoArgsConstructor
public  class Line {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name", length = 50, nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "line",cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.LAZY)
    private List<Category> categories = new ArrayList<>();
}
