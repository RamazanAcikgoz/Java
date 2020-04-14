package Interfaces;
// Multiple Inheritance is not allowed in Java
// Java cover this part by INTERFACES and INNER CLASSES
// Abstract classes gathering classes which are related by logically
// Interface classess gathering classes which are non related but wants to be under one roof by common parts
// Interface purpose is like combiner (connector) classes
public class WorkingPlace {

    public static void startTime(Worker[] c) {
        for (int i = 0; i < c.length; i++) {
            c[i].calls();
        }
    }
        public static void main(String[] args) {
            Worker[] workers = new Worker[6];
            //Worker[0] = new Worker(); calismaz hata verir cunku arayuzden nesne olusturulmaz!!
            workers[0] = new Programmer();
            workers[1] = new SalesPerson();
            workers[2] = new Manager();
            workers[3] = new Director();
            workers[4] = new Analyzer();
            workers[5] = new BackendProgrammer();
            startTime(workers);
        }



    }
