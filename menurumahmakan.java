import java.util.Scanner;

 public class menurumahmakan
 {
  public static void main(String []args)
  {
	  
	
	 	 System.out.println("");
		 
  System.out.println("               DAFTAR MENU MAKANAN DAN MINUMAN DI RUMAH MAKAN MURAH");
  System.out.println("");
  System.out.println("===========================================|====================================");
  System.out.print("\tMakanan\t");
  System.out.print("\t\t\t\t\tMinuman\n");
  System.out.println("===========================================|====================================");
  System.out.print("| 1| Nasi Putih                   Rp 5000  |");
  System.out.print("\t11 Es Teh         Rp 2000\n");
  System.out.print("| 2| Nasi Kuning                  Rp 5000  |");
  System.out.print("\t12 Es Kopyor      Rp 5000\n");
  System.out.print("| 3| Nasi Padang                  Rp 10000 |");
  System.out.print("\t13 ES Jeruk Kecil Rp 2000\n");
  System.out.print("| 4| Nasi Goreng                  Rp 10000 |");
  System.out.print("\t14 ES Jeruk Besar Rp 3000\n");
  System.out.print("| 5| Nasi Uduk                    Rp 5000  |");
  System.out.print("\t15 Air Putih Es   Rp 1000\n");
  System.out.print("| 6| Pecel Lele                   Rp 10000 |");
  System.out.print("\t16 Jus melon      Rp 5000\n");
  System.out.print("| 7| Pecel Ayam                   Rp 10000 |");
  System.out.print("\t17 Jus Alpukat    Rp 5000\n");
  System.out.print("| 8| Ikan Nila Goreng dengan Nasi Rp 10000 |");
  System.out.print("\t18 Jus Mangga     Rp 5000\n");
  System.out.print("| 9| Batagor Bandung              Rp 5000  |");
  System.out.print("\t19 Jus Apel       Rp 5000\n");
  System.out.print("|10| Sate                         Rp 10000 |");
  System.out.print("\t20 Jus Naga       Rp 5000\n");
  System.out.println("================================================================================");
 

  Scanner data=new Scanner(System.in);
  int b;
     int hargamakanan= 0;
	 
     int h1 = 5000, h2 = 5000, h3 = 10000, h4=10000, h5=5000, h6=100000;
	 int h7=10000, h8=10000, h9=5000, h10=10000;
	 int hargaminuman= 0;
	 int t11= 2000, t12= 5000, t13=2000, t14=3000, t15=1000, t16=5000;
	 int t17= 5000, t18= 5000, t19=5000, t20=5000;
     String menu;
	 int Total;
    for (String i = "YA"; i.equals("YA")||i.equals("ya"); )
    {
	 System.out.println("________________________________________________________________________________");
     System.out.print("Masukan Nomor Makanan : ");
     int inNomor = data.nextInt();
     System.out.print("Masukan Nomor Minuman : ");
      b= data.nextInt();
	  System.out.println("________________________________________________________________________________");
  
	  
  //menu makanan
  if (inNomor==1) {
	 menu = " Nasi Putih";
     System.out.println("Pilihan anda nomor : " +inNomor + menu);
     hargamakanan = hargamakanan + h1;
  }
   
  else if (inNomor==2) {
       menu = " Nasi Kuning";
	   System.out.println("Pilihan anda nomor : " +inNomor + menu);
	   hargamakanan = hargamakanan + h2;
  }
 else if (inNomor==3) {
       menu= " Nasi Padang";
       System.out.println("Pilihan anda nomor : " +inNomor + menu);
	   hargamakanan = hargamakanan + h3;
  }
  else if (inNomor==4) {
       menu = " Nasi Goreng";
       System.out.println("Pilihan anda nomor : " + inNomor + menu);
	   hargamakanan = hargamakanan + h4;
  }
  else if (inNomor==5) {
       menu= " Nasi Uduk ";
	   System.out.println("Pilihan anda nomor : " + inNomor + menu);
	   hargamakanan = hargamakanan + h5;
  }
  else if (inNomor==6) {
       menu= " Pecel Lele";
	   System.out.println("Pilihan anda nomor : " + inNomor + menu);
	   hargamakanan = hargamakanan + h6;
  }
  else if (inNomor==7) {
       menu = " Pecel Ayam ";
	   System.out.println("Pilihan anda nomor : " + inNomor + menu);
	   hargamakanan = hargamakanan + h7;
  }
  else if (inNomor==8) {
       menu= " Ikan Nila Goreng dengan Nasi";
	   System.out.println("Pilihan anda nomor : " + inNomor + menu);
	   hargamakanan = hargamakanan + h8;
  }
  else if (inNomor==9) {
      menu= " Batagor Bandung";
	  System.out.println("Pilihan anda nomor : " + inNomor + menu);
	  hargamakanan = hargamakanan + h9;
  }
  else if (inNomor==10) {
     menu= " Sate";
	 System.out.println("Pilihan anda nomor : " + inNomor + menu);
	  hargamakanan = hargamakanan + h10;
  }
  
  //menu minuman
  if (b==11) {
	 menu = " Es Teh";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t11;
  }
  else if (b==12) {
	 menu = " Es Kopyor";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t12;
  }
  else if (b==13) {
	 menu = " Es Jeruk Kecil";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t13;
  }
  else if (b==14) {
	 menu = " Es Jeruk Besar";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t14;
  }
  else if (b==15) {
	 menu = " Air Putih Es";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t15;
  }
  else if (b==16) {
	 menu = " Jus Melon";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t16;
  }
  else if (b==17) {
	 menu = " Jus Alpukat";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t17;
  }
  else if (b==18) {
	 menu = " Jus Mangga";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t18;
  }
  else if (b==19) {
	 menu = " Jus Apel";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t19;
  }
  else if (b==20) {
	 menu = " Jus Naga";
     System.out.println("Pilihan anda nomor : " +b + menu);
     hargaminuman = hargaminuman + t20;
  }
  else {
    System.out.println("MAAF Nomor yang dipilih tidak ada di menu,silahkan masukan nomor yang lain");
    }
   
   System.out.println("________________________________________________________________________________");
   System.out.println("Harga Makanan : Rp " +hargamakanan+".");
   System.out.println("Harga Minuman : Rp " +hargaminuman+".");
   System.out.println("________________________________________________________________________________");
   Total=hargamakanan+hargaminuman;
   System.out.println("Total harga : Rp " + Total+".");
   System.out.println("________________________________________________________________________________");
   
   
   System.out.println("Apakah anda mau melanjutkan? YA/TIDAK");
   i = data.next();
   }
  }
  }