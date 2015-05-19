public class testmahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa("Tika Kusuma Wardhani",29);
        mhs.tampilkanbiodata();

        System.out.println();

        mhs.setUmur (25);
        mhs.tampilkanbiodata();
    }
}