package br.com.applyer.v2.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public abstract class BaseController<Entity> {

    public abstract BaseServiceContract<Entity> getService();

    @PostMapping
    @CrossOrigin
    public ResponseEntity<Entity> cadastrar(@RequestBody Entity entity) {
        return ResponseEntity.ok(getService().salvar(entity));

    }

    @DeleteMapping(path = "/{id}")
    @CrossOrigin
    public void deletar(@PathVariable(name = "id") long id) {
        ResponseEntity.ok(getService().deletar(id));

    }


    @GetMapping(path = "/{id}")
    @CrossOrigin
    public ResponseEntity<Entity> buscar(@PathVariable(name = "id") long id) {
        Optional<Entity> entity = getService().buscaPeloId(id);
        if (entity.isPresent()) {
            return ResponseEntity.ok(entity.get());
        }
        return ResponseEntity.of(entity);

    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<List<Entity>> listar() {
        return ResponseEntity.ok(getService().listarTodos());
    }
}
