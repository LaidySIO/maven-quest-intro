/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.process;

import com.cours.entities.Animal;
import java.io.BufferedReader;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author elhad
 */
public class ProcessAnimal implements IProcessAnimal {

    private List<Animal> animals = null;
    private final DateFormat dateFormat = null;

    @Override
    public List<Animal> loadAnimalsManually() {
        try {
            animals.clear();
        } catch (Exception e) {
            System.out.println("1 ère initilaisation des animaux");
        } finally {
            animals = new ArrayList<>();
            Animal lion = new Animal(1, "Lion", 200, "23/12/1998", "Marron", 4, true);
            Animal elephant = new Animal(2, "Elephant", 700, "23/12/1978", "Noir", 4, true);
            Animal tigre = new Animal(3, "Tigre", 150, "23/12/1998", "Blanc", 4, true);
            Animal requin = new Animal(4, "Requin", 10, "23/12/1978", "Blanc", 0, true);
            Animal chat = new Animal(5, "Chat", 5, "23/12/2000", "Noir", 4, true);
            Animal mouton = new Animal(6, "Mouton", 25, "23/12/2001", "Blanc", 4, true);
            Animal chevre = new Animal(7, "Chevre", 35, "23/12/2012", "Noir", 4, true);
            Animal poule = new Animal(8, "Poule", 23, "23/12/2009", "Marron", 2, true);
            Animal porc = new Animal(9, "Porc", 20, "23/12/2003", "Blanc", 4, true);
            Animal singe = new Animal(10, "Singe", 25, "23/12/2004", "Noir", 4, true);
            Animal giraffe = new Animal(11, "Griraffe", 175, "23/12/2013", "Marron et noir", 4, true);

            animals.add(lion);
            animals.add(elephant);
            animals.add(tigre);
            animals.add(chat);
            animals.add(mouton);
            animals.add(chevre);
            animals.add(poule);
            animals.add(porc);
            animals.add(singe);
            animals.add(giraffe);
            animals.add(requin);
        }

        return animals;
    }
    // Fonction qui parse une ligne de fichier text en Animal 
    public Animal lineToAnimal(String line) {
        String animalAttr[] = null;
        Animal animal = null;
        line = line.replaceAll(", ", ","); //ON supperime les espaces après les virgules
        animalAttr = line.split(",");
        animal = new Animal(Integer.parseInt(animalAttr[0]), 
                            animalAttr[1],
                            Double.parseDouble(animalAttr[2]),
                            animalAttr[3],
                            animalAttr[4],
                            Integer.parseInt(animalAttr[5]),
                            Boolean.parseBoolean(animalAttr[6]));
        
        return animal;
    }

    @Override
    public List<Animal> loadAnimalsFile() {
        BufferedReader br = null;
        String ligne = null;
        animals = new ArrayList<>();
        
        // try/catch du clear de la liste des animaux
        try {
            animals.clear();
        } 
        catch (Exception e) {
            System.out.println("1 ère initilaisation des animaux");
        }
        
        // try/catch de la lecture du fichier animaux.txt
        try {
            
            File file = new File("animaux.txt");
            br = new BufferedReader(new FileReader(file));

            while ((ligne = br.readLine()) != null) {
                animals.add(lineToAnimal(ligne)); // 
            }
            return animals;
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(ProcessAnimal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(ProcessAnimal.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
            try {
                br.close();
            } 
            catch (IOException ex) {
                Logger.getLogger(ProcessAnimal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public Double calculMoyennePoidsAnimaux() {
        animals = loadAnimalsFile();
        int cpt = 0;
        Double somme = 0.0;
        Double result = 0.0;
        
        /*for (cpt = 0; cpt < animals.size(); cpt++) {
            somme += animals.get(cpt).getPoid();
        }*/
        result = somme / cpt;
        System.out.println(result);
        
        return result;
    }

    @Override
    public Double calculEcartTypePoidsAnimaux() {

        return 0.0;
    }

    @Override
    public List<Animal> sortAnimalsById() {

        return null;
    }

    @Override
    public List<Animal> sortAnimalsByName() {

        return null;
    }

    @Override
    public List<Animal> sortAnimalsByWeight() {

        return null;
    }

    @Override
    public List<Animal> sortAnimalsByColor() {

        return null;
    }

    @Override
    public void generateFileByName() {

    }

    @Override
    public void generateFileByWeight() {

    }

    @Override
    public List<Animal> getAnimals() {

        return null;
    }
}
