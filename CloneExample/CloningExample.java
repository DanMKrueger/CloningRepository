class MyClonedClass{
    Integer x;
    String y;
}

class ClassImplementingCloneable implements Cloneable{
    MyClonedClass myClone = new MyClonedClass();
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class CloningExample{
    public static void main(String args[]) throws CloneNotSupportedException{

        ClassImplementingCloneable myObject = new ClassImplementingCloneable();

        myObject.myClone.x = 10;
        myObject.myClone.y = "This is my string";
        System.out.println(myObject.myClone.x + "  " + myObject.myClone.y);

        ClassImplementingCloneable mySecondObject = (ClassImplementingCloneable)myObject.clone();
        System.out.println(mySecondObject.myClone.x + "  " + mySecondObject.myClone.y);


    }
}