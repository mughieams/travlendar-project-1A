/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class transportasi extends Kegiatan{
    public String jenis_kendaraan;
    
    public void jenisKendaraan(String kendaraan){
        jenis_kendaraan = kendaraan;
    }
    
    public String jenis_kendaraan(String jeniskendaraan){
        return "kendaraan " + jeniskendaraan;
    }
}
