package com.pietro.kotlinrocks.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "telefone")
class TelefoneEntity {

    @Id
    var id: Long? = null

    @Column(nullable = false)
    var number: String = ""

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pessoa_id")
    var pessoa: PessoaEntity? = null
}