package mx.edu.utez.examen.autor.control;

import mx.edu.utez.examen.autor.model.Autor;
import mx.edu.utez.examen.autor.model.AutorDTO;
import mx.edu.utez.examen.autor.model.AutorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    private final AutorRepository repository;
    ModelMapper mapper = new ModelMapper();

    @Autowired
    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public List<Autor> listar(){
        return repository.findAll();
    }

    public Optional<Autor> findById(long id){
        return repository.findById(id);
    }

    public Autor save(AutorDTO dto){
        Autor autor = mapper.map(dto,Autor.class);
        autor=repository.saveAndFlush(autor);
        return autor;
    }

    public Autor update(AutorDTO dto){
        Optional<Autor> optional = repository.findById(dto.getId());
        Autor autor = optional.get();
        autor = mapper.map(dto,Autor.class);
        autor=repository.saveAndFlush(autor);
        return autor;
    }

    public void delete(long id){
        Optional<Autor> optional = repository.findById(id);
        if(optional.isPresent()){
            Autor autor = optional.get();
            repository.delete(autor);
        }
    }
}
