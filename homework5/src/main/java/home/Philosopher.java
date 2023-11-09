package home;


import java.util.concurrent.Semaphore;

public class Philosopher extends Thread{
    private int id;
    private int eatCounter;
    int num = 0;
    Semaphore sem;
    private Boolean eatOrThink;

    public Philosopher(int id, Semaphore sem) {
        this.id = id;
        this.sem = sem;
        eatCounter = 0;
        eatOrThink = false;
    }

    public void setEatOrThink(Boolean eatOrThink) {
        this.eatOrThink = eatOrThink;
    }

    public int getID() {
        return id;
    }

    public int getEatCounter() {
        return eatCounter;
    }


    @Override
    public void run() {
        try
        {
            while(num<3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println ("Философ " + id+" ест");
                // философ ест
                sleep(500);
                num++;

                System.out.println ("Философ " + id+" думает");
                sem.release();
                sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println ("у философа " + id + " проблемы");
        }
    }

}
