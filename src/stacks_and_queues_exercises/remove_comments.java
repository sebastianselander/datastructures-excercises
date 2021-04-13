package stacks_and_queues_exercises;

public class remove_comments {

    private static String openingComment = "(*/";
    private static String closingComment = ")*\\";

    public static String removeComments (String text) {
        StringBuilder fixedString = new StringBuilder();
        char[] list = text.toCharArray();
        boolean comment = false;
        for (int i = 0; i < list.length; i++){
            if (openingComment.contains(list[i]+"") && (openingComment.contains(list[i+1]+""))) {
                System.out.println("i: " + list[i]+"");
                System.out.println("i + 1: " + list[i+1]+"");
                comment = true;
            } else if (closingComment.contains(list[i]+"") && (closingComment.contains(list[i+1]+""))){
                comment = false;
                i += 2;
            }
            if (!comment) fixedString.append(list[i]);
        }
        return fixedString.toString();
    }

    public static void main(String[] args) {
        String test = "This is a test string to see/* this should be gone *\\ if my method works";
        System.out.println(removeComments(test));
    }
    // ---- Complexity of the method is:
    // O(n) (copy the string to charArray) + O(n) (traverse the array) * O(1) (append a character when traversing the array)
    //thus its time complexity is O(n)
}
