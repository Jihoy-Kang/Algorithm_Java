package Algorithm.recursive;
import java.io.*;
import java.util.*;

//백준 10870
//n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
public class Fibonacci_5  {
    public static void main(String[] args) throws IOException{
//        120ms
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());

//        204ms
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = fibo(N);
        System.out.println(result);
    }
    public static int fibo(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibo(n-2) + fibo(n-1);
    }

}
