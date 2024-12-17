package com.nextrad.vietphucstore.repositories;

import com.nextrad.vietphucstore.entities.ProductCollection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductCollectionRepository extends JpaRepository<ProductCollection, UUID> {
}