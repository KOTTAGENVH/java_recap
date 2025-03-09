import utils.mathUtils;

public class LessonTwo {
    public static void main(String[] args) {
        int number = 4;
        int likes = 4035;
        int dislikes = 4;
        double total = mathUtils.ratio(likes, dislikes);
        System.out.println(total);
    }
}
