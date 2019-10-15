/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 *
 */

import javax.swing.JFrame;

public class Kendaraan{
    private int idKendaraan;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;

    public Kendaraan() {
        this.idKendaraan = 111;
        this.jarakTempuhAwal = 0;
        this.jarakTempuh = 0;
    }

    public Kendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }
    

    public Kendaraan(int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        this.idKendaraan = idKendaraan;
        this.jarakTempuhAwal = jarakTempuhAwal;
        this.jarakTempuh = jarakTempuh;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }
    
    public float totalJarak(){
        float total = getJarakTempuhAwal() + getJarakTempuh();
        return total;
    }
    
    public float efektivitas(double x, double y){
        x = getJarakTempuh();
        double pangkat = x/Math.floor(y);
        double e = (Math.pow(Math.E, pangkat)) * Math.log10(2);
        float e1 = (float)e;
        
        if(e1 > 0 && e1 <= 0.5){
            System.out.println("EFEKTIF");
        }
        else{
            System.out.println("TIDAK EFEKTIF");
        }
        return e1;   
        
    }
   
    public void infoKendaraan(){
        System.out.println("ID Kendaraan      = " +getIdKendaraan());
        System.out.println("Jarak Tempuh Awal = " +getJarakTempuhAwal());
        System.out.println("Jarak Tempuh      = " +getJarakTempuh());
        System.out.println("Total Jarak       = " +totalJarak());
    }
    
    
}
