package com.agency.controller;

import com.agency.controller.mapper.AgencyUserDtoMapper;
import com.agency.dto.AgencyUserDto;
import com.agency.service.AgencyUserService;
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
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class AgencyUserController {

    private final AgencyUserService service;
    private final AgencyUserDtoMapper mapper;

    @GetMapping
    public List<AgencyUserDto> findAll() {
        return service.findAll().stream().map(mapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public AgencyUserDto findById(@PathVariable Long id) {
        return mapper.toDto(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AgencyUserDto create(@RequestBody AgencyUserDto dto) {
        return mapper.toDto(service.create(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public AgencyUserDto update(@PathVariable Long id, @RequestBody AgencyUserDto dto) {
        return mapper.toDto(service.update(id, mapper.toModel(dto)));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
