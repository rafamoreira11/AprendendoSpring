package dev.moreiradev.AprendendoSpring.Missoes.infrastructure.entity;

import dev.moreiradev.AprendendoSpring.Ninjas.infrastructure.entity.Ninja;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Missoes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private char dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<Ninja> ninja;


}
