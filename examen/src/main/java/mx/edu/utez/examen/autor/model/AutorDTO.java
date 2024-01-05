package mx.edu.utez.examen.autor.model;

import lombok.Data;

@Data
public class AutorDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String curp;
    private String fechaNac;
}
