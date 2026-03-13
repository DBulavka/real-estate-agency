package com.agency.controller;

import com.agency.controller.mapper.DealDtoMapper;
import com.agency.dto.DealDto;
import com.agency.service.DealService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deals")
@RequiredArgsConstructor
public class DealController {

    private final DealService service;
    private final DealDtoMapper mapper;

    @GetMapping
    public List<DealDto> findAll() {
        return service.findAll().stream().map(mapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public DealDto findById(@PathVariable Long id) {
        return mapper.toDto(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public DealDto create(@RequestBody DealDto dto) {
        return mapper.toDto(service.create(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public DealDto update(@PathVariable Long id, @RequestBody DealDto dto) {
        return mapper.toDto(service.update(id, mapper.toModel(dto)));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
