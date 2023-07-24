package CollectionPractice;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<String> studentName = new ArrayList<>();
        studentName.add("santosh");
        studentName.add("Nabin");
        studentName.add("bibek");

        //add new element in the middle
        studentName.add(1,"ram");

        //update the new value in index 1

        studentName.set(1,"saurav");
        System.out.println(studentName);

        //

        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //add new element
        list.add(4);
        System.out.println(list);

        //add new element in a specific position

        list.add(1,0);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(10);
        newList.add(60);

        // inserting previous all list value in newlist
        newList.addAll(list);
        System.out.println(newList);

        // to get element from list
        System.out.println(list.get(1));

        // to get element from arraylist
        System.out.println(studentName.get(2));

        //remove element
        list.remove(0);
        studentName.remove(0);
        System.out.println(list+"\n"+studentName);

        //remove all elements
//        list.clear();
//        System.out.println(list);
//
//        studentName.clear();
//        System.out.println(studentName);

        // to update a poition value
        list.set(0,1);
        studentName.set(1,"santosh");
        System.out.println(list);
        System.out.println(studentName);


        //to check element
        System.out.println(list.contains(4));
        System.out.println(list.contains(9));
        System.out.println(studentName.contains("santosh"));
        System.out.println(studentName.contains("hari"));


        //Stack

        Stack<String> animals = new Stack<>();
        //adding element as LIFO way inside the stack

        animals.push("Tiger");
        animals.push("Lion");
        animals.push("Elephant");
        animals.push("Cat");

        // to check which element is on the top of stack
        System.out.println(animals.peek());

        //remove the top element
        System.out.println(animals.pop());

        //final output after removing top element of a stack
        System.out.println(animals);


        //Queue FIFO method

        Queue<Integer> queue = new LinkedList<>();
        //adding new element in the queue
        queue.offer(88);
        queue.offer(66);
        queue.offer(99);
        System.out.println(queue);

        //search which element is next to remove in a FIFO order

        System.out.println(queue.peek());

        //print the removed element in FIFO order
        System.out.println(queue.poll());

        //final output after removing the element from the queue
        System.out.println(queue);

        // Priority Queue (Heap min and max)

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(6);
        pq.offer(3);
        pq.offer(7);
        pq.offer(55);
        pq.offer(660);
        System.out.println(pq); // since it show output according to min heap
        // print the removed the element according to priority
        System.out.println(pq.poll());
        //final output
        System.out.println(pq);

        // set priority in MAX Heap

        Queue<Integer> ps = new PriorityQueue<>(Comparator.reverseOrder());
        ps.add(100);
        ps.add(600);
        ps.add(500);
        ps.add(50);
        System.out.println(ps);
        // which element is next in the queue
        System.out.println( ps.peek());
        //remove the next element in the queue
        ps.poll();

        //final output according to max heap
        System.out.println(ps);


        //ArrayDeque

        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(3); //insert element from last
        adq.offer(88); // insert element from last
        adq.offerLast(56); // insert element from last
        adq.offerFirst(66); // insert element from first
        System.out.println(adq); // shows output of first and last inserted element

        //see which element is first according to last and first of the Arrayqueue

        System.out.println(adq.peekFirst());

        System.out.println(adq.peekLast());

        // remove the first and last element from queue

        adq.pollFirst();
        System.out.println(adq);
        adq.pollLast();
        System.out.println(adq);


        //Set

        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(85);
        set.add(99);
        set.add(28);
        set.add(63);
        System.out.println(set); //always shows output in an unordered format

        // to remove the element from set

        set.remove(63);
        System.out.println(set);

        //check the element if there is any presence of data or not
        System.out.println(set.isEmpty());

        // check size of the set
        System.out.println(set.size());

        //clear all element from the set
        set.clear();
        System.out.println(set);

        //since it shows output in an unordered way to show output in orfer form we use linkedhashset

        Set<Integer> order = new LinkedHashSet<>();
        order.add(60);
        order.add(99);
        order.add(55);
        order.add(71);
        System.out.println(order);

        //since linkedhashset do not shows output according to sorted form so we use TreeSet

        Set<Integer> ts = new TreeSet<>();
        ts.add(60);
        ts.add(5);
        ts.add(80);
        ts.add(63);
        System.out.println(ts); // shows output in a sorted format


    }
}
