/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package models;
/**
 *
 * @author UsmanEffendi
 */

//Mendefinisikan interface dengan method abstrak dan default
public interface AktivitasMember {
    void tampilkanInfo();// Method abstrak
    default void sapaMember() { // Method default
        System.out.println("Selamat datang di FitLifePro!");
    }
}
