
import java.util.ArrayList;
import java.util.Iterator;


public class Kumanda implements Iterable<String>{
    
    private ArrayList<String> kanallar = new ArrayList<String>(); 
    
    public void kanalEkle(String kanal){
        
        if(kanallar.contains(kanal)){
            System.out.println("Bu kanal listenizde bulunmaktadır....");
            
        }
        else{
            System.out.println(kanal+" ismindeki kanal kumandaya eklendi...");
            kanallar.add(kanal);
            
        }
        
    }
    public void kanalSil(String kanal){
        
        if(kanallar.contains(kanal)){
            System.out.println(kanal+" ismindeki kanal kumandadan silindi...");
            kanallar.remove(kanal);
            
        }
        else{
            System.out.println("Silmek İstediğiniz kanal bulunamadı.....");
            
        }
        
    }
    public int kanalSayisi(){

        return kanallar.size();
        
    }

    @Override
    public Iterator<String> iterator() {
        
        return new Iterator<String>() {
            private int index = 0;
            
            @Override
            public boolean hasNext() {
                
                if(index<kanallar.size()){
                    return true;
                }
                else{
                    return false;
                }
            }

            @Override
            public String next() {
                String value = kanallar.get(index);
                index++;
                return value;
            }
        };
        
        
    }
    
    
    
    
}
