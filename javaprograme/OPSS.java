public class OPSS {
    
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);

        Myacc dl=new Myacc();
        // dl.setPassword("pinku@123");
        // System.out.println(dl.password);\
        dl.setPassword("nmxjosdj");
        System.out.println(dl.setPassword());
    }
}

class Pen {


    String color;
    int tip;

    String  setcolor(String newcolor)
    {
        return color=newcolor;
    }
    

    void settip(int newtip)
    {
        tip=newtip;
    }
}

class Myacc{
   private String password;
    String userName;

    void setPassword(String newPass){
        password=newPass;
    }
}