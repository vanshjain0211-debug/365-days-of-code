import java.util.*;

class Student {
    // Write your code here
    String name;
    int roll;
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    void display(){
        System.out.println(name + " " + roll);
    }
}
class Graduate extends Student {
    // Write your code here
    String degree;
    Graduate(String name, int roll, String degree){
        super(name, roll);
        this.degree = degree;
    }
    void showDegree(){
        System.out.println(name + " " + roll + " " + degree);
    }
}
public class inheritance {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int type = sc.nextInt();
            if (type == 1) {
                String name = sc.next();
                int roll = sc.nextInt();
                Student s = new Student(name, roll);
                s.display();
            } else {
                String name = sc.next();
                int roll = sc.nextInt();
                String degree = sc.next();
                Graduate g = new Graduate(name, roll, degree);
                g.showDegree();
            }
        }
        sc.close();
    }
}
