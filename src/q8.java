public class q8 {
        static void validateCode(String code) {

            boolean starts = code.startsWith("EMP");
            boolean containsDept = code.contains("FIN");
            boolean ends = code.endsWith("2042");

            System.out.println("Starts with EMP: " + starts);
            System.out.println("Contains Department Code: " + containsDept);
            System.out.println("Ends with 4-digit Number: " + ends);
        }

        public static void main(String[] args) {

            String empCode = "EMP-FIN-2042";

            validateCode(empCode);
        }

}
