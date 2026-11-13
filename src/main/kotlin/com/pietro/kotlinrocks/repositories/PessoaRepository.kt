package com.pietro.kotlinrocks.repositories

import com.pietro.kotlinrocks.entities.PessoaEntity
import org.springframework.data.jpa.repository.JpaRepository

// https://protsenko.dev/spring-data-jpa-with-kotlin-best-practices-for-spring-boot/#h-spring-data-jpa-projections-in-kotlin

interface PessoaRepository : JpaRepository<PessoaEntity, Long> {
    fun <T> findByName(name: String, type: Class<T>): List<T>
}

// CHAMA DESSA FORMA:

// Interface-based projection - SQL fetches only declared columns
// val summaries = repo.findByName("Piêtro", CompanySummaryView::class.java)
// DTO (data class) - selects only DTO constructor properties; no interface proxy
// val items = repo.findByName("Piêtro", CompanySummaryDto::class.java)
// Full entity - all columns fetched
// val entities = repo.findByName("Piêtro", Company::class.java)