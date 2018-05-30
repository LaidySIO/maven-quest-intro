/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.main;

import com.cours.calcul.Calculation;
import com.cours.calcul.ICalculation;
import com.cours.process.IProcessAnimal;
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //testVerifyParite();
        //testCompareChaines();
        //testFactorielItterative();
        //testFactorielRecursive();
        testNombreMagique();
        //testSortMyArray();
        //testProcessAnimal();
    }

    public static void testVerifyParite() {
        System.out.println("Entrez un nombre entier");
        String nb = sc.next();
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

    }

    public static void testCompareChaines() {
        System.out.println("Entrez la première chaine");
        String chaineUne = sc.next();
        Calculation c = new Calculation();
        switch (c.compareChaines(chaineUne, "Lala")) {
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

    }

    /**
     * Attention pour simplifier l'exercice on ne mettre que de petit nombre
     * entier inferieur à 17. Sinon on risque de depasser la limite prévu pour
     * le type int. Vous pouvez donc utiliser le type entier int.
     */
    public static void testFactorielRecursive() {

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

    }

    public static void testProcessAnimal() {
        //processAnimal.loadAnimalsManually();
        //processAnimal.loadAnimalsFile();
        //processAnimal.calculMoyennePoidsAnimaux();
        //processAnimal.calculEcartTypePoidsAnimaux();
    }
}
