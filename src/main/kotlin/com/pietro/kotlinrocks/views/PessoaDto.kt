package com.pietro.kotlinrocks.views

data class PessoaDto (
    val name:String,
    val email:String,
    val telefones: List<TelefoneDto>
)