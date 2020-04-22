package com.nanodami.springpetclinic.services.map;

import com.nanodami.springpetclinic.model.Vet;
import com.nanodami.springpetclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}
