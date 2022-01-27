package com.andrei.crypto_currency_watcher.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Crypto {
    @Id
    private int id;
    private String symbol;
    private String name;
    private Double priceUsd;
}
