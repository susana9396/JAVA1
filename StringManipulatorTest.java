public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String str = manipulator.trimAndConcat("    Hola     ", "     Mundo    ");
        System.out.println(str); // HolaMundo

        char letter = 'n';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hola Mundo", letter);
        Integer c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // null

        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        Integer x = manipulator.getIndexOrNull(word, subString);
        Integer y = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(x); // 2
        System.out.println(y); // null

        String mundo = manipulator.concatSubstring("Hola", 1, 2, "mundo");
        System.out.println(mundo); // omundo

    }
}