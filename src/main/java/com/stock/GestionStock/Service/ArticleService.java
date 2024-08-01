package com.stock.GestionStock.Service;

import com.stock.GestionStock.Dto.ArticleDto;
import com.stock.GestionStock.Dto.LigneCommandeClientDto;
import com.stock.GestionStock.Dto.LigneCommandeFournisseurDto;
import com.stock.GestionStock.Dto.LigneVenteDto;

import java.util.List;

public interface ArticleService {
    ArticleDto save(ArticleDto dto);

    ArticleDto findById(Integer id);

    ArticleDto findByCodeArticle(String codeArticle);

    List<ArticleDto> findAll();

    List<LigneVenteDto> findHistoriqueVentes(Integer idArticle);

    List<LigneCommandeClientDto> findHistoriaueCommandeClient(Integer idArticle);

    List<LigneCommandeFournisseurDto> findHistoriqueCommandeFournisseur(Integer idArticle);

    List<ArticleDto> findAllArticleByIdCategory(Integer idCategory);

    void delete(Integer id);
}
