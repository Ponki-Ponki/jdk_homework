package home;

import home.calc.Calc;

/**
 * Написать класс Калькулятор (необобщенный), который содержит обобщенные статические
 * методы: sum(), multiply(), divide(), subtract().
 * Параметры этих методов – два числа разного типа (но необязательно разного между собой),
 * над которыми должна быть произведена операция.
 */

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
 * если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
 * но должны иметь одинаковую длину и содержать элементы одного типа.
 */

public class Main {
    public static void main(String[] args) {
        Calc a = new Calc();
        Integer a1 = 3;
        Double a2 = 4.5;
        a.print(a.sum(a1,a2));
        a.print(a.divide(a1,a2));
        a.print(a.subtract(a1,a2));
        a.print(a.multiply(a1,a2));
    }

    public void compareArrays(){

    }
}