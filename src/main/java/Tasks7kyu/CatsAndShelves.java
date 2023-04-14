package main.java.Tasks7kyu;
/*
An infinite number of shelves are arranged one above the other in a staggered fashion.
The cat can jump either one or three shelves at a time: from shelf i to shelf i+1 or i+3
(the cat cannot climb on the shelf directly above its head), according to the illustration:
                 ┌────────┐
                 │-6------│
                 └────────┘
┌────────┐
│------5-│
└────────┘  ┌─────► OK!
            │    ┌────────┐
            │    │-4------│
            │    └────────┘
┌────────┐  │
│------3-│  │
BANG!────┘  ├─────► OK!
  ▲  |\_/|  │    ┌────────┐
  │ ("^-^)  │    │-2------│
  │ )   (   │    └────────┘
┌─┴─┴───┴┬──┘
│------1-│
└────────┘
Input
Start and finish shelf numbers (always positive integers, finish no smaller than start)

Task
Find the minimum number of jumps to go from start to finish

Example
Start 1, finish 5, then answer is 2 (1 => 4 => 5 or 1 => 2 => 5)
 */
public class CatsAndShelves {
    public static int solution(int start, int finish) {
        return (finish - start) / 3 + (finish - start) % 3;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 4));
        System.out.println(solution(1, 5));
        System.out.println(solution(1, 6));
        System.out.println(solution(1, 7));
        System.out.println(solution(2, 7));
        System.out.println(solution(3, 10));
    }
}
