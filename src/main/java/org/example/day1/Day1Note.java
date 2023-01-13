package org.example.day1;
import java.util.*;
public class Day1Note {
    public static void main(String[] args) {
/*
1. maven
    folder structure
    types of repository:
        local (.m2), central, remote
    maven build lifecycle
        clean, validation, compile, test, ....
    Command Line
        mvn clean, mvn test, mvn install

2. git
    distributed version control
    how to connect with github by intellij or terminal
    basic git command

3. eight basic data type
   primitive type: byte(8 bits), short(16), int(32), long(64), float(32), double(64), char(16), boolean(1)
   wrapper type:   Byte, Short, Integer, Long, Float, Double, Boolean, Character
   auto boxing: primitive -> wrapper
   unboxing: wrapper -> primitive

        int a = 1;
        Integer b = 1;
        System.out.println(a + b);
        List<Integer> list = new ArrayList<>();
        list.add(b);
        list.add(a);
        System.out.println(list);

4. String/ StringBuilder/ StringBuffer
    String immutable class,

        String s = "abc";
        appendStr(s);
        System.out.println(s); // abc

    StringBuilder mutable class, not thread safe

         StringBuilder sb = new StringBuilder("abc");
        appendStr(sb);
        System.out.println(sb.toString()); //abcxyz

    StringBuffer mutable class, thread safe

5. String Intern Pool
        String a = new String("abc");
        String b = new String("abc");
        String c = "abc";
        String d = "abc";
        String e = b.intern();

        // new object is in heap area
        // string intern pool

        System.out.println(a == b); //  F
        System.out.println(a == c); //  F
        System.out.println(c == d); //  T
        System.out.println(d == e); //  T

Integer Pool
        Integer a = 10;
        Integer b = 10;
        Integer c = new Integer(10);
        Integer d = Integer.valueOf(10);

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a == d); // true

          //Integer Pool Range:  -128 => 127
        Integer e = 128;
        Integer f = 128;
        System.out.println(e == f); // false

5 equals and hashCode
        Node n1 = new Node(1, 1);
        Node n2 = new Node(1, 1);

        System.out.println(n1 == n2);       // false
        // false   if not override equals method in Node class, will trigger Object equals method
        // true,   if override
        System.out.println(n1.equals(n2));

        class Node {
            int x;
            int y;
            public Node(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Node node = (Node) o;
                return x == node.x && y == node.y;
            }

            @Override
            public int hashCode() {
                return Objects.hash(x, y);
            }
        }

6. Data Structure
    Collection vs Collections
    Collection: Queue, Set, List
        Queue: PriorityQueue, ArrayDeque, LinkedList..
        Set: HashSet, TreeSet, LinkedHashSet, ...
        List: LinkedList, ArrayList
    Map
        TreeMap
        HashMap, HashTable, ConcurrentHashMap
            HashMap, not thread safe, allow one null key
                key  ------> hashCode-------> %, index = size of Map(16)
                 "abc"          33                    33 % 16 = 1
                 "dbc"          49                    49 % 16 = 1
                    |0| node1 |2| | | ..|15|
                          |
                          v
                        node2
             ArrayList, LinkedList ->  if len of LinkedList > 8, => RedBlack tree

            HashTable, thread safe, lock whole object
            ConcurrentHashMap, thread safe, bucket level lock

       Stack vs Queue

7 Comparator, Comparable
        //   Set<Node> set = new TreeSet<>(new MyComparator());
        Set<Node> set = new TreeSet<>((a, b) -> Integer.compare(a.x, b.x));
        set.add(new Node(1, 1));
        set.add(new Node(2, 2));
        set.add(new Node(3, 3));
        set.add(new Node(4, 4));
        System.out.println(set.stream().findFirst().get().x); //

        class MyComparator implements Comparator<Node> {
            @Override
            public int compare(Node o1, Node o2) {
                return Integer.compare(o1.x, o2.x);
            }
        }

        class Node implements Comparable<Node>{
            int x;
            int y;
            public Node(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Node node = (Node) o;
                return x == node.x && y == node.y;
            }

            @Override
            public int hashCode() {
                return Objects.hash(x, y);
            }

            @Override
            public int compareTo(Node o) {
                return Integer.compare(o.x, this.x);
            }
        }

*/


    }
}

