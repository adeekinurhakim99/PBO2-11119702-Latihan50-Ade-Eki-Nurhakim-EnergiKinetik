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
public class Main {
    public static void main(String[] args) {
        Energi e = new Energi();
        System.out.println("Sebuah Basseball dilempar dengan :");
        System.out.println("Massa Bola : "+e.getMassa());
        System.out.println("Kecepatan Bola : "+e.getKecepatan());
        System.out.println("Energi Kinetik = "+e.energiKinetik());
        System.out.println("Usaha bola untuk mencapai kecepatan = "+e.usaha());
        }
    }
