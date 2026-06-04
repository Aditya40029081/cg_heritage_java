public class q10 {
        public static void main(String[] args) {

            String name1 = "Ashok";
            double salary1 = 85000.75;
            String dept1 = "IT";
            boolean active1 = true;


            String name2 = "amar";
            double salary2 = 65000.50;
            String dept2 = "HR";
            boolean active2 = true;

            String name3 = "Rajat";
            double salary3 = 72000.20;
            String dept3 = "Finance";
            boolean active3 = false;


            String name4 = "rohan";
            double salary4 = 95000.90;
            String dept4 = "Marketing";
            boolean active4 = true;


            String name5 = "Komal";
            double salary5 = 58000.60;
            String dept5 = "Support";
            boolean active5 = false;


            int salaryInt = (int) salary1;
            float bonus = (float) salary2;


            System.out.println(name1.toUpperCase());
            System.out.println(dept2.toLowerCase());
            System.out.println(name3.length());
            System.out.println(name4.substring(0, 3));

            String performance1 = (salary1 > 80000) ? "Excellent" : "Good";
            String performance2 = (salary2 > 80000) ? "Excellent" : "Good";
            String performance3 = (salary3 > 80000) ? "Excellent" : "Good";
            String performance4 = (salary4 > 80000) ? "Excellent" : "Good";
            String performance5 = (salary5 > 80000) ? "Excellent" : "Good";

            System.out.println("\n===== EMPLOYEE REPORT =====");

            System.out.println(name1 + " | " + dept1 + " | " + salary1 + " | " + performance1);
            System.out.println(name2 + " | " + dept2 + " | " + salary2 + " | " + performance2);
            System.out.println(name3 + " | " + dept3 + " | " + salary3 + " | " + performance3);
            System.out.println(name4 + " | " + dept4 + " | " + salary4 + " | " + performance4);
            System.out.println(name5 + " | " + dept5 + " | " + salary5 + " | " + performance5);

            System.out.println("\nCasted Salary of Amit: " + salaryInt);
            System.out.println("Float Bonus Value: " + bonus);
        }
    }
