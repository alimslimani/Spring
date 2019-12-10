package com.alm.highfi.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Id;

import javax.persistence.*;
import java.util.Set;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"description", "status", "title"})
@ToString(of = {"description", "status", "title"})
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    Integer id;

    @Getter
    @Setter
    String description, status, title;

    @Getter
    @Setter
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @MapsId
    private Application applications;

    public Ticket(String description, String status, String title) {
        this.description = description;
        this.status = status;
        this.title = title;
    }
}
