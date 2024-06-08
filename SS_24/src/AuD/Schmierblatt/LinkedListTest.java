package AuD.Schmierblatt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<Integer> linky = new LinkedList<Integer>();
        ArrayList<String> array = new ArrayList<String>();

        linky.add(2);
        linky.add(3);
        linky.add(4);
        linky.add(5);
        linky.add(6);
        linky.add(100);
        linky.pop();
        linky.pop();
        linky.push(99);
        linky.add(2);

        System.out.println(linky);
    }
}
