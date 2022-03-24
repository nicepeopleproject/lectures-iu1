package lecture3.tests;

public class Test1 {
    public static void main(String[] args) {
        A[] arr = new A[10];
        for (int i=0;i<arr.length;i++){
            arr[i] = new A(i*2-1, i%3==0);
            System.out.println(i*3-1);
        }
        System.out.println("Answer:");
        for (A a : arr){
            if (a.getA()>=-7) System.out.println(a.getA());
        }
    }
}
class A {
    private int a;
    public A(int a, boolean b) {
        this.a = b ? 0 : a - 3;
    }
    public int getA(){ return a + 1;}
}
