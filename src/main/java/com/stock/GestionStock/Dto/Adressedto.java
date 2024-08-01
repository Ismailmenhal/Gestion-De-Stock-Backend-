package com.stock.GestionStock.Dto;

import com.stock.GestionStock.Model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Adressedto {
    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;
    public static Adressedto fromEntity(Adresse adresse) {
        if (adresse == null) {
            return null;
        }

        return Adressedto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .codePostale(adresse.getCodePostale())
                .ville(adresse.getVille())
                .pays(adresse.getPays())
                .build();
    }

    public static Adresse toEntity(Adressedto adresseDto) {
        if (adresseDto == null) {
            return null;
        }
        Adresse adresse = new Adresse();
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setVille(adresseDto.getVille());
        adresse.setPays(adresseDto.getPays());
        return adresse;
    }
}
