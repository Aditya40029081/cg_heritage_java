public class q9{
        public static void main(String[] args) {

            String name = "Rajat";
            double salary = 10000;
            String department = "CSE";
            boolean isActive = true;

            String performance = (salary > 5000) ? "Excellent" : "Good";

            System.out.println(
                    "Employee Name: " + name +
                            "Department: " + department +
                            "Salary: " + salary +
                            "Active: " + isActive +
                            "Performance: " + performance
            );
        }
}
