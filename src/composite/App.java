

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.Scanner;

/**
 *
 * @author Esma Haber
 */

/*
public class App {
    
 public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
     
        Kategori items = new Kategori("Menü");
        Kategori fiyatlar = new Kategori("Fiyat");
        Urunler fiyat = new Urunler("Fiyat", "0 TL");

        //alt kategoriler
        Kategori yiyecekler = new Kategori("Yiyecekler");
        Kategori icecekler = new Kategori("İçecekler");
        

        //Ürünler
        Urunler yemek = new Urunler("Karnıyarık", "25 TL");
        Urunler icecek = new Urunler("Ayran", "2 TL");
        
        //input yiyecek ekle
        System.out.println("Yiyecek Ekle");
        String yiyecekName = scn.nextLine();
        System.out.println("Yiyecek Fiyatı Ekle");
        String yiyecekInputFiyat = scn.nextLine();
        Urunler yiyecekInputGonder = new Urunler (yiyecekName, yiyecekInputFiyat );
       
        //input içecek ekle
        System.out.println("İçecek Ekle");
        String icecekName = scn.nextLine();
        System.out.println("İçecek Fiyatı Ekle");
        String icecekInputFiyat = scn.nextLine();
        Urunler icecekInputGonder = new Urunler (icecekName, icecekInputFiyat );
        
         //alt kategori
        System.out.println("Yeni kategori oluştur");
        String yeniKategori = scn.nextLine();
        Kategori yeniKategoriGonder = new Kategori(yeniKategori);
        
        
       

        // En üst hiyerarşi.
        items.add(yiyecekler);
        items.add(icecekler);
        // Altkategoriye yemek ve içecek düğümleri ekleniyor.
        yiyecekler.add(yemek);
        yiyecekler.add(new Urunler("İskender", "35 TL"));
        icecekler.add(icecek);
        
        //input Ekle
        icecekler.add(icecekInputGonder);
        yiyecekler.add(yiyecekInputGonder);
        
        
        //fiyat ekleniyor
        fiyatlar.add(fiyat);

        items.drawHierarchy();

        //             -Menü
        //             --Yemekler
        //             ----Karnıyarık
        //             --İçecekler
        //             ----Ayran

    }
    
    
}
*/