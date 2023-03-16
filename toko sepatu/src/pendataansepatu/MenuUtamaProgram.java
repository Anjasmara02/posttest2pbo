
package pendataansepatu;
import java.io.IOException;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Scanner;

public class MenuUtamaProgram {
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static tokosepatu Brg = new tokosepatu();//OBJEK
    static ArrayList<tokosepatu> BrgList;//ARRAYLIST
    
    public static void menu () throws IOException{
        Boolean ulang,ulang2;
        System.out.println("|==================================================================|");
        System.out.println("|SELAMAT DATANG DI APLIKASI TOKO SEPATU|");
        System.out.println("|==================================================================|");
        ulang = true;
        while (ulang) {
            menuAwal();
            switch (option) {
                case "1":
                ulang2=true;
                while(ulang2){
                menuKedua();
                    switch (admin){
                        case "1":
                            Brg.tambahBarang();
                            break;
                        case "2":
                            Brg.tampilBarang();
                            break;
                        case "3":
                            Brg.ubahBarang(BrgList);
                            break;
                        case "4":
                            Brg.hapusBarang();
                            break;
                        case "5":
                            ulang2=false;
                            break;
                        case "6":
                            System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                            System.exit(0);
                        default:
                            System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                            break;
                    }
                }
                break;
                case "2":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);

                default:
                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                break;
            }
        } 
    }
    public static String menuKedua (){
        System.out.println();
        System.out.println("\t|==================================================|");
        System.out.println("\t|            PROGRAM PENDATAAN BARANG TOKO  |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                  PILIH MENU                      |");
        System.out.println("\t|==================================================|");
        System.out.println("\t|                                                  |");
        System.out.println("\t|                 1. TAMBAH DATA BARANG            |");
        System.out.println("\t|                 2. TAMPIL DATA BARANG            |");
        System.out.println("\t|                 3. UBAH DATA BARANG              |");
        System.out.println("\t|                 4. DELETE DATA BARANG            |");
        System.out.println("\t|                 5. KEMBALI KE MENU AWAL          |");
        System.out.println("\t|                 6. EXIT PROGRAM                  |");
        System.out.println("\t|==================================================|");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static String menuAwal (){
      System.out.println();
      System.out.println("\t|==================================================|");
      System.out.println("\t|       PROGRAM PENDATAAN BARANG TOKO  |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                PILIH MENU                        |");
      System.out.println("\t|==================================================|");
      System.out.println("\t|                                                  |");
      System.out.println("\t|           1. DATA BARANG                         |");
      System.out.println("\t|           2. EXIT PROGRAM                        |");
      System.out.println("\t|==================================================|");
      System.out.print("Masukan Pilihan menu : ");
      option = input.nextLine();
      return option;
    }


    public static void main(String[] args) throws IOException  {
       menu();
    }
    
}
