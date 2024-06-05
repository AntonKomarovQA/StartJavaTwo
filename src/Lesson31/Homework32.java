package Lesson31;

//NeVodaException
public class Homework32 {
    public static void main(String[] args) {

        Tiger1 t = new Tiger1();
        t.eat("myaso");

        try {
            t.drink("voda");
         try {
          t.drink("pivo");
        } catch (NeVodaExce e) {
             System.out.println(e.getMessage());
         } catch (Exception e){
             System.out.println(e.getMessage());
         } finally {
             System.out.println("Eto finaly");
         }
        } catch (RuntimeException e ){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}


// NeMyasoExep - дочерний класс RuntimeException
class NeMyasoExeption extends RuntimeException{
    NeMyasoExeption(String s) {
        super(s);
    }
}
// NeVodaExce - дочерний класс Exception
class NeVodaExce extends Exception {
     NeVodaExce(String mes) {
        super(mes);
    }
}

class Tiger1 {
    //метод
   void eat(String s){
       if (s.equals("myaso")) {
           System.out.println("Tigr eat myaso");
       } else {
           throw new NeMyasoExeption ("Tigr ne est myaso"+ s);
       }
   }
    void drink(String j) throws NeVodaExce {
        if (j.equals("voda")) {
            System.out.println("Tigr piet voda");
        } else {
            throw new NeVodaExce ("Tigr ne voda "+j);
        }
    }
}