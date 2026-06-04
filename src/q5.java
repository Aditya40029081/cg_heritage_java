public class q5 {
        public static void main(String[] args) {

            String ageStr = "30";
            String salaryStr = "5000.50";

            int age = Integer.parseInt(ageStr);
            double salary = Double.parseDouble(salaryStr);

            double bonus = salary + 500;

            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Salary after Bonus: " + bonus);
        }
    }