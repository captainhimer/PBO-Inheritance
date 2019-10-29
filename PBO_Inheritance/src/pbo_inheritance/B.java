package pbo_inheritance;
public class B extends A{
    private int b;
    public void setB(int nilai)
    {
        b = nilai;
    }
    
   public int getB()
   {
       return b;
   }
   
   //melakukan override terhadap method tampilkanNilai()
   //yang terdapat pada kelas A
   
   public void tampilkanNilai()
   {
       super.tampilkanNilai(); //memanggil method dalam kelas A
       System.out.println("Nilai b : "+getB());
   }
}
class DemoOverride2
{
    public static void main(String[] args) {
        B obj = new B();
        obj.setA(50);
        obj.setB(150);
        //akan memanggil method yang terdapat pada kelas B
        obj.tampilkanNilai();
        
    }
}
