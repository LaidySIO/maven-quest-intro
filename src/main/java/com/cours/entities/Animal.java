/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.entities;

import java.util.Date;

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

    public Animal(int idAnimal, String nom, double poid, Date dateNaissance, String couleur, int nombrePattes, boolean estCarnivore) {
        this.idAnimal = idAnimal;
        this.nom = nom;
        this.poid = poid;
        this.dateNaissance = dateNaissance;
        this.couleur = couleur;
        this.nombrePattes = nombrePattes;
        this.estCarnivore = estCarnivore;
    }
    
    public void marcher() {
        System.out.println("L'animal " + this.nom + " marche avec " + this.nombrePattes + " pattes.");
    }
    
    public void description() {
        String description;
        
        description = String.format("L'animal %s est né le %td, il pèse %fkg,il est de couleur %s, il a %d pattes ",
                this.nom, this.dateNaissance, this.poid, this.couleur, this.nombrePattes);
        if (estCarnivore) {
            description += "il est carnivore.";
        }
        else {
            description += "il n'est pas carnivore.";
        }
        System.out.println(description);
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
        return "Animal{" + "idAnimal=" + idAnimal + ",\nnom=" + nom + ",\npoid=" + poid + ",\ndateNaissance=" + 
                dateNaissance + ",\ncouleur=" + couleur + ",\nnombrePattes=" + nombrePattes + ",\nestCarnivore=" + estCarnivore + '}';
    }
    
    
    
}
