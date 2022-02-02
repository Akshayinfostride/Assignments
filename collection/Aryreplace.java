package collection;
import java.util.ArrayList;
import java.util.Scanner;
public class Aryreplace
{


    ArrayList<String> collection = new ArrayList<>();
    void collectData(){
        collection.add("Stupid");
        collection.add("Idiot");
        System.out.println(collection);
    }
    public void check() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bad word: ");
        String s1 = sc.nextLine();
        for(String e : collection) {
            s1=s1.replace(e, "***");
        }
        System.out.println(s1);
    }


    public static void main(String[] args) {
        Aryreplace obj = new Aryreplace();
        obj.collectData();
        obj.check();
    }
}
