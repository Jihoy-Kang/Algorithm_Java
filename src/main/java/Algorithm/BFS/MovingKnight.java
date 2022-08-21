package Algorithm.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MovingKnight {
    static int[][] direction= new int[][]{{-2,1},{-2,-1},{-1,2},{-1,-2},{1,2},{1,-2},{2,1},{2,-1}};
    static int[][] size;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        int[] start = new int[2];
        int[] end = new int[2];
        int[] result = new int[N];

        for(int i = 0 ; i < N ; i++){

            for(int j = 0 ; j < 3 ; j++){

                if(j ==0){
                    int s = Integer.parseInt(br.readLine());
                    size = new int[s][s];

                }else if(j ==1){
                    st = new StringTokenizer(br.readLine());

                    start[0] = Integer.parseInt(st.nextToken());
                    start[1] = Integer.parseInt(st.nextToken());
                }else{
                    st = new StringTokenizer(br.readLine());

                    end[0] = Integer.parseInt(st.nextToken());
                    end[1] = Integer.parseInt(st.nextToken());
                    BFS(start, end);
                    result[i] = size[end[0]][end[1]];
                }
            }
        }
        for(int i =0;i < result.length ; i++){
            System.out.println(result[i]);
        }
    }
    public static void BFS(int[] start, int[] end){

        Queue<int[]> que = new LinkedList<>();
        que.add(start);
        int[] current = new int[2];

        while (!que.isEmpty()){
            current = que.poll();
            if(current[0] == end[0] && current[1] == end[1]) break;


            for(int i = 0 ; i < 8; i++){
                int dx = direction[i][0];
                int dy = direction[i][1];
                int nx = current[0] + dx;
                int ny = current[1] + dy;


                if(nx >= 0 && ny >= 0 && nx < size[0].length && ny < size[0].length && size[current[0]][current[1]] >= size[nx][ny]){
                    int[] avail = new int[]{nx,ny};
                    size[nx][ny] = size[current[0]][current[1]] + 1;
                    que.add(avail);
                }
            }
        }


    }
}