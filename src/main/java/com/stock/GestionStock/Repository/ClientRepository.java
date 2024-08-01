package com.stock.GestionStock.Repository;

import com.stock.GestionStock.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}