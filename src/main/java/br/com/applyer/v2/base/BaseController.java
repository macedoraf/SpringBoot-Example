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

    @RequestMapping(path = "/{idEntity}",method = RequestMethod.DELETE)
    @CrossOrigin
    public ResponseEntity<String> deletar(@PathVariable(name = "idEntity") long idEntity) {
        boolean deletar = getService().deletar(idEntity);
        if(deletar){
            return ResponseEntity.ok("Deletado com Sucesso");
        }else{
            return ResponseEntity.ok("Não foi possível realizar o delete");
        }


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
