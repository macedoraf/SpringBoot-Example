package br.com.applyer.v2.base;

import java.util.List;
import java.util.Optional;

public interface BaseServiceContract<Entity> {
    Entity salvar(Entity entity);

    Entity atualizar(long id,Entity entity);

    boolean deletar(long id);

    List<Entity> listarTodos();

    Optional<Entity> buscaPeloId(long id);
}
