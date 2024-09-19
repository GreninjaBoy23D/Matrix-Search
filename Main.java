/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Arrays;
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        MatrixSearch smith = new MatrixSearch();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = arr.length;
        int key2 = 5;
        int search = smith.MatrixSearch(arr, 0, key - 1, key2);
        if (search == -1)
        {
            System.out.println("Element not Present");
        }
        else
        {
            System.out.println("Element is found" + " = " + search);
        }
    }
}
