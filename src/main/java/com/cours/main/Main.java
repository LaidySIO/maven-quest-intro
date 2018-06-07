/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.main;

import com.cours.calcul.Calculation;
import com.cours.calcul.ICalculation;
import com.cours.entities.Animal;
import com.cours.process.IProcessAnimal;
import com.cours.process.ProcessAnimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 *
 * @author elhad
 */
public class Main {

    private static final Log log = LogFactory.getLog(Main.class);
    private static ICalculation calculation = null;
    private static IProcessAnimal processAnimal = null;
    private static Scanner sc = new Scanner(System.in);
    private static List<Animal> animalList = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // testVerifyParite();
        //testCompareChaines();
        //testFactorielItterative();
        //testFactorielRecursive();
        //testNombreMagique();
        //testSortMyArray();
        //testProcessAnimal();

    }

    public static void testVerifyParite() {
        String nb;
        boolean validNumber;

        nb = null;
        validNumber = false;
        while (!validNumber) { // Gestion erreur : si l'enrée n'est pas un int
            System.out.println("Entrez un nombre entier");
            nb = sc.next();
            try {
                Integer.parseInt(nb);
                validNumber = true;
                Calculation c = new Calculation();
                switch (c.verifyParite(nb)) {
                    case 1:
                        System.out.println("Le nombre est positif et pair");
                        break;
                    case 2:
                        System.out.println("Le nombre est négatif et pair");
                    case 3:
                        System.out.println("Le nombre est positif et impar");
                        break;
                    case 4:
                        System.out.println("Le nombre est négatif et impair");
                        break;
                    default:
                        System.out.println("Le nombre est nul");
                        break;
                }
            } catch (Exception e) {
                System.err.println("Veuillez saisir un nombre entier");
            }
        }
    }

    public static void testCompareChaines() {
        System.out.println("Entrez la première chaine");
        String chaineUne = sc.next();
        System.out.println("Entrez la deuxième chaine");
        String chaineDeux = sc.next();
        Calculation c = new Calculation();
        switch (c.compareChaines(chaineUne, chaineDeux)) {
            case -1:
                System.out.println("La deuxième chaine est supérieur à la première");
                break;
            case 1:
                System.out.println(" La première chaine est supérieur à la deuxième");
                break;
            default:
                System.out.println("Les deux chaines sont identiques");
                break;
        }
    }

    /**
     * Attention pour simplifier l'exercice on ne mettre que de petit nombre
     * entier inferieur à 17. Sinon on risque de depasser la limite prévu pour
     * le type int. Vous pouvez donc utiliser le type entier int.
     */
    public static void testFactorielItterative() {
        Calculation c = new Calculation();
        int nb;
        int result;

        System.out.println("Saisir le nombre entier positif entre 0 et 16");
        nb = sc.nextInt();
        result = c.factorielItterative(nb);

        System.out.println(nb + "! = " + result);
    }

    /**
     * Attention pour simplifier l'exercice on ne mettre que de petit nombre
     * entier inferieur à 17. Sinon on risque de depasser la limite prévu pour
     * le type int. Vous pouvez donc utiliser le type entier int.
     */
    public static void testFactorielRecursive() {
        Calculation c = new Calculation();
        int nb;
        int result;

        System.out.println("Saisir le nombre entier positif entre 0 et 16");
        nb = sc.nextInt();
        result = c.factorielRecursive(nb);
        System.out.println(nb + "! = " + result);
    }

    public static void testNombreMagique() {
        Calculation c = new Calculation();
        int[] intArray = c.initMyArray(100);
        int result;

        for (int nb : intArray) {
            System.out.println(nb);
        }
        result = c.nombreMagique(intArray);
        System.out.println("Le nombre magique est : " + result);
    }

    public static void testSortMyArray() {
        Calculation c = new Calculation();
        int[] intArray = c.initMyArray(100);

        System.out.println("*************Tableau non trié****************");
        for (int nb : intArray) {
            System.out.println(nb);
        }
        intArray = c.sortMyArray(intArray);
        System.out.println("*************Tableau trié****************");
        for (int nb : intArray) {
            System.out.println(nb);
        }

    }

    public static void testProcessAnimal() {
        //processAnimal = new ProcessAnimal();
        //processAnimal.loadAnimalsFile();
        //processAnimal.loadAnimalsManually();
        //processAnimal.calculMoyennePoidsAnimaux();
        //processAnimal.calculEcartTypePoidsAnimaux();
    }
}
