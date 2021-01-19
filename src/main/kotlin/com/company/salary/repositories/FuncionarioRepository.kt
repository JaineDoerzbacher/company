package com.company.salary.repositories

import com.company.salary.entities.Funcionario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface FuncionarioRepository: JpaRepository<Funcionario, Long> {
}