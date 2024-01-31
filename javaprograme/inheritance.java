import java.nio.channels.NonWritableChannelException;

import javax.sound.sampled.SourceDataLine;

public class inheritance {
    public static void main(String[] args) {

    //     Fish shark=new Fish();
        
    //    shark.eats();
    Dog dobuy=new Dog();
    dobuy.eats();
    int leg=4;
    System.out.println(leg);
    
    }
    
}

// base class
class Animal{

    String breath;

    String eats;

    void breath()
    {
        System.out.println("eats");
    }

    void eats()
    {
        System.out.println("eats");
    }
}
// // dirved calss
// class Fish extends Animal{
//     int finhs;

//     String sweem;
//     void swim()
//     {
//         System.out.println("swim in water");
//     }
//}

class mamales extends animal{
    String sleep;
}

class Dog extend mamales{
    int leg;
}
