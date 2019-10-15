/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 */
public class SepedaMotor extends Kendaraan{
    private String namaKendaraan;
    private String tipeKendaraan;
    private float bahanBakar;

    public SepedaMotor() {
    }

    public SepedaMotor(String namaKendaraan, String tipeKendaraan, float bahanBakar) {
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.bahanBakar = bahanBakar;
    }

    public SepedaMotor(String namaKendaraan, String tipeKendaraan, float bahanBakar, int idKendaraan, float jarakTempuhAwal, float jarakTempuh) {
        super(idKendaraan, jarakTempuhAwal, jarakTempuh);
        this.namaKendaraan = namaKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.bahanBakar = bahanBakar;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }
    
    @Override
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("Nama Kendaraan    = " +getNamaKendaraan());
        System.out.println("Tipe Kendaraan    = " +getTipeKendaraan());
        System.out.println("Bahan Bakar       = " +getBahanBakar());
    }
}
