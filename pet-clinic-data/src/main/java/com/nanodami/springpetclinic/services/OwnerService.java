package com.nanodami.springpetclinic.services;

import com.nanodami.springpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String name);

}
