/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    static List<Guitar> guitar = new ArrayList<>();
    static int i = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
    static EntityManager em = factory.createEntityManager();

    public static void main(String[] args) throws IOException {
        
        // for fields with enum tipes @Enumarated
        em.getTransaction().begin();
        //робити сайт
        //inDB();
        for (int j = 0; j < i; j++) {
            em.persist(guitar.get(j));
        }
        //JPQL
//        List<Guitar> g = em.createQuery("select g from Guitar g").getResultList();
//        List<Guitar> g2 = em.createQuery("select g from Guitar g join g.color c where c.color = :color").setParameter("color", "brown").getResultList();
//                em.remove(em.find(GuitarType.class, 5));
//                em.remove(em.find(GuitarType.class, 6));
//       System.out.println("");
//        for (Guitar g1 : g2) {
//            System.out.println(g1.getName());
//        }
//        for (Color c1 : c) {
//            System.out.println(c1.getColor());
//        }
        em.remove(em.find(Customer.class, 2));
        em.remove(em.find(Customer.class, 3));
        em.remove(em.find(Customer.class, 4));
        em.getTransaction().commit();
        em.close();
        factory.close();
    }

    private static void inDB() throws IOException {
        do {
            guitar.add(new Guitar());
            System.out.println("Enter id of Tree (Fingerbar)");
            guitar.get(i).setTreeOfFingerbar(em.find(Tree.class, Integer.valueOf(br.readLine())));
            System.out.println("Enter id of Tree (MainPart)");
            guitar.get(i).setTreeOfMainPart(em.find(Tree.class, Integer.valueOf(br.readLine())));
            System.out.println("Enter id of Color");
            guitar.get(i).setColor(em.find(Color.class, Integer.valueOf(br.readLine())));
            System.out.println("Enter id of Guitar Type");
            guitar.get(i).setType(em.find(GuitarType.class, Integer.valueOf(br.readLine())));
            System.out.println("Enter number of strings");
            guitar.get(i).setNumberOfStrings(Integer.valueOf(br.readLine()));
            System.out.println("Enter number of frets");
            guitar.get(i).setNumberOfFrets(Integer.valueOf(br.readLine()));
            System.out.println("Enter name");
            guitar.get(i).setName(br.readLine());
            System.out.println("Enter pickups");
            guitar.get(i).setPickups(br.readLine());
            System.out.println("Enter price");
            guitar.get(i).setPrice(Integer.valueOf(br.readLine()));
            System.out.println("Write 'out' if wanna end");
            i++;
        } while (!br.readLine().equals("out"));
    }
} 

