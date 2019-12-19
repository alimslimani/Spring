package com.alm.highfi.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"releaseDate", "description"})
@ToString(of = {"releaseDate", "description"})
@Entity
public class Release {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    Integer id;

    @Getter
    @Setter
    String releaseDate, description;

    public Release(String releaseDate, String description) {
        this.releaseDate = releaseDate;
        this.description = description;
    }
}
