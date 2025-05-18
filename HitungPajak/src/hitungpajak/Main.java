
package hitungpajak;

import java.util.Scanner;

/**
 *
 * @author Lenovo ID
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pajak smartphone = new Pajak();
        
        System.out.print("masukan vendor : ");
        smartphone.setVendor(input.nextLine());
           
        System.out.print("masukan tipe : ");
        smartphone.setTipe(input.nextLine());
        
        System.out.print("masukan harga : ");
        smartphone.setHarga(input.nextDouble());
          
        smartphone.tampilkanInfo();
    }   
}
