/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 */
public class Mobil extends Kendaraan{
    private String namaKendaraan;
    private String tipeKendaraan;
    private int kapasitasMesin;
    private float bahanBakar;

    public Mobil() {
    }
    
    public Mobil(String namaKendaraan, String tipeKendaraan, int kapasitasMesin, float bahanBakar, int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        super(idKendaraan, jarakTempuhAwal, jarakTempuh);
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.kapasitasMesin = kapasitasMesin;
        this.bahanBakar = bahanBakar;
    }
 
    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }
    
    @Override
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Nama Kendaraan    = " +getNamaKendaraan());
        System.out.println("Tipe Kendaraan    = " +getTipeKendaraan());
        System.out.println("Kapasitas Mesin   = " +getKapasitasMesin());
        System.out.println("Bahan Bakar       = " +getBahanBakar());
        
    }
}
