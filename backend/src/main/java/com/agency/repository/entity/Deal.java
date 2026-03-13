package com.agency.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "deals")
public class Deal extends BaseEntity {

    @ManyToOne
    private Property property;

    @ManyToOne
    private Client client;

    @ManyToOne
    private AgencyUser agent;

    @Enumerated(EnumType.STRING)
    private DealType type;

    @Enumerated(EnumType.STRING)
    private DealStatus status;

    private BigDecimal agreedPrice;
}
