package Lesson31;

public class Test10 {
    void marafon(int tempVoz, int tempBega) throws PodvernulNoguExcep{
        if (tempBega>12){
            throw new PodvernulNoguExcep("Temp bega bill vis " + tempBega);
        }
        if (tempVoz>32){
       throw new SveloNogy();
        }
        System.out.println("Vi probejali marafon");
    }

    public static void main(String[] args) {
        Test10 t10 = new Test10();
        try {
            t10.marafon(20,13);
        } catch (PodvernulNoguExcep e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("V lybom sluchae polychite gramoty");
        }
    }

}

class PodvernulNoguExcep extends Exception{
    PodvernulNoguExcep(String mees){
        super(mees);
    }

    PodvernulNoguExcep(){}

}

class SveloNogy extends PodvernulNoguExcep {
    SveloNogy(String mess){
        super(mess);
    }
    SveloNogy(){}
}