package com.company.salary.entities

import javax.persistence.*

@Entity
@Table(name = "FUNCIONARIO")
data class Funcionario(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val nome: String,
    val sobrenome: String,
    val area:
    val salario: Double
)
