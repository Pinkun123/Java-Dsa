public class recursion {
    // print number 5 to 1
/* 
    public static void printNumb(int n)
    {
        // base case
        if(n==0)
        {
            return;
        }
        // recursive case
        System.out.println(n);
        printNumb(n-1);
    }
    public static void main(String[] args) {
        printNumb(5);
    }
 
   // print no 1 to 5
   public static void printNumb(int n)
   {
    if(n==6)
    {
        return;
    }
    System.out.println(n);
    printNumb(n+1);
   }
   public static void main(String[] args) {
    printNumb(1);
   }
   */
  // print n no of natural no 
/* 
  public static void sumofNatrualno(int i, int n,int sum )
  {
    // base case

    if(i==n)
    {
        sum=sum+i;
        System.out.println(sum);
        return;
    }
    sum=sum+i;
    sumofNatrualno(i+1,n,sum);
    System.out.println(i);
  }

  public static void main(String[] args) {
    sumofNatrualno(1, 5, 0);
  }
  */
  //print factrial of n
/* 
  public static int printfact(int n)

  {
    // base case
    if(n==1 || n==0)
    {
        return 1;
    }

    int fact_nm=printfact(n-1);
    int fact_n=n*fact_nm;
    return fact_n;

  }

  public static void main(String[] args) {
    System.out.println(printfact(5));
  }
  */
  // print fibnoic no
/* 
  public static void printfib(int a,int b,int n)
  {
    // base case
    if(n==0)
    {
        return;
    }
    int c=a+b;
    System.out.println(c);
    printfib(b, c, n-1);
    
  }
  public static void main(String[] args) {
    int a=0;
    int b=1;
    System.out.println(a);
    System.out.println(b);
    int n=7;
    printfib(a, b, n-2); 
  }
  */
  //print x^n( stack of hieght)
/* 
  public static int powercal(int x,int n)
  {
    if(n==0)
    {
      return 1;
    }
    if(x==0)
    {
      return 0;
    }
    int power_nm1=powercal(x, n-1);
    int powern=x*power_nm1;
    return powern;
  }

  public static void main(String[] args) {
    int x=2;int n=5;
    int ans=powercal(x, n);
    System.out.println(ans);
  }
  */

  // print power x^n( stack of logon)
  public static int powercall(int x,int n)
  {
    if(n==0)
    {
      return 1;
    }
    if(x==0)
    {
      return 0;

    }
    if(n%2==0)
    {
      return powercall(x, n/2)*powercall(x, n/2);

    }
   else
   {
    return powercall(x, n/2)*powercall(x, n/2)*x;
    
   }
  }

  public static void main(String[] args) {
    int x=2; int n=5;

    int ans=powercall(x, n);
    System.out.println(ans);

  }

}
