 class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
        
    }
    
} class dog extends Animal {
    @Override
    void sound(){
        System.out.println("dog barks");
    }

    
}
class cat extends Animal{
    @Override
    void sound(){
        System.out.println("cat meows");

    }
}
public class poly {
    public static void main(String[] args){
        Animal a;
        a=new dog();
        a.sound();
        a=new cat();
        a.sound();
    }

    
}
