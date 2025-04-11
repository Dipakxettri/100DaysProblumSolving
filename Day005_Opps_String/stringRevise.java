package Day005_Opps_String;

public class stringRevise {
    public static void main(String[] args) {
        
        String name = "Deepak";
        String revised = "";

        for (int i = name.length()-1; i >=0; i--) {
            // System.out.println(name.charAt(i));

            revised += name.charAt(i);
        }

        System.out.println(revised);
    }
}
