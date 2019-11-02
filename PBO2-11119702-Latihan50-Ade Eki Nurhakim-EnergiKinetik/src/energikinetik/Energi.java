/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energikinetik;

/**
 *
 * @author Ekiw
 */
public class Energi {
    private int massa;
    private int kecepatan;
    public Energi(){
    massa=145;
    kecepatan=25;
}

    
    public int getMassa() {
        return massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }
    public double energiKinetik(){
        return 0.5*massa*kecepatan*kecepatan;
    }
    public double usaha(){
        return 0.5*massa*(0*0)-(25*25);
    }
}
