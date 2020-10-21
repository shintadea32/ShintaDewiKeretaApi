/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg2;

/**
 *
 * @author Lenovo
 */import java.util.Scanner;
public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String Menu="";
    int Pilihan, JumlahTiket,Harga;
    int Total=0;
    Scanner scan = new Scanner(System.in);
    
        System.out.println("             PEMESANAN TIKET KERETA API               ");
        System.out.println("            -----------------------------             ");
        System.out.println("           Daftar Harga Tiket Kereta Api              ");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("NO  NAMA KERETA DAN TUJUAN                HARGA TIKET");
        System.out.println("1.  DHOHO ke JOMBANG                      Rp 35.000.-");
        System.out.println("2.  DHOHO ke KEDIRI                       Rp 40.000.- ");
        System.out.println("3.  MATARMAJA ke MALANG                   RP 65.000.-");
        System.out.println("4.  MATARMAJA ke SOLO                     RP 70.000.-");
        System.out.println("5.  GAJAYANA ke MADIUN                    RP 55.000.-");
        System.out.println("6.  GAJAYANA ke PURWOKERTO                RP 75.000.-");
        System.out.println("7.  DHOHO ke SURABAYA                     RP 30.000.-");
        System.out.println("-----------------------------");
    
    System.out.println("Masukan Nomor Tiket Yang Ingin Anda Pesan :");
    Pilihan = scan.nextInt();
     switch (Pilihan){  
        case 1: 
    System.out.println("Pesanan Anda DHOHO ke JOMBANG      Rp 35.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 35000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
     System.out.println("Segera Datang Ke Dianmart atau Aprilnmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 2: 
    System.out.println("Pesanan Anda DHOHO ke KEDIRI         Rp 40.000.- ");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 40000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               "); 
    break;                     
        case 3:
    System.out.println("Pesanan Anda MATARMAJA ke MALANG            RP 65.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 65000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 4:
    System.out.println("Pesanan Anda MATARMAJA ke SOLO        RP 70.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 70000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 5: 
    System.out.println("Pesanan Anda GAJAYANA ke MADIUN         RP 55.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 55000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 6: 
    System.out.println("Pesanan Anda GAJAYANA ke PURWOKERTO         RP 75.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 75000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;                     
        case 7: 
    System.out.println("Pesanan Anda DHOHO ke SURABAYA       RP 30.000.-");
    System.out.print("Masukan Jumlah Tiket Yang Ingin Anda Pesan :");
    JumlahTiket=scan.nextInt();
    Harga= 30000 *JumlahTiket;
    System.out.println("Harga pesanan = Rp. "+Harga);
    System.out.println("Total pembayaran Rp "+Harga+" untuk "+JumlahTiket+" Tiket");
    Total=Total+Harga;
    System.out.println("Segera Datang Ke Dianmart atau Aprilmart untuk melakukan pembayaran ");
    System.out.println("                -TERIMA KASIH-               ");
    break;  
             }
        }
}
        
        
                
        
        
    
    

