package com.stock.GestionStock.Exception;

public enum ErrorCodes {

  ARTICLE_NOT_FOUND(1000),
  ARTICLE_NOT_VALID(1001),
  ARTICLE_ALREADY_IN_USE(1002),

  CATEGORY_NOT_FOUND(2000),
  CATEGORY_NOT_VALID(2001),
  CATEGORY_ALREADY_IN_USE(2002),

  CLIENT_NOT_FOUND(3000),
  CLIENT_NOT_VALID(3001),
  CLIENT_ALREADY_IN_USE(3002),

  COMMANDE_CLIENT_NOT_FOUND(4000),
  COMMANDE_CLIENT_NOT_VALID(4001),
  COMMANDE_CLIENT_NON_MODIFIABLE(4002),
  COMMANDE_CLIENT_ALREADY_IN_USE(4003),

  COMMANDE_FOURNISSEUR_NOT_FOUND(5000),
  COMMANDE_FOURNISSEUR_NOT_VALID(5001),
  COMMANDE_FOURNISSEUR_NON_MODIFIABLE(5002),
  COMMANDE_FOURNISSEUR_ALREADY_IN_USE(5003),

  ENTREPRISE_NOT_FOUND(6000),
  ENTREPRISE_NOT_VALID(6001),

  FOURNISSEUR_NOT_FOUND(7000),
  FOURNISSEUR_NOT_VALID(7001),
  FOURNISSEUR_ALREADY_IN_USE(7002),

  LIGNE_COMMANDE_CLIENT_NOT_FOUND(8000),
  LIGNE_COMMANDE_FOURNISSEUR_NOT_FOUND(9000),
  LIGNE_VENTE_NOT_FOUND(10000),

  MVT_STK_NOT_FOUND(11000),
  MVT_STK_NOT_VALID(11001),

  UTILISATEUR_NOT_FOUND(12000),
  UTILISATEUR_NOT_VALID(12001),
  UTILISATEUR_ALREADY_EXISTS(12002),
  UTILISATEUR_CHANGE_PASSWORD_OBJECT_NOT_VALID(12003),

  BAD_CREDENTIALS(12003),

  VENTE_NOT_FOUND(13000),
  VENTE_NOT_VALID(13001),
  VENTE_ALREADY_IN_USE(13002),

  // Liste des exception techniaues
  UPDATE_PHOTO_EXCEPTION(14000),
  UNKNOWN_CONTEXT(14001)
  ;

  private int code;

  ErrorCodes(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }
}