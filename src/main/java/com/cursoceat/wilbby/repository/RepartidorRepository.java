package com.cursoceat.wilbby.repository;

import com.cursoceat.wilbby.model.Repartidor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepartidorRepository extends JpaRepository<Repartidor, Integer> {
}// se llama a la clase del repository
