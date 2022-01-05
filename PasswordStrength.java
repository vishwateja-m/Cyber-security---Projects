import java.util.*;

class Password {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("       PASSWORD STRENGTH TEST     ");
        System.out.println("------------------------------------------");
        System.out.print("Enter Your Password: ");
        String inputPassword = sc.next();
        int uppercase = 0;
        int lowercase = 0;
        int specialcharacters = 0;
        int digits = 0;
        char[] Password = inputPassword.toCharArray();
        for (int index = 0; index < inputPassword.length(); index++)
        {
            if (Character.isUpperCase(Password[index]))
            {
                uppercase = 1;
            }
            else if (Character.isLowerCase(Password[index]))
            {
                lowercase = 1;
            }
            else if (Character.isDigit(Password[index]))
            {
                digits = 1;
            }
        }
        if (inputPassword.contains("~") || inputPassword.contains("!") || inputPassword.contains("@")
                || inputPassword.contains("#") || inputPassword.contains("$") || inputPassword.contains("%")
                || inputPassword.contains("_")|| inputPassword.contains("^") || inputPassword.contains("&") || inputPassword.contains("*"))
        {
            specialcharacters = 1;
        }
        if (inputPassword.length() < 8)

            System.out.println("Too short");

        else if (inputPassword.length() >= 8 && uppercase == 1 && lowercase == 1 && digits == 1 && specialcharacters == 1)

            System.out.println("Strong Password");

        else if ((inputPassword.length() >= 8 && ((uppercase == 1 || lowercase == 1) && (digits == 1 || specialcharacters == 1))))

            System.out.println("Medium");

        else if (inputPassword.length() >= 8)

            System.out.println("Weak Password");
    }
}
