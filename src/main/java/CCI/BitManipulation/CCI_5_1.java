package CCI.BitManipulation;

public class CCI_5_1 {

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;

        System.out.println(Integer.toBinaryString(n1));
        System.out.println(Integer.toBinaryString(n2));

        System.out.println(~n1);
        System.out.println(~n2);

        System.out.println(Integer.toBinaryString(~n1));
        System.out.println(Integer.toBinaryString(~n2));

    }
}


/*
* You are given two 32-bit numbers, N and M, and two bit positions, i and j.
* Write a method to set all bits between i and j in N equal to M
* (e.g., M becomes a substring of N located at i and starting at j).
* EXAMPLE:
* Input: N = 10000000000, M = 10101, i = 2, j = 6
* Output: N = 10001010100
* * */