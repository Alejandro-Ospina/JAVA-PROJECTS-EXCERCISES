
package Main;

//  @author new53

import Entity.FamousSinger;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class EjercicioE2 {

    public static void main(String[] args) {
        //first part of task
        Scanner read = new Scanner(System.in);
        FamousSinger singers[] = new FamousSinger[5];
        System.out.println("Now, we create 5 famous singers objects...");
        for(int i=0; i<singers.length; i++){
            singers[i] = new FamousSinger();
            System.out.print("Write the name of singer #" + (i+1) + ": ");
            singers[i].setSingerName(read.nextLine());
            System.out.print("Number of copies selled for the best disc for singer " + (i+1) + ": ");
            singers[i].setDiscCopiesBestSelled(read.nextInt());
            read.nextLine();
        }
        //Second part of task;
        LinkedList<FamousSinger> singerList = new LinkedList<>();
        Collections.addAll(singerList, singers);
        System.out.println("\nOPTIONS MENU...");
        System.out.println("1. Add another famous singer to list" + 
                "\n2. Delete a singer from list" + 
                "\n3. Show singer list details " + 
                "\n4. Exit");
        System.out.print("\nWrite the option: ");
        int option;
        do{
            option = read.nextInt();
            read.nextLine();
            switch(option){
                case 1:
                    System.out.print("Name of new singer: ");
                    String name = read.nextLine();
                    System.out.print("Number of disc selled: ");
                    int sells = read.nextInt();
                    read.nextLine();
                    singerList.add(new FamousSinger(name, sells));
                    break;
                case 2:
                    System.out.print("Type the name of singer you wish to remove from list: ");
                    String nameToErase = read.nextLine();
                    boolean isInList = false;
                    for(FamousSinger fs : singerList){
                        if(fs.getSingerName().equalsIgnoreCase(nameToErase)){
                            singerList.remove(fs);
                            isInList = true;
                            break;
                        }
                    }
                    if(!isInList){
                        System.out.println("¡Sorry! Singer not found in list");
                    }else{
                        System.out.println("¡Singer has been removed form list successfully!");
                    }
                    break;
                case 3:
                    System.out.println(singerList);
                    break;
                case 4:
                    System.out.println("¡Thanks for using the service!");
                    break;
                default:
                    System.out.println("¡Invalid option!");
                    break;
            }
            if(option == 4){
                break;
            }else{
                System.out.print("\nTry another option: ");
            }
        }
        while(true);
    }
}