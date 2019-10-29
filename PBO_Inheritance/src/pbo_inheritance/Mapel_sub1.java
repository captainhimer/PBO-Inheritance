package PBO_Inheritance;
public class Mapel_sub1 extends MapelSuper {
private String hari;
public Mapel_sub1 (String nama, String matpel, String hari)
{
 super(nama,matpel);
 this.hari = hari;  
}
public void info(){
    System.out.println("Jam Produktif : " + this.hari);
    super.info();
    }
} 



