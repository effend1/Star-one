/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 * data Member VIP.
 * @author UsmanEffendi
 * @version 1.0
 */

//Class yang mengimplementasikan interface dan Inheritance (selain JFrame)
public class MemberVIP extends Pengguna implements AktivitasMember {
    private final String memberId;
    

    public MemberVIP(String namaLengkap, String email, double beratBadan, double tinggiBadan, String memberId) {
        //Pemanggilan constructor superclass menggunakan super
        super(namaLengkap, email, beratBadan, tinggiBadan);
        this.memberId = memberId;
    }

    public String getMemberId() { return memberId; }

    //Overloading (Method dengan nama sama, parameter berbeda)
    public void bookingKelas(String namaKelas) {
        System.out.println(super.getNamaLengkap() + " membooking kelas " + namaKelas);
    }

    public void bookingKelas(String namaKelas, String jam) {
        System.out.println(super.getNamaLengkap() + " membooking kelas " + namaKelas + " pada jam " + jam);
    }

    //Overriding (Menimpa method dari interface)
    @Override
    public void tampilkanInfo() {
        //Pemanggilan method superclass menggunakan super
        System.out.println("Nama: " + super.getNamaLengkap() + " | ID: " + this.memberId);
    }
}
