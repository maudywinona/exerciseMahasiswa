/**
 * Created by Maudy on 19/05/2015.
 */
public class Mahasiswa {
    private String nama;
    private int umur;

    public String getNama(){
       return nama;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public Mahasiswa(String nama,int umur){
        this.nama=nama;
        this.umur=umur;
    }

    public void tampilkanbiodata(){
        System.out.println("***biodata mahasiswa***");
        System.out.println("nama mahasiswa="+nama);
        System.out.println("umur mahasiswa="+umur);
    }

    public int getUmur(){
        return umur;
    }

    public void setUmur(int umur){
        this.umur=umur;
    }

}
