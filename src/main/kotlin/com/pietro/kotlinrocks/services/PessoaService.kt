package com.pietro.kotlinrocks.services

import com.pietro.kotlinrocks.entities.PessoaEntity
import com.pietro.kotlinrocks.mappers.PessoaMapper
import com.pietro.kotlinrocks.repositories.PessoaRepository
import com.pietro.kotlinrocks.views.PessoaDto
import org.mapstruct.factory.Mappers
import org.springframework.stereotype.Service

@Service
class PessoaService(
    var pessoaRepository: PessoaRepository
){
    fun findPessoaViewByName(name:String):List<PessoaDto>{
        val pessoaMapper: PessoaMapper = Mappers.getMapper(PessoaMapper::class.java)
        val pessoaEntityList : List<PessoaEntity> = pessoaRepository.findByName(name, PessoaEntity::class.java)
        return pessoaEntityList.stream().map(pessoaMapper::toDto).toList()
    }
}