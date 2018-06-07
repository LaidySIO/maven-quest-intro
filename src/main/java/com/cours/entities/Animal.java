/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.entities;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elhad
 */
public class Animal  {
    protected int idAnimal;
    protected String nom;
    protected double poid;
    protected Date dateNaissance;
    protected String couleur;
    protected int nombrePattes;
    protected boolean estCarnivore;
    protected final DecimalFormat df = new DecimalFormat("#.#"); // Arrondir à 1 chriffre apres la virgule

    public Animal(int idAnimal, String nom, double poid, String dateNaissanceString, String couleur, int nombrePattes, boolean estCarnivore) {
        SimpleDateFormat formatterDMY = new SimpleDateFormat("dd/MM/yyyy");
        
        this.idAnimal = idAnimal;
        this.nom = nom;
        this.poid = poid;
        this.couleur = couleur;
        this.nombrePattes = nombrePattes;
        this.estCarnivore = estCarnivore;
        try{
            this.dateNaissance = formatterDMY.parse(dateNaissanceString);
        } catch (ParseException ex) {
            Logger.getLogger(Animal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void marcher() {
        System.out.println("L'animal " + this.nom + " marche avec " + this.nombrePattes + " pattes.");
    }
    
    public void description() {
        String description;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        
        description = String.format("L'animal %s est né le %tD, il pèse %skg,il est de couleur %s, il a %d pattes ",
                this.nom, this.dateNaissance, df.format(this.poid), this.couleur, this.nombrePattes);
        if (estCarnivore) {
            description += "il est carnivore.";
        }
        else {
            description += "il n'est pas carnivore.";
        }
        System.out.println(description);
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPoid() {
        return poid;
    }

    public void setPoid(double poid) {
        this.poid = poid;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNombrePattes() {
        return nombrePattes;
    }

    public void setNombrePattes(int nombrePattes) {
        this.nombrePattes = nombrePattes;
    }

    public boolean isEstCarnivore() {
        return estCarnivore;
    }

    public void setEstCarnivore(boolean estCarnivore) {
        this.estCarnivore = estCarnivore;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.idAnimal;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.idAnimal != other.idAnimal) {
            return false;
        }
        return true;
    }
        
    @Override
    public String toString() {
        return "Animal{" + "idAnimal=" + idAnimal + ",\nnom=" + nom + ",\npoid=" + df.format(poid) + ",\ndateNaissance=" + 
                dateNaissance + ",\ncouleur=" + couleur + ",\nnombrePattes=" + nombrePattes + ",\nestCarnivore=" + estCarnivore + '}';
    }
    
    
    
}
