package com.pieropan.analisecredito.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proposal {
    private Long id;

    private Double requestedAmount;

    private Integer paymentTerm;

    private Boolean approved;

    private Boolean integrated;

    private String observation;

    private User user;
}
