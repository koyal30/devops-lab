//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String s = "omkar";
        basic(s, s.length() - 1);

    }


    public static void basic(String s, int idx) {
        if (idx == 0) {
            System.out.print(s.charAt(idx));
return;
        }
        System.out.print(s.charAt(idx));
        basic(s, idx - 1);


    }
}