
package com.company;

import java.util.Scanner;


public class main {
private static Scanner t;
    public static void main(String[] args) {

        String name;
        String sur;
        int id;
        int tel;
        int subject;
        String namsubject;
        String option = "s";
        int Dev = 0;
        int Pyt = 0;
        int Jav = 0;
        int stu = 0;


        System.out.print("Centro Educativo ABC");
        System.out.print("Por favor ingrese sus datos: ");

        do {
            t = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            name = t.next();

            System.out.print("Ingrese su apellido: ");
            sur = t.next();

            System.out.print("Ingrese su numero de cedula: ");
            id = t.nextInt();

            System.out.print("Ingrese su  numero de telefono: ");
            tel = t.nextInt();

            System.out.print("Ingrese el curso que desea matricular: ");
            subject = t.nextInt();

            switch (subject) {
                case 1:
                    namsubject = "Programacion en C++";
                    System.out.println(subject);
                    for (Dev = 0; Dev <= 30; Dev = Dev + 1) {
                        if (Dev > 30) {
                            System.out.print("No existen mas cupos, intente matricular otro curso.");
                        }
                    }
                    break;
                case 2:
                    namsubject = "Programacion en Python";
                    System.out.println(subject);
                    for (Dev = 0; Pyt <= 30; Dev = Pyt + 1) {
                        if (Pyt > 30) {
                            System.out.print("No existen mas cupos, intente matricular otro curso.");
                        }
                    }
                    break;
                case 3:
                    namsubject = "Programacion en Java";
                    System.out.println(subject);
                    for (Jav = 0; Jav <= 30; Dev = Jav + 1) {
                        if (Jav > 30) {
                            System.out.print("No existen mas cupos, intente matricular otro curso.");
                            break;
                        }
                    }

                    System.out.print("Desea Continuar? Y/N: ");
                    option = t.next();


                    if (stu >= 45) {
                        stu = Dev + Pyt + Jav;
                        System.out.print("No hay mas cupos");
                    }
                    System.out.println("La cantidad de estudiantes en el curso de C++ es: " + Dev);
                    System.out.println("La cantidad de estudiantes en el curso de Python es: " + Pyt);
                    System.out.println("La cantidad de estudiantes en el curso de Java es: " + Jav);
                    System.out.println("La cantidad de estudiantes matriculados es: " + stu);
            }   } while (option.equals("S")||option.equals("s"));


        }
    }
