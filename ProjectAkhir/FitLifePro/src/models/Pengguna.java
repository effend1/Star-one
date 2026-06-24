/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
/**
 *
 * @author UsmanEffendi
 */

//Menerapkan class, object, method
public class Pengguna {
    //Enkapsulasi (private modifier)
    private String namaLengkap;
    private String email;
    private double beratBadan;
    private double tinggiBadan;

    //Constructor
    public Pengguna(String namaLengkap, String email, double beratBadan, double tinggiBadan) {
        this.namaLengkap = namaLengkap;
        this.email = email;
        this.beratBadan = beratBadan;
        this.tinggiBadan = tinggiBadan;
    }

    // Getter dan Setter (Bagian dari Enkapsulasi)
    public String getNamaLengkap() { return namaLengkap; }
    public double getBeratBadan() { return beratBadan; }
    public double getTinggiBadan() { return tinggiBadan; }
    

    //Menghitung BMI (Body Mass Index)
    public double hitungBMI() {
        double tinggiMeter = tinggiBadan / 100.0;
        return beratBadan / (tinggiMeter * tinggiMeter);
    }
    
    // Logika OOP: Rekomendasi berdasarkan BMI
    public String getRekomendasiWorkout() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Status: Underweight\nGerakan: Bulking, Push Up (3x10), Angkat Beban Ringan.";
        } else if (bmi > 25.0) {
            return "Status: Overweight\nGerakan: Cardio, Jumping Jack (3x15), Lari Santai 15 Menit.";
        } else {
            return "Status: Normal / Ideal\nGerakan: Maintenance, Plank 1 Menit, Squat, Sit Up.";
        }
    }
    
    //public String getEmail() { return email; }
    //public void setEmail(String email) { this.email = email; }
}
