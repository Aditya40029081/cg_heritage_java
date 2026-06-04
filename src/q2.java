public class q2 {
        public static void main(String[] args) {

            String employeeName1 = new String("John");
            String employeeName2 = new String("John");

            String department = "Finance";
            String email = "john@gmail.com";

            System.out.println("Department: " + department);
            System.out.println("Email: " + email);


            System.out.println("Using == : " + (employeeName1 == employeeName2));


            System.out.println("Using equals(): " + employeeName1.equals(employeeName2));
        }
}
