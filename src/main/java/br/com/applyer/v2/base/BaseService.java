package br.com.applyer.v2.base;

import org.springframework.data.repository.CrudRepository;

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
        if(getRepository().findById(id)
                .isPresent()){
            deletar(id);
        }
        return salvar(entity);

    }

    @Override
    public boolean deletar(long id) {
        Optional<Entity> entity = buscaPeloId(id);
        entity.ifPresent(value -> getRepository().delete(value));
        return true;

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
