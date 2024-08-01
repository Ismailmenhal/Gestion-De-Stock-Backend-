package com.stock.GestionStock.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = " Category ")
public class Category extends AbstractEntity {

    @Column(name = "code")
    private String code ;

    @Column(name = "designation")
    private String designation ;

    @OneToMany(mappedBy = "category")
    private List<Article> articles ;

    @Column(name = "idEntreprise")
    private Integer idEntreprise ;


}
