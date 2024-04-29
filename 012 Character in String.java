package Day9;

public class CheckChar {
    public static void main(String[] args) {
        String Name = "vinay";
        char Target = 'v';
        if (check(Name, Target))
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
    static boolean check(String Name, char Target)
    {
        for (int i = 0; i < Name.length(); i++) {
            if (Target == Name.charAt(i))
                return true;
        }
        return false;
    }
}
