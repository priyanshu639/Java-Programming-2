import java.util.*;
    class Student implements Comparable<Student>{
        int roll;
        double id;
        String name;
        Student(int roll,double id,String name){
            this.roll=roll;
            this.id=id;
            this.name=name;
        }
        public int compareTo(Student s){
            return this.roll-s.roll;
        }

    }
    public class customComparator {
        public static void print(Student[] arr) {
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i].name+" ");
                System.out.print(arr[i].id+" ");
                System.out.println(arr[i].roll+" ");
            }
            System.out.println();
        }
        public static void main(String[] args) {
            Student[] s=new Student[3];
            s[0]=new Student(12,12.44,"g");
            s[1]=new Student(34,16.44,"gfff");
            s[2]=new Student(2,14.44,"gh");
            print(s);
            Arrays.sort(s);
            print(s);


        }
    
}
