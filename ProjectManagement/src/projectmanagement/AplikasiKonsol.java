
/*

    menampung array/list objek yang dibutuhkan

    buat method add/create, search, dan delete untuk setiap array/list

    buat method untuk setiap menu (1 menu = 1 method)
    -- usahakan tidak menaruh proses i/o di dalam method
    -- gunakan parameter dan return value

    buatlah sebuah method "main menu"
    -- method ini akan menampilkan daftar menu yang ada,
    -- method menerima input pilihan menu dari user dan memanggil method menu yang sesuai
    -- usahakan menaruh semua proses i/o di dalam method ini


 */
package projectmanagement;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class AplikasiKonsol {
    
    public static void mainMenu(){
        MenuUtama menu = new MenuUtama();
        String pil;
        Scanner inStr = new Scanner(System.in); 
        Scanner inInt = new Scanner(System.in); 	
        menu.menuUtama();
        switch (pil){
            case "1" :
            {
                String username, password;
                    System.out.println("Login");
                    System.out.println("Username : ");
                    username = inStr.nextLine();
                    System.out.println("Password : ");
                    password = inStr.nextLine();
                    System.out.println ("");
                    //minus boolean for password and username checking ??
                    
                    menu.menuManajer();
                    String pilM;
                    ManajerProyek manajer = new ManajerProyek();
                        switch (pilM){
                            case "1" :
                            {
                                manajer.createProyek(deadline);
                            }
                            case "2" :
                            {
                                manajer.getProyek()
                            }
                            case "3" :
                            {
                                menu.menuUtama();
                            }
                            case "4" :
                            {
                                break;
                            }
                        }
                    
            }
            case "2" :
            {
                String username, password;
                    System.out.println("Login");
                    System.out.println("Username : ");
                    username = inStr.nextLine();
                    System.out.println("Password : ");
                    password = inStr.nextLine();
                    
                    menu.menuProgrammer();
                    String pilP;
                    Programmer prog = new Programmer();
                        switch (pilP){
                            case "1" :
                            {
                                prog.getTugas();//masih bingung
                            }
                            case "2" :
                            {
                                menu.menuUtama();
                            }
                            case "3" :
                            {
                                break;
                            }
                        }                    
            }
            case "3" :
            {
                break;
            }
        }
        
    }
    
}
