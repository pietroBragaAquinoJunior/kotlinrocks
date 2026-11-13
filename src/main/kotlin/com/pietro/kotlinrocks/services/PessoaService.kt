package com.pietro.kotlinrocks.services

import com.pietro.kotlinrocks.repositories.PessoaRepository
import com.pietro.kotlinrocks.views.PessoaView
import org.springframework.stereotype.Service

@Service
class PessoaService(
    var pessoaRepository: PessoaRepository
){
    fun findPessoaViewByName(name:String):List<PessoaView>{
        return pessoaRepository.findByName(name,PessoaView::class.java)
    }
}