    import java.util.Scanner;  
       
     public class nilai_rata2{  
         public static void main(String [] args){  
           Scanner s = new Scanner(System.in);    
           int jml_mk;           
           String nama;  
           double avg,nilai=0,total_nilai=0;  
             
           System.out.println("---  Mencari rata-rata nilai ---");  
           System.out.print("Nama : ");  
           nama = s.nextLine();  
           System.out.print("Jumlah MK : ");  
           jml_mk = s.nextInt();  
             
            for(int i=1; i<=jml_mk; i++){   
                System.out.print("Nilai MK ke: "+i+" adalah ");   
                nilai = s.nextDouble();  
                total_nilai +=nilai;   
            }  
            avg = total_nilai/jml_mk;  
            System.out.println("Rata-rata "+avg);   
                 
         }  
     }  