import dataStructure.MyQueue;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Test

        // EWQE
//        Solution1 solution1 = new Solution1();
//        int res = solution1.isCentered(new int[] {123});
//        System.out.println(res);

//        Solution2 solution2 = new Solution2();
//        int res = solution2.getDiffOfSum(new int[] {1, 2, 3, 4});
//        System.out.println(res);

//        Solution3 solution3 = new Solution3();
//        char[] res = solution3.f(new char[] {'a', 'b', 'c'}, 1, -2);
//        System.out.println(Optional.ofNullable(res).isEmpty());

//        Solution4 solution4 = new Solution4();
//        solution4.f(-123);

//        Solution6 solution6 = new Solution6();
//        solution6.f(new int[] {1, 8, 3, 7, 10, 2});

//        FindNumber findNumber = new FindNumber();
//        System.out.println(findNumber.findNum(new int[] {1, 3, 5, 7, 9}, 3));

//        FindMax findMax = new FindMax();
//        findMax.findMax(new double[] {1, -3, 0.1, -5});

//        Solution7 solution7 = new Solution7();
//        solution7.lengthBumpy(11);

//        SelectionSortExample sortExample = new SelectionSortExample();
//        sortExample.selectionSort(new int[] {5, 3, 6, 2, 10});

//        Recursion recursion = new Recursion();
//        int res = recursion.fact(6);
//        System.out.println(res);

//        int arr[] = {1, 12, -5, -6, 50, 3};
//
//        SolutionSubarrAvg solutionSubarrAvg = new SolutionSubarrAvg();
//        double res = solutionSubarrAvg.findMaxAverage(arr, 4);
//        double res2 = solutionSubarrAvg.findMaxAverageWithPrefixSum(arr, 4);
//        System.out.println(res);
//        System.out.println(res2);
//        int n = arr.length;

//        QuickSort ob = new QuickSort();
//        QuickSort ob2 = new QuickSort();
//        QuickSort ob3 = ob;
//        ob2 = ob;
//        ob.quickSort(arr, 0, n-1);
//
//        System.out.println(ob);
//        System.out.println(ob2.toString());
//        System.out.println(ob.equals(ob2));
//        System.out.println(ob.equals(ob3));

//        Reverse reverse = new Reverse();
//        String rev = reverse.reverse("Dara");
//        System.out.println(rev);

//        MyIntStack stack = new MyIntStack();
//        System.out.println(stack.isFull()); // false
//        System.out.println(stack.isEmpty()); // true
//        try {
//            for (int i = 1; i <= 10; i++) {
//                stack.push(i);
//            }
//            stack.peek();
//            stack.pop();
//            stack.pop();
//            stack.pop();
//            stack.getSize();
//        } catch (StackException e) {
//            e.getMessage();
//        }

//        MyArrayList<String> myArrayList = new MyArrayList<>();
//        for(int i = 0; i < 11; i++) {
//            myArrayList.add(String.valueOf(i));
//        }
//        System.out.println(myArrayList.size());
//        System.out.println(myArrayList.get(1));

//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
//        for (int i = 0; i <= 5; i++) {
//            myLinkedList.add(i);
//        }
//
//        System.out.println(myLinkedList.size());
//        System.out.println(myLinkedList.get(4));

//        MyStack<Integer> myStack = new MyStack<>();
//        for (int i = 0; i < 3; i++) {
//            myStack.push(i);
//        }
//
//        System.out.println(myStack.size());
//        System.out.println(myStack.peek());
//        myStack.pop();
//        myStack.pop();
//        System.out.println(myStack.size());

        MyQueue<Integer> myQueue = new MyQueue<>();
        for (int i = 0; i < 3; i++) {
            myQueue.enqueue(i);
        }

        System.out.println(myQueue.size());
        System.out.println(myQueue.peek());
        System.out.println("dequeued: " + myQueue.dequeue());
        System.out.println(myQueue.size());
    }
}