package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("������������ ������ �3. ������������� ���������.\n" +
                "��������� ��������� ����� - 41 ��������� ������.\n" +
                "�������� ��� ���������� �������� �������, ���� ������������ ����������� �������� � �������.\n");

        ArrayList<Integer> polinomial = new ArrayList<Integer>();//������ ������ arraylist - ������ ���� ����������
        ArrayList<Integer> extentPolinom = new ArrayList<Integer>();//������ ������ arrayList - ������ �������� ����������
        Scanner n = new Scanner(System.in);//������ ������ ������ scanner, ����� ������� ��������� � ���������� - �������
        Scanner x1 = new Scanner(System.in);//����.

        for (int i = 1; i <= 4; i++) {
            System.out.println("������� �������� ������������ " + i + ":");
            int coef1 = x1.nextInt();
            polinomial.add(coef1);

            for (int j = 1; j <= 4; j++) {
                System.out.println("������� �������� ������� " + i + " �����: ");
                int extentNum = n.nextInt();//��������� ������� � ���������, ����� �� ���
                extentPolinom.add(extentNum);
                break;
            }
        }

        System.out.println("��� ������: (" + polinomial.get(0) + "a^" + extentPolinom.get(0) + " + "
                + polinomial.get(1) + "b^" + extentPolinom.get(1) + ")" +
                "*" + "(" + polinomial.get(2) + "a^" + extentPolinom.get(2) + " + "
                + polinomial.get(3) + "b^" + extentPolinom.get(3) + ")");

        System.out.println("�������: "
                + polinomial.get(0) * polinomial.get(2) + "a^" + (extentPolinom.get(0) + extentPolinom.get(2)) + " + " +
                polinomial.get(0) * polinomial.get(3) + "ab^" + (extentPolinom.get(0) + extentPolinom.get(3)) + " + " +
                polinomial.get(1) * polinomial.get(2) + "ab^" + (extentPolinom.get(1) + extentPolinom.get(2)) + " + " +
                polinomial.get(1) * polinomial.get(3) + "b^" + (extentPolinom.get(1) + extentPolinom.get(3)));
    }
}
