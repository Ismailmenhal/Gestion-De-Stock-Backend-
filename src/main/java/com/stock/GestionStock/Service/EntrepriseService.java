package com.stock.GestionStock.Service;

import com.stock.GestionStock.Dto.EntrepriseDto;

import java.util.List;

public interface EntrepriseService {

  EntrepriseDto save(EntrepriseDto dto);

  EntrepriseDto findById(Integer id);

  List<EntrepriseDto> findAll();

  void delete(Integer id);

}