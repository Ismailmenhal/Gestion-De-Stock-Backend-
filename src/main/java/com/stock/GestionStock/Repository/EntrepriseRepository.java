package com.stock.GestionStock.Repository;

import com.stock.GestionStock.Model.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Integer> {

}