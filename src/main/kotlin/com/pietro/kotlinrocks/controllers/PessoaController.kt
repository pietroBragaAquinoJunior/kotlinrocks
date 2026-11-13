package com.pietro.kotlinrocks.controllers

import com.pietro.kotlinrocks.services.PessoaService
import com.pietro.kotlinrocks.views.PessoaDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/pessoa")
class PessoaController(
    var pessoaService: PessoaService
){

    @GetMapping
    fun teste():List<PessoaDto>{
        return pessoaService.findPessoaViewByName("Piêtro")
    }

}