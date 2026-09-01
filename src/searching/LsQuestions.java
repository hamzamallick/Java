package searching;

public class LsQuestions {

    static void main(String[] args) {

        String name = "Hamza";
        boolean ans = linearSearch(name, 'a');
        System.out.println(ans);


    }


    static boolean linearSearch(String str, char target) {

        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target) {
                return true;
            }

        }

        return false;
    }
}
