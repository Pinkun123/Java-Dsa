public class constructor {
   public static void main(String[] args) {
    // Student s1=new Student("pinku");
                                          ///paramiterconstructor
    // System.out.println(s1);

    Student s1=new Student();

    Student s2=new Student("pionku");
    

    System.out.println(s2);

    Student s3=new Student(123);
    System.out.println(s3);

    //Student s4=new Student();  // construcotr overloading

   } 
}

class Student{
    String name;
    int roll;

    // Student(String name )
    // {                           ///paramiterconstructor
    //     this.name=name;
    // }

    // Student()
    // {
    //     System.out.println("constructor is called....");         /// non paramtised
    // }

    Student()
    {
        System.out.println("constructor is called....");         /// non paramtised
    }

     Student(String name )
    {                           ///paramiterconstructor
        this.name=name;
    }

    Student(int rool)
    {
        this.roll=roll;
    }



}
