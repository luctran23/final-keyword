
package pkgclass;

//create an Object of MyClass 
/*
    class object
    attributes
    methods
    overide existing value
    
*/
public class MyClass {
    final int y = 5; //if you don't want the aility to override existing values, declares the atribute as final
    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        OtherClass otherObj = new OtherClass();
        otherObj.x = 100;
        myObj.y = 10;//error cuz cannot assign a value to final variable
        System.out.print("Key value is: " + myObj.y + "\n");
        System.out.print("Key value is: " + otherObj.x + "\n");
    }
    
}
