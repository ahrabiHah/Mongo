package de.hah.mongo.model;

import jakarta.persistence.Entity;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Alien {

    @Id
    public Long id;
    public String name;


}
