package com.stock.GestionStock.Service;

import com.stock.GestionStock.Dto.FournisseurDto;

import java.util.List;

public interface FournisseurService {

  FournisseurDto save(FournisseurDto dto);

  FournisseurDto findById(Integer id);

  List<FournisseurDto> findAll();

  void delete(Integer id);

}