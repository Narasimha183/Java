import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListMain {
    public static ArrayList<String> names = new ArrayList<String>();
    public  static Scanner input = new Scanner(System.in);
    public static int Menu(){
        System.out.println("Available actions \n 0 to shutdown \n 1 to add \n 2 to remove");
        int user = input.nextInt();
        return user;
    }
    public static void addItems(){
        System.out.println("please enter name");
        Scanner input = new Scanner(System.in);
        String name  = input.nextLine();
        //System.out.println("Narasimha");
        names.add(name);
    }
    public static void removeItems(String name){
        for (int i = 0; i < names.size(); i++) {
           // System.out.println(names.get(i));
           // System.out.println(name);
            if(names.get(i).equals(name)){
                //System.out.println("jhdfgudhfgdfhagfdhfg");
                names.remove(i);
            }
        }
     /*   for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " ");
        }
        System.out.println("After sorting");
        names.sort(Comparator.naturalOrder());*/
        System.out.println(names);
    }
    public static void methods(int x){
        switch (x) {
            case 0:
                System.out.println("before sorting");
                for (int i = 0; i < names.size(); i++) {
                    System.out.println(names.get(i) + " ");
                }
                System.out.println("After sorting");
                names.sort(Comparator.naturalOrder());
                System.out.println(names);
                break;
            case 1:
                addItems();
                break;
            case 2:
                System.out.println("please eneter the name to remove");
                Scanner input = new Scanner(System.in);
                String name  = input.nextLine();
                removeItems(name);
                break;
            default:
                System.out.println("please eneter 0 or 1 or 2");
        }
    }
    public static void main(String[] args) {
        int option = Menu();
        while( option!= 0){
            methods(option);
            option = Menu();
        } methods(option);
    }

}
