package Algorithm.recursive;

import java.io.IOException;
import java.util.Scanner;

//백준10872 문제
//0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
public class Factorial {
    public static void main(String[] args) throws IOException {

//        BufferedReader 사용 120ms
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());


        //Scanner 사용 204ms
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = fac(N);


        System.out.println(result);
    }
    public static int fac(int n){
        if(n <= 1) return 1;
        return n * fac(n-1);
    }
}
/*
정리
5입력 시

최초 입력 n = 5
return 5 * fac(5-1) == 5 * 24

1회 재귀 n = 4
return 4 * fac(4-1) == 4 * 6

2회 재귀 n = 3
return 3 * fac(3-1) == 3 * 2

3회 재귀 n = 2
return 2 * fac(2-1) == 2 * 1

4회 재귀 n = 1
-> n이 1이므로 1반환

*/
