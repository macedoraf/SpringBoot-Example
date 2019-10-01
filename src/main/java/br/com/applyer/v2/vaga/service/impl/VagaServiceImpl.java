package br.com.applyer.v2.vaga.service.impl;

import br.com.applyer.v2.vaga.dao.VagaRepository;
import br.com.applyer.v2.vaga.dto.VagaDTO;
import br.com.applyer.v2.vaga.entity.Vaga;
import br.com.applyer.v2.vaga.mapper.VagaMapper;
import br.com.applyer.v2.vaga.service.VagaService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VagaServiceImpl implements VagaService {
    private VagaMapper mapper = Mappers.getMapper(VagaMapper.class);
    private final VagaRepository repository;

    public VagaServiceImpl(VagaRepository repository) {
        this.repository = repository;
    }

    @Override
    public VagaDTO save(VagaDTO dto) {
        return mapper.toDto(repository.save(mapper.toEntity(dto)));
    }

    @Override
    public void save(List<VagaDTO> dtos) {
        repository.saveAll(mapper.toEntityList(dtos));
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<VagaDTO> findById(long id) {
        Optional<Vaga> entityOptional = repository.findById(id);
        return entityOptional.map(entity -> Optional.ofNullable(mapper.toDto(entity))).orElse(null);
    }

    @Override
    public List<VagaDTO> findAll() {
        return mapper.toDtoList((List<Vaga>) repository.findAll());
    }

    @Override
    public Page<VagaDTO> findAll(Pageable pageable) {
        Page<Vaga> entityPage = repository.findAll(pageable);
        List<VagaDTO> dtos = mapper.toDtoList(entityPage.getContent());
        return new PageImpl<>(dtos, pageable, entityPage.getTotalElements());
    }

    @Override
    public VagaDTO updateById(VagaDTO dto) {
        Optional<VagaDTO> optionalDto = findById(dto.getId());
        if (optionalDto.isPresent()) {
            return save(dto);
        }
        return null;
    }
}