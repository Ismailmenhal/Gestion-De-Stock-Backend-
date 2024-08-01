package com.stock.GestionStock.Service;

import com.stock.GestionStock.Dto.VenteDto;

import java.util.List;

public interface VenteService {

  VenteDto save(VenteDto dto);

  VenteDto findById(Integer id);

  VenteDto findByCode(String code);

  List<VenteDto> findAll();

  void delete(Integer id);

}