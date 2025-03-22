package com.springoracle.code.app.service;

import com.springoracle.code.app.model.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteService {

    public List<Estudiante> findEstudianteAll();
    public Estudiante createEstudiante(Estudiante estudiante);
    public Estudiante updateEstudiante(Estudiante estudiante);
    public void deleteEstudiante(Long id);
    public Optional<Estudiante> getEstudiante(Long id);

}
