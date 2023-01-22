package com.javapractice;

public class Main {

    public static void main(String[] args) {
//	var LL = new LinkedList("Hello");
//    LL.addTail("World");
//    LL.addTail("NY");
//    LL.addTail("TOKYO");
//    LL.removeHead();
//    LL.removeHead();
//    LL.reverse();
//    System.out.println(LL.getNthFromEnd(2));
//    System.out.println(LL.getNthFromEnd(1));
//    System.out.println(LL.getNthFromEnd(0));
//    System.out.println(LL.findMiddle());
//
//    LL.addTail("PARIS");
//    LL.addTail("BEIJING");
//    System.out.println(LL.findMiddle());
//    System.out.println(MStack.reverse("elephant"));
//    var encTestA = "((hello [John] and <Wendy>, I see you are {talking}))";
//    var invalidEnc = "((hello [John] and <Wendy>, I see you are talking}))";
//    System.out.println(MStack.hasBalancedEnclosures(encTestA));
//    System.out.println(MStack.hasBalancedEnclosures(invalidEnc));
//    System.out.println(LL.contains("NY"));
//    System.out.println(LL.contains("TOKYO"));
//    System.out.println(LL.contains("???"));

//        var stack = new NStack(new int[]{1, 2, 3});
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        stack.push(9);
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());

        var q = new ArrayQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.peek());
        q.dequeue();
        var removed = q.dequeue();
        System.out.println(removed);

        var sq = new SQueue(1);
        sq.add(2);
        sq.add(3);
        sq.add(4);

        System.out.println(sq.remove());
        sq.add(5);
        System.out.println(sq.remove());

        System.out.println(FirstUniqueChar.getFirstNonRepeatingChar("a green" +
                " apple is good"));

//        q.reverse();
//        System.out.println(q.getQueue());
//        var m = new int[5];
//        for (int val: m) {
//            System.out.println(val);
//        }
//        System.out.println(m.length);
    }
}
