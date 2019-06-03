package SetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        HashMap<String,String> phonebook = new HashMap<>();


        while (!"search".equals(input)) {
            String[] command = input.split("-");
            String name = command[0];
            String number = command[1];
//            if(!phonebook.containsKey(name)){
//                phonebook.put(name,number);
//            }else{
//                phonebook.put(name,number);
//            }
            phonebook.put(name,number);


            input = scanner.nextLine();
        }

        String call = scanner.nextLine();
        while(!call.equals("stop")){

            if(phonebook.containsKey(call)){
                System.out.println(String.format("%s -> %s"
                ,call, phonebook.get(call)));
            }else{
                System.out.printf("Contact %s does not exist.\n",call);
            }

            call = scanner.nextLine();
        }
    }
}
