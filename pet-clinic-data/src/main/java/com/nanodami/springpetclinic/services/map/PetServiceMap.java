package com.nanodami.springpetclinic.services.map;

import com.nanodami.springpetclinic.model.Pet;
import com.nanodami.springpetclinic.services.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
}
