package com.adityapatil.ecommerce.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adityapatil.ecommerce.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
