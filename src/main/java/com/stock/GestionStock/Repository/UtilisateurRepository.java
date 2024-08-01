package com.stock.GestionStock.Repository;

import com.stock.GestionStock.Model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

  @Query(value = "select u from Utilisateur u where u.email = :email")
  Optional<Utilisateur> findUtilisateurByEmail(@Param("email") String email);

}