package PBO_Inheritance;
import java.util.Scanner;
public class Mapel_sub2 {
    public static void main(String[] args) {
        int choice;
        Scanner data = new Scanner (System.in);
        System.out.println("===========================");
        System.out.println("1. Produktif R2");
        System.out.println("2. DDG R2");
        System.out.println("3. Bahasa Inggris R2");
        System.out.println("Masukan pilihan");
        choice = data.nextInt();
        
        switch (choice){
            case 1 :
                if(choice == 1);
                Mapel_sub1 ts = new Mapel_sub1 ("Muhammad Arifin", "Produktif RPL","setiap hari");
                ts.info();
            break;
            case 2 :
                if(choice == 2);
                Mapel_sub1 ts2 = new Mapel_sub1 ("Ayatullah Firmansyah", "Dasar Desain Grafis","Rabu");
                ts2.info();
            break;
            case 3 :
                if(choice == 3);
                Mapel_sub1 ts3 = new Mapel_sub1 ("Ardhian Suseno", "Bahasa Inggris","Selasa");
                ts3.info();
            break;
            default:
                System.out.println("Maaf pilihan anda tidak tersedia");       
        }
        System.out.println("============================");
    }    
}






