package Algorithm.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//백준2447번
// N이 3의 거듭제곱(3, 9, 27, ...)이라고 할 때, 크기 N의 패턴은 N×N 정사각형 모양이다.
// N이 3보다 클 경우, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)×(N/3) 정사각형을 크기 N/3의 패턴으로 둘러싼 형태이다

public class PrintAsterisk {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        recur(0,0,N,false);
        for(int i = 0 ; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);


    }

    public static void recur(int x, int y, int n, boolean blank){
        if(blank){
            for(int i = x ; i < x+n;i++){
                for(int j = y; j < y+n;j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if(n == 1){
            arr[x][y] = '*';
            return;
        }

        int size = n/3;
        int cnt = 0;
        for(int i = x ; i < x + n; i+=size){
            for(int j = y; j < y + n; j+=size){
                cnt ++;
                if(cnt == 5){
                    recur(i,j,size,true);
                }else{
                    recur(i,j,size,false);
                }
            }
        }


    }

}
