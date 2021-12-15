package com.online.model.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Table(name = "testes")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Testes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    @NotEmpty(message = "{id.processo.obrigatorio}")
    private String nome;


}