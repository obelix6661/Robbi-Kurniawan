import java.util.Scanner;
public class Glbb 
{

	public static void main(String args[])
	{
	Scanner nilai=new Scanner(System.in);

	double Kecepatanawal ;//v0
	double Percepatan ;//a
	double Waktu ;//t
	double Kecepatanakhir ;//vt
	double Jarak ;//s
	double Waktukuadrat; //t^2
	int Pilihan, l;

// rumus vt=v0+axt
// rumus s=v0xt+1/2xaxt^2
// rumus a=vt-v0/t 

for (String a = "YA"; a.equals("YA")||a.equals("ya"); )
{
  System.out.println("");
  System.out.println("=================================================================");
  System.out.println("\tGLBB (GERAK LURUS BERUBAH BERATURAN)");
  System.out.println("\t\t1. Kecepatan Akhir (v0)");
  System.out.println("\t\t2. Jarak (s)");
  System.out.println("\t\t3. Percepatan (a)");
  System.out.println("=================================================================");
  System.out.println("");
  System.out.print("Masukan Pilihan Anda : ");
  Pilihan=nilai.nextInt();
  System.out.println("");

 	if (Pilihan==1) {
		System.out.println("=================================================================");
		System.out.println("Rumus vt=v0+axt");
		System.out.println(" Keterangan " );
		System.out.println("vt = Kecepatan akhir ");
		System.out.println("v0 = Kecepatan awal" );
		System.out.println("a = Percepatan");
		System.out.println("t = Waktu"); 
		System.out.println("");
		System.out.print("Masukan kecepatan awal (V0)	  		  :");
		Kecepatanawal=nilai.nextDouble();
  
		System.out.print("Masukan percepatan (a)		 		  :");
		Percepatan=nilai.nextDouble();

		System.out.print("Masukan waktu 		(t)	 		  :");
		Waktu=nilai.nextDouble();

		Kecepatanakhir=Kecepatanawal + Percepatan * Waktu;

		System.out.println("Kecepatan Akhir		= "+Kecepatanakhir+ "m/s");
		System.out.println("=================================================================");
 		}
 
	else if (Pilihan==2) {
		System.out.println("=================================================================");
		System.out.println("Rumus s=v0xt+0.5xaxt^2");
		System.out.println(" Keterangan " );
		System.out.println("s = Jarak");
		System.out.println("v0 = Kecepatan awal" );
		System.out.println("a = Percepatan");
		System.out.println("t = Waktu"); 
		System.out.println("");
		System.out.print("Masukan kecepatan awal 	 		   :");
		Kecepatanawal=nilai.nextDouble();
	
		System.out.print("Masukan waktu				   :");
		Waktu=nilai.nextDouble();
	
		System.out.print("Masukan Percepatan 			   :");
		Percepatan=nilai.nextDouble();
	
		System.out.print("Masukan waktu dipangkat dua	\t   :");
		Waktukuadrat=nilai.nextDouble();
	
		Jarak=Kecepatanawal*Waktu + 1/2 * Percepatan*Waktu*Waktu;
		System.out.println("Jarak		= "+Jarak + "meter");
		System.out.println("=================================================================");
		}
	
	else if (Pilihan==3) {
		System.out.println("=================================================================");
		System.out.println("Rumus a=vt-v0/t ");
		System.out.println(" Keterangan " );
		System.out.println("a = Percepatan");
		System.out.println("vt = Kecepatan akhir" );
		System.out.println("v0 = Kecepatan akhir");
		System.out.println("t = Waktu"); 
		System.out.println("");
		System.out.print("Masukan kecepatan Akhir	 	 \t   :");
		Kecepatanakhir=nilai.nextDouble();
	
		System.out.print("Masukan Kecepatan Awal		 \t   :");
		Kecepatanawal=nilai.nextDouble();
	
		System.out.print("Masukan Waktu 	 \t\t	:");
		Waktu=nilai.nextDouble();
		
		Percepatan=Kecepatanakhir-Kecepatanawal/Waktu;
	
		System.out.println("Percepatan		= " +Percepatan + "m/s^2");
		System.out.println("=================================================================");
		}
	else System.out.print ("Maaf Pilihan Tidak Tersedia Silahkan Masukan Pilihan Lain");

   	System.out.println("");
	System.out.println("Lanjutkan ? YA/TIDAK");
	a=nilai.next();
	

	
}
 }
}
