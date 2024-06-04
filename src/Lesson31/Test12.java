package Lesson31;

public class Test12 {

    static String str = "";
    void ghi() throws Exception{
        throw new Exception();
    }

    void def()throws Exception{
        ghi();
        str +="2";
        ghi();
        str +="3";
    }
    void abc(){
        try {
            def();
        }catch (Exception e){
            str+="1";
        }
    }

    public static void main(String[] args) {
        Test12 t = new Test12();
        t.abc();
        System.out.println(str);
    }
}
