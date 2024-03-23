package Lesson6Peregryz;

public class MethodOver {
    int a0;
    int a1;
    int a2;
    int a3;
    int a4;
    void  overloaderSum(int a,int b ,int c, int d , int e){
        a0 = a;
        a1 = b;
        a2 = c;
        a3 = d;
        a4 = e;
        int sum = a+b+c+d+e;
        System.out.println("Сумма всех чисел "+sum);
    }
    void  overloaderSum(int a1,int b1,int c1, int d1){
        this.overloaderSum(a1,b1,c1,d1,0);
    }
    void  overloaderSum(int a1,int b1,int c1){
        this.overloaderSum(a1,b1,c1,0,0);
    }
    void  overloaderSum(int a1,int b1){
        this.overloaderSum(a1,b1,0,0,0);
    }
    void  overloaderSum(int a1){
        this.overloaderSum(a1,0,0,0,0);
    }
    void  overloaderSum(){
        this.overloaderSum( 0,0,0,0,0);
    }
}

class MethdoOverload{
    public static void main(String[] args) {
        MethodOver methdoOver = new MethodOver();
        methdoOver.overloaderSum();
        methdoOver.overloaderSum(3);
        methdoOver.overloaderSum(3,5);
        methdoOver.overloaderSum(3,5,7);
        methdoOver.overloaderSum(3,5,7,1);

    }
}