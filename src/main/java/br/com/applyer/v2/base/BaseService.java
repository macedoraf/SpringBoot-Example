package br.com.applyer.v2.base;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class BaseService<Entity> implements BaseServiceContract<Entity> {

    public abstract CrudRepository<Entity, Long> getRepository();

    @Override
    public Entity salvar(Entity entity) {
        return getRepository().save(entity);
    }

    @Override
    public Entity atualizar(long id, Entity entity) {
        if(getRepository().existsById(id)){
            return salvar(entity);
        }

        throw new EntityNotFoundException();



    }

    @Override
    public boolean deletar(long id) {
        Optional<Entity> entity = buscaPeloId(id);
        if(entity.isPresent()){
            getRepository().delete(entity.get());
            return true;
        }else{
            return false;
        }

    }

    @Override
    public List<Entity> listarTodos() {
        final List<Entity> list = new ArrayList<>();
        getRepository().findAll().forEach(list::add);
        return list;
    }

    @Override
    public Optional<Entity> buscaPeloId(long id) {
        return getRepository().findById(id);
    }


}
