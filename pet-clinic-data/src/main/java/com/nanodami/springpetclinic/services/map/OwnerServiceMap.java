package com.nanodami.springpetclinic.services.map;

import com.nanodami.springpetclinic.model.Owner;
import com.nanodami.springpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String name) {
        return null;
    }
}
