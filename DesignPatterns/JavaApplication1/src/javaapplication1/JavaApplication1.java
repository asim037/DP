
package javaapplication1;


abstract class Animal {

abstract  void  move();
abstract  void  eat();

void  label()  {
System.out.println("Animal's data:");

}
}
class  Bird  extends Animal {
void  move()  {
System.out.println("Moves by flying.");
}
void  eat()  {
System.out.println("Eats birdfood.");
}
}
class  Fish  extends Animal {
void  move()  {
System.out.println("Moves by swimming.");
}
void  eat()  {
System.out.println("Eats seafood.");
}
}
class JavaApplication1{
    
    public static void main(String[] args) {
        Animal ob = new Fish();
        ob.eat();
        ob.label();
        ob.move();
        
    }
    
}
