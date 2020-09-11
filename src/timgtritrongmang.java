import java.util.Scanner;

public class timgtritrongmang {
    public static void main(String[] args) {
        String[] student = {"Hoa", "Mai","Hong","Nam","Lan","Dung"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String input_name = scanner.nextLine();
        boolean check = false;
        for (int i=0; i<student.length; i++) {
            if ( student[i].equals(input_name)){
                System.out.println("Position of the students in the list "+ input_name + " is: " + (i+1));
                check= true;
                break;
            }
        }
        if(!check)
            System.out.println("Not found " + input_name + " in the list.");
    }
}
