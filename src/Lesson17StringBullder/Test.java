package Lesson17StringBullder;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, friend!");
        String s = null;
        s = sb.append("How are you?").substring(sb.indexOf("f"),sb.indexOf("!"));
        System.out.println(s);
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = sb1.append("45");
        sb2 = sb2.append("6").append("7");
        System.out.println(sb2);

        TestBulder testBulder = new TestBulder();

        StringBuilder a = new StringBuilder("Sem");
        StringBuilder b = new StringBuilder("TTran");

        boolean are = testBulder.ravenstvo(a,b);

        System.out.println(are);
    }
}

class TestBulder{
    boolean ravenstvo(StringBuilder a ,StringBuilder b){

        if (a.length()==b.length()){
            return true;
        }else
            return false;
    }
}
