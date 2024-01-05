package mx.edu.utez.examen.autor.model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.List;

@Entity
@Table(name = "clientes")
@Data
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",columnDefinition = "VARCHAR(50)")
    private String nombre;

    @Column(name = "apellido",columnDefinition = "VARCHAR(50)")
    private String apellido;

    @Column(name = "curp",columnDefinition = "VARCHAR(50)")
    private String curp;

    @Column(name = "fechanac",columnDefinition = "VARCHAR(50)")
    private String fechaNac;



}
