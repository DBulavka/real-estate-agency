package com.agency.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.OffsetDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "viewings")
public class Viewing extends BaseEntity {

    @ManyToOne
    private Property property;

    @ManyToOne
    private Client client;

    @ManyToOne
    private AgencyUser agent;

    private OffsetDateTime scheduledAt;

    @Enumerated(EnumType.STRING)
    private ViewingStatus status;

    private String notes;
}
