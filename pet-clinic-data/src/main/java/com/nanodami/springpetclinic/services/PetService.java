package com.nanodami.springpetclinic.services;

import com.nanodami.springpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Long id);

    Set<Pet> findAll();
}
