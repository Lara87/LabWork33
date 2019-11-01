package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №3. Использование коллекций.\n" +
                "Выполнила студентка ЗИНРб - 41 Черникова Любовь.\n" +
                "Умножить два многочлена заданной степени, если коэффициенты многочленов хранятся в списках.\n");

        ArrayList<Integer> polinomial = new ArrayList<Integer>();//создаём объект arraylist - список коэф многочлена
        ArrayList<Integer> extentPolinom = new ArrayList<Integer>();//создаём объект arrayList - список степеней многочлена
        Scanner n = new Scanner(System.in);//создаём объект класса scanner, чтобы считать введенное с клавиатуры - степень
        Scanner x1 = new Scanner(System.in);//коэф.

        for (int i = 1; i <= 4; i++) {
            System.out.println("Введите значение коэффициента " + i + ":");
            int coef1 = x1.nextInt();
            polinomial.add(coef1);

            for (int j = 1; j <= 4; j++) {
                System.out.println("Введите значение степени " + i + " члена: ");
                int extentNum = n.nextInt();//считываем степень и проверяем, число ли это
                extentPolinom.add(extentNum);
                break;
            }
        }

        System.out.println("Ваш пример: (" + polinomial.get(0) + "a^" + extentPolinom.get(0) + " + "
                + polinomial.get(1) + "b^" + extentPolinom.get(1) + ")" +
                "*" + "(" + polinomial.get(2) + "a^" + extentPolinom.get(2) + " + "
                + polinomial.get(3) + "b^" + extentPolinom.get(3) + ")");

        System.out.println("Решение: "
                + polinomial.get(0) * polinomial.get(2) + "a^" + (extentPolinom.get(0) + extentPolinom.get(2)) + " + " +
                polinomial.get(0) * polinomial.get(3) + "ab^" + (extentPolinom.get(0) + extentPolinom.get(3)) + " + " +
                polinomial.get(1) * polinomial.get(2) + "ab^" + (extentPolinom.get(1) + extentPolinom.get(2)) + " + " +
                polinomial.get(1) * polinomial.get(3) + "b^" + (extentPolinom.get(1) + extentPolinom.get(3)));
    }
}
