package PBO_Inheritance;
public class MapelSuper {
    private String nama;
    private String matpel;
    private int usia;
    
    public MapelSuper(String nama, String matpel)
    {
        this.nama = nama;
        this.matpel = matpel;
    }
    public void info()
    {
        System.out.println("Nama  : "+this.nama);
        System.out.println("Mapel : "+this.matpel);
    }  
}
