public class LessonEight {
    public static void main(String[] args) {
        //Autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
        Integer number = 123;
        int value = number; 
        System.out.println(number + " " + value);

        //Unboxing = the reverse process of autoboxing. Automatic conversion of wrapper class to primitive
        Integer number2 = Integer.valueOf(123);
        int value2 = number2.intValue();
        System.out.println(number2 + " " + value2);

        //Generics = enable types (classes and interfaces) to be parameters when defining classes, interfaces and methods

        SampleNumber <Integer> sampleNumber = new SampleNumber<>();

        sampleNumber.setNumber(123);
        System.out.println(sampleNumber.getNumber());

    }
}

