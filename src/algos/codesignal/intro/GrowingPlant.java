package algos.codesignal.intro;

public class GrowingPlant {

    static int solution(int upSpeed, int downSpeed, int desiredHeight) {
        int height = 0;
        int days = 0;

        while (height < desiredHeight) {
            days++;
            height += upSpeed;
            if (height >= desiredHeight) {
                break;
            }
            height -= downSpeed;
        }
        System.out.println(days);
        return days;
    }

    public static void main(String[] args) {
        solution(5, 2, 7);
    }
}
