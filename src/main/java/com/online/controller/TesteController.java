package com.online.controller;

import com.online.model.entity.Testes;
import com.online.repository.TestesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/testes")
@CrossOrigin("http://localhost:4200")
public class TesteController {

    private final TestesRepository testesRepository;

    @Autowired
    public TesteController(TestesRepository testesRepository) {
        this.testesRepository = testesRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Testes salvar(@RequestBody @Valid Testes testes){
      return testesRepository.save(testes);
    }

    @GetMapping("{id}")
    public Testes listarPorId(@PathVariable Integer id){
        return testesRepository
                .findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping("todos")
    public List<Testes> listarTodos(){
        return testesRepository.findAll();
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void DeletarPorId(@PathVariable Integer id){
        testesRepository
                .findById(id)
                .map(testes -> {
                    testesRepository.delete(testes);
                    return Void.TYPE;
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Id Não Encontrado"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody Testes atualizarTeste){

        testesRepository
                .findById(id)
                .map(testes -> {
                    atualizarTeste.setId(testes.getId());
                    return testesRepository.save(atualizarTeste);
                })
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Id Não Encontrado"));
    }


}
