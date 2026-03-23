package dev.moreiradev.AprendendoSpring.Ninjas.infrastructure.entity;


import dev.moreiradev.AprendendoSpring.Missoes.infrastructure.entity.Missoes;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name= "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private Missoes missoes;



}
