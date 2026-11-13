package com.pietro.kotlinrocks.entities

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "pessoa")
class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false)
    var name: String = ""

    var email: String? = null

    @OneToMany(mappedBy = "pessoa", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    var telefones: MutableList<TelefoneEntity> = mutableListOf()

}