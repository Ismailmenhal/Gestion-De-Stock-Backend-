package com.stock.GestionStock.Model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Data


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = " LigneCommandeFournisseur")
public class LigneCommandeFournisseur extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name = "idarticle")
    private Article article;

    @ManyToOne
    @JoinColumn(name = "idcommandefournisseur")
    private CommandeFournisseur commandeFournisseur;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prixunitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "identreprise")
    private Integer idEntreprise;

}
