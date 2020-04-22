package com.nanodami.springpetclinic.bootstrap;

import com.nanodami.springpetclinic.model.Owner;
import com.nanodami.springpetclinic.model.Vet;
import com.nanodami.springpetclinic.services.OwnerService;
import com.nanodami.springpetclinic.services.VetService;
import com.nanodami.springpetclinic.services.map.OwnerServiceMap;
import com.nanodami.springpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Harry");
        owner1.setLastName("Potter");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Hermione");
        owner2.setLastName("Weasley");

        ownerService.save(owner2);

        System.out.println("--- Loaded owners ---");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Ron");
        vet1.setLastName("Weasley");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Severus");
        vet2.setLastName("Snape");

        vetService.save(vet2);

        System.out.println("--- Loaded vets ---");

    }
}
