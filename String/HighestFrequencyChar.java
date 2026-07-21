public class HighestFrequencyChar {

    public static void highestFrequency(String str) {

        boolean[] visited = new boolean[str.length()];

        int max = 0;
        char ch = ' ';

        for (int i = 0; i < str.length(); i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > max) {
                max = count;
                ch = str.charAt(i);
            }
        }

        System.out.println(ch + " ---> " + max);
    }

    public static void main(String[] args) {

        highestFrequency("banana");

    }

}
