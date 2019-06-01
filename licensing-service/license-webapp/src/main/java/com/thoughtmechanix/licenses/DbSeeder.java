package com.thoughtmechanix.licenses;

import com.thoughtmechanix.licenses.model.License;
import com.thoughtmechanix.licenses.repository.LicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

// This interface provides access to application arguments as string array.
// Let's see the example code for more clarity.
@Component
public class DbSeeder implements CommandLineRunner {

    private LicenseRepository repository;

    @Autowired
    public DbSeeder(LicenseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        License license = License.builder().licenseId("1")
                         .organizationId("1")
                         .productName("TV")
                         .licenseType("I dont know")
                         .licenseAllocated(1)
                         .licenseMax(20)
                         .build();

        License license2 = License.builder().licenseId("2")
                .organizationId("2")
                .productName("PC")
                .licenseType("I dont know")
                .licenseAllocated(2)
                .licenseMax(30)
                .build();

        this.repository.deleteAll();
        List<License> licenses = Arrays.asList(license,license);
        licenses.forEach(h -> this.repository.save(h));
    }
}