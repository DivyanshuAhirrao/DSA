package arrayProg;

public class SubStringReverse {

    static String s;

    static void reverseStr(int l, int h){
        int n = h-l;
        for (int i=0;i<n/2;i++){
            s = swap(i+l,n-i-1+l);
        }
    }

    static void reverseString(int A[], int n){
        reverseStr(0,A[0]);

        for (int i=1;i<n;i++){
            reverseStr(A[i-1], A[i]);
        }

        reverseStr(A[n-1], s.length());
    }

    static  String swap(int i, int j) {
        char ch[] = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return String.valueOf(ch);
    }


    public static void main(String[] args) {
        s = "abcdefghijklmno";
        int A[] = {3,6,9,12};
        int n = A.length;
        reverseString(A,n);
        System.out.println(s);
    }
}
