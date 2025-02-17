package com.stock.control.service;

import com.stock.control.entities.Sale;

import java.util.List;
import java.util.Optional;

public interface SaleService {

    List<Sale> findAll();

    Optional<Sale> findById(Long id);

    Sale save(Sale product);

    Optional<Sale> update(Long id, Sale product);

    void deleteById(Long id);
}
