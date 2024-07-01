package com.condominio.ateus.model.service;

import com.condominio.ateus.model.dto.CondominioDTO;
import com.condominio.ateus.model.entities.Condominio;
import com.condominio.ateus.model.repository.CondominioRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CondominioService {

    @Autowired
    CondominioRepository repository;

    public Condominio cadastrarCondominio(@RequestBody Condominio condominio) {
        Condominio novoCondominio = new Condominio();
        BeanUtils.copyProperties(condominio, novoCondominio);
        return repository.save(novoCondominio);
    }

    public List<CondominioDTO> listarCondominios() {

        List<Condominio> condominios = repository.findAll();
        List<CondominioDTO> condominioDTOs = new ArrayList<>();
        for (Condominio condominio : condominios) {
            CondominioDTO condominioDTO = new CondominioDTO();
            BeanUtils.copyProperties(condominio, condominioDTO);
            condominioDTOs.add(condominioDTO);
        }
        return condominioDTOs;
    }


}
