public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Novita Permata Ardi",20);
        mhs.tampilkanbiodata();

        System.out.println();

        mhs.setUmur(25);
        mhs.tampilkanbiodata();
    }
}
