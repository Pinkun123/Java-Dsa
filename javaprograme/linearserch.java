import java.util.*;

public class linearserch {
    /* 
 
    public static int linearserch(int marks[],int key)
    {
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]==key)
            {
                return i;
            }
            
        }
        return -1;

      
    }

    public static void main(String[] args) {
        int marks[]={10,27,33,89,56};
        int key=89;
        int idx=linearserch(marks, key);
        {
            if(idx==-1)
            {
                System.out.println("the key is not found");
            }
            else
            {
                System.out.println("the key is found" + idx);
            }
        }
        
    }

  */

  public static int linearserch(String menu[],String key)
  {

    for(int i=0;i<menu.length;i++)
    {
        if(menu[i]==key)
        {
            return i;
        }
    }

    return -1;
      
  }

  public static void main(String[] args) {
    String menu[]={"dosha", "samosa","kaju","fruti","chips"};
    String key="samosa";

    int idx=linearserch(menu, key);

    if(idx==-1)
    {
        System.out.println("the item is not found");
    }
    else
    {
        System.out.println("the item is found ");
        System.out.println("At index is"+idx);
    }
    


  }
}
