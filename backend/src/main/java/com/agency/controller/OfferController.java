package com.agency.controller;

import com.agency.controller.mapper.OfferDtoMapper;
import com.agency.dto.OfferDto;
import com.agency.service.OfferService;
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
@RequestMapping("/api/offers")
@RequiredArgsConstructor
public class OfferController {

    private final OfferService service;
    private final OfferDtoMapper mapper;

    @GetMapping
    public List<OfferDto> findAll() {
        return service.findAll().stream().map(mapper::toDto).toList();
    }

    @GetMapping("/{id}")
    public OfferDto findById(@PathVariable Long id) {
        return mapper.toDto(service.findById(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OfferDto create(@RequestBody OfferDto dto) {
        return mapper.toDto(service.create(mapper.toModel(dto)));
    }

    @PutMapping("/{id}")
    public OfferDto update(@PathVariable Long id, @RequestBody OfferDto dto) {
        return mapper.toDto(service.update(id, mapper.toModel(dto)));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
