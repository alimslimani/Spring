package com.alm.highfi.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Id;

import javax.persistence.*;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"name", "description", "owner"})
@ToString(of = {"name", "description", "owner"})
@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = "id")
    @Getter
    @Setter
    Integer id;

    @Column(name = "app_name", nullable = false)
    @Getter
    @Setter
    String name;

    @Column(name = "description", length = 2000)
    @Getter
    @Setter
    String description;

    @Column(name = "owner", length = 2000)
    @Getter
    @Setter
    String owner;

    @OneToOne(mappedBy = "applications")
    Ticket ticket;


    public Application(String name, String description, String owner) {
        this.name = name;
        this.description = description;
        this.owner = owner;
    }
}
