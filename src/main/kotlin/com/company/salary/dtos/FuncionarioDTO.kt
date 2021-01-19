package com.company.salary.dtos

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

data class FuncionarioDTO(


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    val nome: String,
    val sobrenome: String,
    val area:
    val salario: Double

)
