package com.condominio.ateus.controller;

import com.condominio.ateus.model.dto.CondominioDTO;
import com.condominio.ateus.model.entities.Condominio;
import com.condominio.ateus.model.repository.CondominioRepository;
import com.condominio.ateus.model.service.CondominioService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/condominio")
public class CondominioController {

    @Autowired
    CondominioRepository condominioRepository;

    @Autowired
    CondominioService condominioService;

    @GetMapping
    public List<CondominioDTO> listarCondominios() {
        return condominioService.listarCondominios();
    }

    @PostMapping
    @Transactional
    public Condominio cadastrarCondominio(@RequestBody Condominio condominio) {
        return condominioService.cadastrarCondominio(condominio);
    }
}
