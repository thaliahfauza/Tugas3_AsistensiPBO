
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 */
public class MainClass {
    public static void main(String[] args) {
        Mobil a = new Mobil();      
        
        a.setIdKendaraan(1111);
        
        //Jarak tempuh harus lebih dari 0 sampai 500 km.
        float jarakTempuh= 500;
        a.setJarakTempuh(jarakTempuh);
        
        //Bahan bakar harus lebih dari 0 sampai 500 mL.
        float bahanBakar = 500;
        a.setBahanBakar(bahanBakar);
                
        a.setJarakTempuhAwal(100);
        a.setNamaKendaraan("Mini Cooper");
        a.setTipeKendaraan("Matic");
        a.setKapasitasMesin(1200);
        
        a.infoKendaraan();
        System.out.println("Efektivitas       = " +a.efektivitas(jarakTempuh, bahanBakar));
        System.out.println("==========================================================");
        
        SepedaMotor b = new SepedaMotor();      
        
        b.setIdKendaraan(2222);
        //Jarak tempuh harus lebih dari 0 sampai 500 km.
        float jarakMotor= 100;
        b.setJarakTempuh(jarakMotor);
        
        //Bahan bakar harus lebih dari 0 sampai 500 mL.
        float bahanBakarMotor = 200;
        b.setBahanBakar(bahanBakarMotor);
                
        b.setJarakTempuhAwal(100);
        b.setNamaKendaraan("Ninja");
        b.setTipeKendaraan("Matic");
        
        b.infoKendaraan();
        System.out.println("Efektivitas       = " +b.efektivitas(jarakMotor, bahanBakarMotor));
    }
}
