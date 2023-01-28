import java.util.Arrays;
import java.util.Scanner;

public class Add {
    static int num=0;

    public static void main(String[] args) {
        int x[]=1new int[5];
        Scanner in =new Scanner(System.in);
        System.out.println(Arrays.toString(x));
        for (int i = 0; i <6 ; i++) {
            if(input(x,in.nextInt()))
                System.out.println(Arrays.toString(x));
            else
                System.out.println("arry is full");

        }
    }
    public static boolean input(int[]a,int elemant) {
        if (num < a.length) {
            a[num] = elemant;
            num++;
            return true;
        }
        return false;
    }

}


