package datastructure;

public class UseQueue {


    public static <string> void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add, peek, remove & poll elements.
         * Use For-Each loop and While-Loop with Iterator to retrieve data.
         *
         * Store and retrieve data from/to a database table.
         */

        UseQueue queue = new UseQueue();

        queue.add("element 1");
        queue.add("element 2");
        queue.add("element 3");


        int element1 = queue.poll();

        int element2 = queue.remove();

        int element3 = queue.peek ();


    }

    private int peek() {
        return 1;
    }

    private int remove() {
        return 2;
    }

    private int poll() {

        return 3;
    }


    private void add(String s) {

    }
    }