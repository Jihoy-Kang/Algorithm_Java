package Algorithm.recursive;

public class ForComprehensionTest {
    static int sum = 0;
    public static void recur(int n){
        if(n <=0){
            System.out.println(sum);
            return;
        }
        sum += n;
        System.out.println("before recur : " + n);
        recur(n-1);
        System.out.println("after recur : " + n);
    }
    public static void main(String[] args) {

//       test1
        recur(5);
    }
}
