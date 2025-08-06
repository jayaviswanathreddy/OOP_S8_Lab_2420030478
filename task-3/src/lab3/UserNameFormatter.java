package lab3;
public class UserNameFormatter {
    public static void main(String[] args) {
        String name = "  rAjEsh ";
        name.trim();
        name.toLowerCase();
        name.replace("a", "@");
        System.out.println("Formatted Name: " + name);
    }
}