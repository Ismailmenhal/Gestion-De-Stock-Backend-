package com.stock.GestionStock.Repository;

import com.stock.GestionStock.Model.LigneCommandeFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Integer> {

  List<LigneCommandeFournisseur> findAllByCommandFournisseurId(Integer idCommand);

  List<LigneCommandeFournisseur> findAllByArticleId(Integer idCommand);
}