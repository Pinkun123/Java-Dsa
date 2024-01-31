import java.util.PriorityQueue;

public class heaps {
    static class Student implements Comparable <Student>{  // verloading
        String name;
        int rank;

        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override

        public int compare(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student("A",5));
        pq.add(new Student("B",7));
        pq.add(new Student("C",1));
        pq.add(new Student("D",4));
        pq.add(new Student("E",20));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +"->"+ pq.peek().rank);
            pq.remove();
        }
    }
}
