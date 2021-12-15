package com.online.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Processo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    @NotEmpty(message = "{id.processo.obrigatorio}")
    private Integer idprocesso;


}