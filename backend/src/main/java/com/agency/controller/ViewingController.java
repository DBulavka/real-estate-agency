package com.agency.controller;

import com.agency.controller.mapper.ViewingDtoMapper;
import com.agency.dto.ViewingDto;
import com.agency.service.ViewingService;
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
@RequestMapping("/api/viewings")
@RequiredArgsConstructor
public class ViewingController {

    private final ViewingService service;
    private final ViewingDtoMapper mapper;

    @GetMapping
    public List<ViewingDto> findAll() {
        return service.findAll().stream().map(mapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public ViewingDto findById(@PathVariable Long id) {
        return mapper.toDto(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ViewingDto create(@RequestBody ViewingDto dto) {
        return mapper.toDto(service.create(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public ViewingDto update(@PathVariable Long id, @RequestBody ViewingDto dto) {
        return mapper.toDto(service.update(id, mapper.toModel(dto)));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
