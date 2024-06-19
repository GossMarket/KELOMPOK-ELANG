/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */
import java.util.Scanner;

public class Hitung_Pegas_Dan_Hitung_Tegangan {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (true) {
            tampilkanMenuUtama();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hitungPegas();
                    break;
                case 2:
                    hitungTegangan();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
    
    static void tampilkanMenuUtama() {
        System.out.println("Menu Utama:");
        System.out.println("1. Hitung Pegas");
        System.out.println("2. Hitung Tegangan Pegas");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
    }
    
    static void hitungPegas() {
        while (true) {
            tampilkanMenuPegas();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hitungGayaPegas();
                    break;
                case 2:
                    hitungKonstantaPegas();
                    break;
                case 3:
                    hitungPertambahanPanjangPegas();
                    break;
                case 4:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
    
    static void tampilkanMenuPegas() {
        System.out.println("\nMenu Pegas:");
        System.out.println("1. Hitung gaya yang bekerja pada pegas");
        System.out.println("2. Hitung konstanta pegas");
        System.out.println("3. Hitung pertambahan panjang pegas");
        System.out.println("4. Kembali ke Menu Utama");
        System.out.print("Pilih menu: ");
    }
    
    static void hitungGayaPegas() {
        System.out.print("Masukkan konstanta pegas (N/m): ");
        double k = scanner.nextDouble();
        System.out.print("Masukkan pertambahan panjang pegas (m): ");
        double x = scanner.nextDouble();
        
        double F = k * x;
        System.out.println("Gaya yang bekerja pada pegas adalah: " + F + " N");
    }
    
    static void hitungKonstantaPegas() {
        System.out.print("Masukkan gaya yang bekerja pada pegas (N): ");
        double F = scanner.nextDouble();
        System.out.print("Masukkan pertambahan panjang pegas (m): ");
        double x = scanner.nextDouble();
        
        double k = F / x;
        System.out.println("Konstanta pegas adalah: " + k + " N/m");
    }
    
    static void hitungPertambahanPanjangPegas() {
        System.out.print("Masukkan gaya yang bekerja pada pegas (N): ");
        double F = scanner.nextDouble();
        System.out.print("Masukkan konstanta pegas (N/m): ");
        double k = scanner.nextDouble();
        
        double x = F / k;
        System.out.println("Pertambahan panjang pegas adalah: " + x + " m");
    }
    
    static void hitungTegangan() {
        while (true) {
            tampilkanMenuTegangan();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hitungTeganganPegas();
                    break;
                case 2:
                    hitungLuasPenampangPegas();
                    break;
                case 3:
                    hitungGayaPegasTegangan();
                    break;
                case 4:
                    return; // Kembali ke menu utama
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        }
    }
    
    static void tampilkanMenuTegangan() {
        System.out.println("\nMenu Tegangan Pegas:");
        System.out.println("1. Hitung tegangan pada pegas");
        System.out.println("2. Hitung luas penampang pegas");
        System.out.println("3. Hitung gaya yang bekerja pada pegas");
        System.out.println("4. Kembali ke Menu Utama");
        System.out.print("Pilih menu: ");
    }
    
    static void hitungTeganganPegas() {
        System.out.print("Masukkan gaya yang bekerja pada pegas (N): ");
        double F = scanner.nextDouble();
        System.out.print("Masukkan luas penampang pegas (m^2): ");
        double A = scanner.nextDouble();
        
        double stress = F / A;
        System.out.println("Tegangan pada pegas adalah: " + stress + " N/m^2");
    }
    
    static void hitungLuasPenampangPegas() {
        System.out.print("Masukkan gaya yang bekerja pada pegas (N): ");
        double F = scanner.nextDouble();
        System.out.print("Masukkan tegangan pada pegas (N/m^2): ");
        double stress = scanner.nextDouble();
        
        double A = F / stress;
        System.out.println("Luas penampang pegas adalah: " + A + " m^2");
    }
    
    static void hitungGayaPegasTegangan() {
        System.out.print("Masukkan tegangan pada pegas (N/m^2): ");
        double stress = scanner.nextDouble();
        System.out.print("Masukkan luas penampang pegas (m^2): ");
        double A = scanner.nextDouble();
        
        double F = stress * A;
        System.out.println("Gaya yang bekerja pada pegas adalah: " + F + " N");
    }
}

