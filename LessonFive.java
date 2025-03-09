
public class LessonFive {
    public static void main(String[] args) {
        try {
            String number = "123a";
            int value = Integer.parseInt(number);
        } catch (NumberFormatException ex) { // Pleas note that there are more exception types such as
                                             // ArithmeticException, ArrayIndexOutOfBoundsException, etc.
            System.out.println("Wrong number format");
        }
    }
}