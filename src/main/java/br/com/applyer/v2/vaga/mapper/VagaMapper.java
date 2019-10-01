package br.com.applyer.v2.vaga.mapper;

import br.com.applyer.v2.vaga.dto.VagaDTO;
import br.com.applyer.v2.vaga.entity.Vaga;

@Mapper(componentModel = "spring")
public interface VagaMapper extends EntityMapper<VagaDTO, Vaga> {
}