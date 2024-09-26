package recursion;

public class minimum_no_path {

    static int countPath(int n, int m)
    {
        if(n==1||m==1){
            return 1;
        }
        return countPath(n-1,m)+countPath(n,m-1);
    }

    public static void main(String[] args) {
       int res = countPath(2,2);
        System.out.println(res);
    }
}
