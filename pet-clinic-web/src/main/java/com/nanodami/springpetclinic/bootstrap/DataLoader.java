package com.nanodami.springpetclinic.bootstrap;

import com.nanodami.springpetclinic.model.Owner;
import com.nanodami.springpetclinic.model.Vet;
import com.nanodami.springpetclinic.services.OwnerService;
import com.nanodami.springpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {
        Owner owner1 = new Owner();
        owner1.setFirstName("Harry");
        owner1.setLastName("Potter");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Hermione");
        owner2.setLastName("Weasley");

        ownerService.save(owner2);

        System.out.println("--- Loaded owners ---");

        Vet vet1 = new Vet();
        vet1.setFirstName("Ron");
        vet1.setLastName("Weasley");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Severus");
        vet2.setLastName("Snape");

        vetService.save(vet2);

        System.out.println("--- Loaded vets ---");

    }
}
