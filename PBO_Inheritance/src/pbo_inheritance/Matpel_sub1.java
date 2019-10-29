package pbo_inheritance;
public class Matpel_sub1 extends Matpel {
    public Matpel_sub1(String senin, String selasa, String rabu, String kamis, String jumat){
       super(senin, selasa, rabu, kamis, jumat);
       senin = ("1. Produktif RPL \n2. Tahfidz \n3. Matematika \n4. Bahasa Indonesia");
       selasa = ("1. PPKN \n2. Simdig \n3. Produktif RPL \n4. Bahasa Inggris \n5. BK");
       rabu = ("1. DDG \n2. Fisika \n3. Tahfidz \n4. Produktif RPL \n5. Olahraga");
       kamis = ("1. Seni Budaya \n2. Produktif RPL \n3. Tahfidz \n4. Sejarah Indonesia \n5. KJD");
       jumat = ("1. Siskom \n2. Kimia \n3. Produktif RPL \n4. Agama");
    }
    public void info1()
    {
        System.out.println("Mata pelajaran hari Senin \n"+Senin);
    }
    
    public void info2()
    {
        System.out.println("Mata pelajaran hari Selasa \n"+Selasa);
    }
    
    public void info3()
    {
        System.out.println("Mata pelajaran hari Rabu \n"+Rabu);
    }
    
    public void info4()
    {
        System.out.println("Mata pelajaran hari Kamis \n"+Kamis);
    }
    
    public void info5()
    {
        System.out.println("Mata pelajaran hari Jumat \n"+Jumat);
    }
    
}
