package br.univille.dacs2020.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.dacs2020.model.Paciente;
import br.univille.dacs2020.service.PacienteService;

@RestController
@RequestMapping("/api/paciente")
public class PacienteControllerAPI {
    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity<List <Paciente>> getAll(){
        List<Paciente> lista = service.getAll();
        return new ResponseEntity<List<Paciente>>(lista,HttpStatus.OK);
    }

}