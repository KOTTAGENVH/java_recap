public class LessonSix {
    public static void main(String[] args) {
        //As strings are immutable, Java provides two other classes to support mutable strings
        //StringBuffer and StringBuilder
        //StringBuffer is synchronized and slower than StringBuilder (Thread-safe)
        //StringBuilder is not synchronized and faster than StringBuffer
        //Both classes have the same methods as the String class
        //The following code demonstrates the use of the StringBuilder class
        StringBuilder greeting = new StringBuilder("Hello");
        int greetLength = greeting.length();
        for (int i = 0; i < greetLength; i++) {
            System.out.print(greeting.charAt(i));
        }
        System.out.print(" ");
        StringBuffer greeting2 = new StringBuffer("Hello");
        int greetLength2 = greeting2.length();
        for (int i = 0; i < greetLength2; i++) {
            System.out.print(greeting2.charAt(i));
        }
    }
}
