package com.pietro.kotlinrocks.mappers

import com.pietro.kotlinrocks.entities.PessoaEntity
import com.pietro.kotlinrocks.views.PessoaDto
import org.mapstruct.Mapper

@Mapper
interface PessoaMapper {

    fun toDto(pessoa: PessoaEntity): PessoaDto
    fun toEntity(pessoaDto: PessoaDto): PessoaEntity
}