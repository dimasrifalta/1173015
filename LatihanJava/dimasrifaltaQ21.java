import java.util.Scanner;

public class dimasrifaltaQ21 {

    public static void main (String[] args){

        // tutorialif else if statement
         Scanner userInput = new Scanner(System.in);
        int nilai;
        String nama;

        

        System.out.println("Nama : dimas rifalta");
        System.out.println("NP : 1173015");

        System.out.print("Masukan Nilai anda Matematika anda = ");
        nilai = userInput.nextInt();

         System.out.print("Masukan Nama anda  = ");
        nama = userInput.next();

       /*  System.out.print("Masukan tempat anda berasal ");
        nilai = userInput.nextInt(); */

        // if else if statement
        if(nilai > 80&& nilai <=100){ 
       
               System.out.print("\n Anda mendapat grade A dan anda lulus" + nama);
        }else if(nilai > 65&& nilai <=80){ 
            System.out.print("\n Anda mendapat grade B dan anda lulus" + nama);
            
            } else if(nilai > 40&& nilai <=65){ 
            System.out.print("\n Anda mendapat grade C anda tidak lulus" nama);
            
            } else{
                System.out.print("\n Anda mendapat grade D  anda tidak lulus" nama);
            }


       



    }
}
