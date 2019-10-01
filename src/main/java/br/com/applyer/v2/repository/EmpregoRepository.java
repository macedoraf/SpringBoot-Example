package br.com.applyer.v2.repository;

import br.com.applyer.v2.base.entity.Emprego;
import org.springframework.data.repository.CrudRepository;

public interface EmpregoRepository extends CrudRepository<Emprego, Long> {
}
