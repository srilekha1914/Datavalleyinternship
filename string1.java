public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int index = 7;
        char replacement = 'x';
        String modifiedStr = str.substring(0, index) + replacement + str.substring(index + 1);
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedStr);
    }
}

