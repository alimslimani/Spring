package com.alm.highfi.conferencedemo.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"first_name", "last_name", "title", "company", "speaker_bio"})
@ToString(of = {"first_name", "last_name", "title", "company", "speaker_bio"})
@Entity(name = "speakers")
public class Speaker {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long speaker_id;

    @Getter
    @Setter
    String first_name, last_name, title, company, speaker_bio;

    @Getter
    @Setter
    @ManyToMany(mappedBy = "speakers")
    @JsonIgnore
    List<Session> sessions;

    @Getter
    @Setter
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    Byte[] speaker_photo;


}
