package labex6;

import java.util.*;

/**
 *
 * @author Desktop Pc
 */
public class Absclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        studentt obj1 = new studentt();
        obj1.getData();
        obj1.display();
        obj1.displaymark();

        faculty obj3 = new faculty();
        obj3.getData();
        obj3.display();
        obj3.displaysalarydetails();
    }
}

abstract class person {

    String name;
    int aadharno;

    abstract void getData();

    abstract void display();
}

class studentt extends person {

    int a, b, c, d, e;
    String status;

    void getData() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name = obj.next();
        System.out.println("Enter the aadharno of the student:");
        aadharno = obj.nextInt();
        System.out.println("Enter the subject1,2,3,4,5");
        a = obj.nextInt();
        b = obj.nextInt();
        c = obj.nextInt();
        d = obj.nextInt();
        e = obj.nextInt();
    }

    void display() {
        System.out.println("##########################");
        System.out.println("The student's details are:");
        System.out.println("##########################");
        System.out.println("Name:" + name);
        System.out.println("Aadhar Number:" + aadharno);

    }

    void displaymark() {
        double avg = ((a + b + c + d + e) / 5);
        if ((avg <= 100) && (avg >= 91)) {
            status = "Outstanding";
        } else if ((avg <= 90) && (avg >= 81)) {
            status = "Excellent";
        } else if (avg <= 80 && avg >= 71) {
            status = "VeryGood";
        } else if (avg <= 70 && avg >= 61) {
            status = "Good";
        } else if ((avg <= 60) && (avg >= 51)) {
            status = "Average";
        } else if ((avg <= 50)) {
            status = "Fail";
        }
        Scanner obj = new Scanner(System.in);
        System.out.println("Subject 1. mark is:" + a);
        System.out.println("Subject 2. mark is:" + b);
        System.out.println("Subject 3. mark is:" + c);
        System.out.println("Subject 4. mark is:" + d);
        System.out.println("Subject 5. mark is:" + e);
        System.out.println("The total mark of the student:" + (a + b + c + d + e));
        System.out.println("The average mark of the student:" + (a + b + c + d + e) / 5);
        System.out.println("The status of the student:" + status);
        System.out.println("-------------------------------------");

    }
}

class faculty extends person {

    int id;
    String dept;
    double salary;
    double da, hra, pf, gp = 0.00, np = 0.00;

    void getData() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name of the faculty:");
        name = obj.next();
        System.out.println("Enter the aadharno of the faculty:");
        aadharno = obj.nextInt();
        System.out.println("Enter the salary of the faculty:");
        salary = obj.nextDouble();

    }

    void display() {
        System.out.println("##########################");
        System.out.println("The faculty's details are:");
        System.out.println("##########################");
        System.out.println("Name:" + name);
        System.out.println("Aadharno:" + aadharno);
    }

    public void displaysalarydetails() {
        Scanner obj = new Scanner(System.in);
        System.out.println("##########################");
        System.out.println("Salary detail's of the faculty:");
        System.out.println("##########################");
        da = 0.30 * salary;
        hra = 12.5 * salary;
        pf = 0.10 * salary;
        gp = salary + da + hra;
        np = gp - pf;
        System.out.println(" Name of the faculty :" + name);
        System.out.println("Basic salary : " + salary);
        System.out.println("Gross salary :" + gp);
        System.out.println(" Net salary " + np);
        System.out.println("##########################");
    }
}
