public class FrequencyOfChar {

    public static void frequencyOfChar(String str) {

        boolean[] isVisited = new boolean[str.length()];

        for (int i = 0; i < str.length(); i++) {
            if(isVisited[i]) {
                continue;
            }
            int count = 1;
            for(int j =i+1; j<str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                    isVisited[j] = true;
                }
            }
            System.out.println(str.charAt(i)+"--->"+count);
        }

    }
    public static void main(String[] args) {
        String str = "maddd";
        frequencyOfChar(str);
    }
}
