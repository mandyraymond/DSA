import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        ISortAlgo<Integer> sortAlgo=new BubbleSort<>();

        final Integer[] in1 = new Integer[]{};
        sortAlgo.sort(in1);
        for (final int elem:in1) {
            System.out.println(elem);
        }

        final String[] in2 = new String[]{"Manisha", "Rajan", "Neha", "Rahul"};
        ISortAlgo<String> sortAlg2=new BubbleSort<>();
        sortAlg2.sort(in2);
        for (final String elem:in2) {
            System.out.println(elem);
        }

    }

}

