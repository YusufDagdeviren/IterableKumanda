
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in); 
        
        String islemler = "1.Kanal Ekle\n"+
                "2.Kanal Sil\n"
                + "3.Kanal Sayısı\n"
                + "4.Kanalları Bastır\n"
                + "Çıkış İçin q ya basınız";
        
        
        Kumanda kumanda = new Kumanda();
        while(true){
            System.out.println("****************************");
            System.out.println(islemler);
            System.out.println("****************************");
            System.out.println("Lütfen işleminizi seçiniz....");
            String secim = scanner.nextLine();
            
            if(secim.equals("q")){
                System.out.println("Kumanda Programından Çıkış Yapılıyor.....");
                break;
            }
            else if(secim.equals("1")){
                System.out.println("Lütfen gireceğiniz kanal adını giriniz: ");
                String isim = scanner.nextLine();
                kumanda.kanalEkle(isim);
                
            }
            else if(secim.equals("2")){
                System.out.println("Lütfen sileceğiniz kanal adını giriniz: ");
                String isim = scanner.nextLine();
                kumanda.kanalSil(isim);
                
            }
            else if(secim.equals("3")){
                System.out.println("Toplam kanal sayısı= "+kumanda.kanalSayisi());
                
            }
            else if(secim.equals("4")){
                kanalBas(kumanda);
                
            }
            else{
                System.out.println("Yanlış seçim yaptınız\nLütfen tekrar giriniz...");
            }
            
            
            
            
        }
        
        
        
        
        
  
        
        
        
        
        
    }
    public static void kanalBas(Kumanda kumanda){
        
       if(kumanda.kanalSayisi() <= 0){
           
           System.out.println("Kanal Bulunamadı");
           
       } 
       else{
           
           for(String s : kumanda){
               System.out.println(s);
           }
           
           
       }
        
        
        
        
    }
    
    
    
    
    
}
