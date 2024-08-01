package com.stock.GestionStock.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Client ")
public class Client extends AbstractEntity{

    @Column(name = "nom")
    private String nom ;

    @Column(name = "prenom")
    private String prenom ;

    @Embedded
    private Adresse Adresse;

    @Column(name = "NumTel")
    private String NumTel ;

    @Column(name = "mail")
    private String mail ;

    @Column(name = "photo")
    private String photo ;

    @Column(name = "idEntreprise")
    private Integer idEntreprise ;

    @OneToMany(mappedBy = "client")
    private List<CommandeClient> commandeClients;

}
