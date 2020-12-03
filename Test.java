
public class Test {

    public static void main(String[] args) {

        int[] age = { 1, 8, 5, 55, 3, -9, 3, 2, 9 };

        for (int j = 0; j < age.length - 1; j++) {

            for (int i = 0; i < age.length - 1; i++) {
                if (age[i] < age[i + 1]) {
                    int temp = age[i];
                    age[i] = age[i + 1];
                    age[i + 1] = temp;
                }
            }

        }

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

    }
}
