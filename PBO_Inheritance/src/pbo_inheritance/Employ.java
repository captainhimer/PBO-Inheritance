package pbo_inheritance;
public class Employ extends Person
{
    private String noKaryawan;
    //konstruktor
    public Employ (String noKaryawan, String nama, int usia)
    {
        super(nama, usia);
        this.noKaryawan = noKaryawan;
    }
    //metode
    public void info()
    {
        System.out.println("No. Karyawan : "+this.noKaryawan);
        super.info();
    }
    
    
}
