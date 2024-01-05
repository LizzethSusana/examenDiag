package mx.edu.utez.examen.autor.control;

import mx.edu.utez.examen.autor.model.Autor;
import mx.edu.utez.examen.autor.model.AutorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class AutorController {
    private final AutorService service;

    @Autowired
    public AutorController(AutorService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Autor> findAll(){
        return service.listar();
    }

    @GetMapping("/findById/{id}")
    public Optional<Autor> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping("/save")
    public Autor save(@RequestBody AutorDTO dto){
        return service.save(dto);
    }

    @PutMapping("/update")
    public Autor update(@RequestBody AutorDTO dto){
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
