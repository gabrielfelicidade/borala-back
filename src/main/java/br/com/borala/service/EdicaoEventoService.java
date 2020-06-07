package br.com.borala.service;

import br.com.borala.model.EdicaoEvento;
import br.com.borala.repository.EdicaoEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EdicaoEventoService {

    private EdicaoEventoRepository edicaoEventoRepository;

    @Autowired
    public EdicaoEventoService(EdicaoEventoRepository edicaoEventoRepository) {
        this.edicaoEventoRepository = edicaoEventoRepository;
    }

    public EdicaoEvento saveEdicaoEvento(EdicaoEvento edicaoEvento) {
        return edicaoEventoRepository.save(edicaoEvento);
    }

}