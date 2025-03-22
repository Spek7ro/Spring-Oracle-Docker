package com.springoracle.code.app.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@EqualsAndHashCode(callSuper=false)
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "TBL_ESTUDIANTE")
public class Estudiante {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqEstudiantes")
    @SequenceGenerator(name = "seqEstudiantes", allocationSize = 1, sequenceName = "SEQ_ESTUDIANTES")
    @Builder.Default
    private Long id=0L;
    @NotNull
    @NotBlank
    private String nombres;
    @NotNull
    @NotBlank
    private String apellidos;
    private Integer edad;
    @NotBlank(message = "Direccion es requerida")
    @Size(min = 5, max = 50)
    private String direccion;
    private String ciudad;
    private String pais;
}
