package edu.pe.CNavarro.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import edu.pe.CNavarro.entity.Direccion;
import edu.pe.CNavarro.entity.Estudiante;
import edu.pe.CNavarro.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class EstudianteController {
    @Autowired
    private IEstudianteService estudianteService;

    @Autowired
    private ObjectMapper objectMapper;

    @GetMapping("/list")
    public List<Estudiante> listaEstudiantesByEscuela(@RequestParam("idescuela") Direccion iddireccion){
        List<Estudiante> estudianteList = this.estudianteService.listaEstudiantesByEscuela(iddireccion);
        return this.estudianteService.listaEstudiantesByEscuela(iddireccion);
    }

    @GetMapping("/listPorPagina")
    public Page<Estudiante> listaEstudiantesPorPagina(@RequestParam("pagina") int pagina, @RequestParam("idescuela")Direccion iddireccion){
        Pageable pageable = PageRequest.of(pagina,3);
        return this.estudianteService.listaEstudiantesPorPagina(pageable,iddireccion);
    }

    @PostMapping("/registrar")
    public String registrarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {

        Estudiante estudiante = this.objectMapper.readValue(jsonEstudiante,Estudiante.class);

        this.estudianteService.guardarEstudiante(estudiante);

        return "Se guardó correctamente";
    }

    @GetMapping("/bycodigo/{coddni}")
    public Estudiante estudianteByDni(@PathVariable("coddni") String coddni){
        return this.estudianteService.obtenerPorCodigoOrDni(coddni);
    }

    @PostMapping("/delete/{idestudiante}")
    public String eliminarEstudiante(@PathVariable("idestudiante") Long idestudiante){
        this.estudianteService.eliminarEstudiante(idestudiante);
        return "Estudiante eliminado correctamente";
    }

    @PutMapping("/update")
    public String actualizarEstudiante(@RequestBody String JsonEstudiante) throws JsonProcessingException {
        Estudiante estudiante = this.objectMapper.readValue(JsonEstudiante, Estudiante.class);

        this.estudianteService.guardarEstudiante(estudiante);

        return "Estudiante actualizado correctamente";
    }
}
