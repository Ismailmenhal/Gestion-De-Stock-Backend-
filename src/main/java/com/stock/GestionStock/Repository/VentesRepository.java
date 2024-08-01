package com.stock.GestionStock.Repository;

import com.stock.GestionStock.Model.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VentesRepository extends JpaRepository<Vente, Integer> {

  Optional<Vente> findVentesByCode(String code);
}