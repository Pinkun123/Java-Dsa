// public class QueeA {
//     public static class Quee{
//        static int arr[];
//         static int size;
//         static int rear;
//         Quee(int n)
//         {
//             arr=new int[n];
//             size=n;
//             rear=-1;
//         }
//         public static boolean isEmpty()
//         {
//             return rear==-1;
//         }

//         // Add elment in the quee
//         public static void Add(int data)
//         {
//             if(rear == size-1)
//             {
//                 System.out.println("Quee is full");
                
                
//             }
//             rear=rear+1;
//             arr[rear]=data;
//         }

//         // remove  elment in the Quee
//         public static int Remove()
//         {
//             if(isEmpty())
//             {
//                 System.out.println("Quee is empty");
//                 return -1;
//             }

//             int front=arr[0];
//             for(int i=0;i<rear;i++)
//             {
//                 arr[i]=arr[i+1];
//             }
//             rear=rear-1;
//             return front;
//         }
//         // peek the elment in the quee
//         public static int peek()
//         {
//             if(isEmpty())
//             {
//                 System.out.println("Quee is empty");
//                return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Quee q=new Quee(5);
//         q.Add(1);
//         q.Add(2);
//         q.Add(3);
//         while(!q.isEmpty())
//         {
//             System.out.println(q.peek());
//             q.Remove();
//         }
        
//     }
    
// }

// circular Quee using array //

public class QueeA {
    public static class Quee{
       static int arr[];
        static int size;
        static int rear;
        static int front;
        Quee(int n)
        {
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }

        // Add elment in the quee
        public static void Add(int data)
        {
            if(isFull())
            {
                System.out.println("Quee is full");
                return;
            }
            // add 1st elemnt
            if(front == -1)
            {
                front= 0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        // remove  elment in the Quee
        public static int Remove()
        {
            if(isEmpty())
            {
                System.out.println("Quee is empty");
                return -1;
            }

           int result= arr[front];
            // remove last element form
            if(rear == front)
            {
                rear =front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        // peek the elment in the quee
        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Quee is empty");
               return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Quee q=new Quee(5);
        q.Add(1);
        q.Add(2);
        q.Add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.Remove();
        }
        
    }
    


}
// circular Quee using array