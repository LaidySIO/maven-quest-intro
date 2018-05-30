/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cours.calcul;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author elhad
 */
public class Calculation implements ICalculation {

    @Override
    public int addition(int value1, int value2) {
        return value1 + value2;
    }

    private static int generateInt(int max, int min) {
        Random rand = new Random();
        int random;

        random = rand.nextInt((max - min) + 1) + min;

        return random;
    }

    @Override
    public int[] initMyArray(int taille) {
        int[] randomArray = new int[taille - 1];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = generateInt(taille, 1);
        }

        return randomArray;
    }

    @Override
    public int[] sortMyArray(int[] arrayToSort) {
        return null;
    }

    /**
     * Attention pour simplifier l'exercice on ne mettre que de petit nombre
     * entier inferieur à 17. Sinon on risque de depasser la limite prévu pour
     * le type int. Vous pouvez donc utiliser le type entier int.
     */
    @Override
    public int factorielItterative(int number) {

        return 0;
    }

    /**
     * Attention pour simplifier l'exercice on ne mettre que de petit nombre
     * entier inferieur à 17. Sinon on risque de depasser la limite prévu pour
     * le type int. Vous pouvez donc utiliser le type entier int.
     */
    @Override
    public int factorielRecursive(int number) {

        return 0;
    }

    /**
     * renvois 0 si les deux chaines de caractères sont identiques, 1 si la
     * premiere chaine est supérieur à la seconde chaine (en terme de code
     * ASCII), -1 si la premiere chaine est inférieur à la seconde chaine (en
     * terme de code ASCII)
     *
     * @param firstChaine
     * @param secondeChaine
     * @return result
     */
    @Override
    public int compareChaines(String firstChaine, String secondeChaine) {
        char[] chaineUne = firstChaine.toCharArray();
        char[] chaineDeux = secondeChaine.toCharArray();
        
        for (int i = 0; i < chaineUne.length; i++) {
            //System.out.println("\n lette1 : " + chaineUne[i] + " => "+ (int)chaineUne[i] +  " lettre2 : " + chaineDeux[i]+ " => "+ (int)chaineDeux[i]);
            if (chaineUne[i] > chaineDeux[i]) {
                return 1;
            }
            if (chaineUne[i] < chaineDeux[i]) {
                return -1;
            }
        }
        return 0;
    }

    /**
     * renvois 0 si le nombre est égale à 0, 1 s’il est pair et positif, 2 s’il
     * est négatif et paire, 3 s’il est impair et positif et 4 s’il est négatif
     * et impair
     *
     * @param chaine
     * @return result
     */
    @Override
    public int verifyParite(String chaine) {
        int compare = 0;
        int result = 0;
        int evenOdd;
        
        compare = chaine.compareTo("0");
        evenOdd = Integer.parseInt(chaine) % 2;
        if (compare > 0) { // Si positif
            result += 1;
        } else if (compare < 0) { // Si négatif
            result += 2;
        }
        if (evenOdd != 0) { // Si Impair
            result += 2;
        }

        return result;
    }

    @Override
    public int nombreMagique(int[] array) {
        int max;
        int min;
        
        max = array[0];
        min = array[0];
        for (int nb : array) {
            if (max < nb) {
                max = nb;
            }
            if (min > nb) {
                min = nb;
            }
        }
        //System.out.println("Max = " + max + "\nMin = " + min);
        return min + max;
    }
}
