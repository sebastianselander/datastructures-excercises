package interleave_strings;

public class interleave_strings {

    public static void main(String[] args) {
        String first = "Anna";
        String second = "Patrik";
        String interleft = interleave(first, second);
        System.out.println(interleft);


    }

    public static String interleave(String first, String second) {
        StringBuilder result = new StringBuilder();
        char[] secondArray = second.toCharArray();

        result.append(lowerCase(first));
        for (int i = 0; i < secondArray.length; i++) {
            if (i > first.length()) {
                result.append(Character.toLowerCase(secondArray[i]));
            } else {
                result.insert(i * 2, Character.toLowerCase(secondArray[i]));
            }
        }
        return result.toString();
    }

    public static String lowerCase(String string){
        String result = "";
        for (char c : string.toCharArray()){
            result += Character.toLowerCase(c);
        }
        return result;
    }
}
