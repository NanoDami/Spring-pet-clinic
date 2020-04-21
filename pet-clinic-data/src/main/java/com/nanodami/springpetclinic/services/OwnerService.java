package com.nanodami.springpetclinic.services;

import com.nanodami.springpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String name);

    Owner findById(Long id);

    Owner save(Long id);

    Set<Owner> findAll();

}
