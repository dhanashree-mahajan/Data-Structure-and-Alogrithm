import java.util.HashMap;
public class isomorphic2 {

        public static void main(String[] args) {

            String s = "badc";
            String t = "baba";

            HashMap<Character, Character> map = new HashMap<>();

            boolean isomorphic = true;

            for (int i = 0; i < s.length(); i++) {

                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);

                if (map.containsKey(ch1)) {

                    if (map.get(ch1) != ch2) {
                        isomorphic = false;
                        break;
                    }

                } else {

                    if (map.containsValue(ch2)) {
                        isomorphic = false;
                        break;
                    }

                    map.put(ch1, ch2);
                }
            }

            if (isomorphic)
                System.out.println("Isomorphic");
            else
                System.out.println("Not Isomorphic");
        }
    }

