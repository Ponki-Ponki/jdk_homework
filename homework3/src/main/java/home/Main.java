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

/**
 * Напишите обобщенный класс Pair, который представляет собой пару значений разного типа.
 * Класс должен иметь методы getFirst(), getSecond() для получения значений каждого из
 * составляющих пары, а также переопределение метода toString(), возвращающее строковое
 * представление пары.
 */


public class Main {
    public static void main(String[] args) {
        //1
        Calc a = new Calc();
        Integer a1 = 3;
        Double a2 = 4.5;
        a.print(a.sum(a1,a2));
        a.print(a.divide(a1,a2));
        a.print(a.subtract(a1,a2));
        a.print(a.multiply(a1,a2));
        //2
        Integer[] array1 = {1, 2, 3, 4, 5};
        Double[] array3 = {1.0, 2.0, 3.0, 4.0, 5.0};
        Integer[] array4 = {1, 2, 3, 4, 5};
        Integer[] array2 = {6, 7, 8, 9, 10};

        System.out.println(compareArrays(array1,array2));
        System.out.println(compareArrays(array1,array3));
        System.out.println(compareArrays(array1,array4));
        //3
        Pair p = new Pair("pair",2);
        System.out.println(p.getSecond());
        System.out.println(p.getFirst());
        System.out.println(p.toString());

    }

    public static <T> Boolean compareArrays(T[] arr1, T[] arr2){
        if(!arr1.getClass().getName().equals(arr2.getClass().getName())) return false;
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}