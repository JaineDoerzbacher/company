package com.company.salary.entities

import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "AREA")
data class Area(

    val sigla: String,
    val descricao: String
)
