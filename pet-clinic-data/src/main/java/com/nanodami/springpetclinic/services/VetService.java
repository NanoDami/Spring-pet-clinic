package com.nanodami.springpetclinic.services;

import com.nanodami.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Long id);

    Set<Vet> findAll();

}
