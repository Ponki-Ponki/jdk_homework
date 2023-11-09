package home;


import java.lang.reflect.Array;
import java.util.concurrent.Semaphore;

/**
 * Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти.
 * Вилки лежат на столе между каждой парой ближайших философов.
 *   Каждый философ может либо есть, либо размышлять.
 *   Философ может есть только тогда, когда держит две вилки — взятую справа и слева.
 *   Философ не может есть два раза подряд, не прервавшись на размышления (можно не учитывать)
 *   Философ может взять только две вилки сразу, то есть обе вилки должны быть свободны
 * Описать в виде кода такую ситуацию. Каждый философ должен поесть три раза
 */
public class Main {
    public static void main(String[] args) {
        final int countPhilosopher = 5;
        Semaphore sem = new Semaphore(countPhilosopher/2);
        for(int i=0;i<countPhilosopher;i++)
            new Philosopher(i,sem).start();


    }
}