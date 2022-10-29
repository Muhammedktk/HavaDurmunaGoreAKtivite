import java.util.Scanner;

public class HavaDurmunaGoreAKtivite {
    public static void main(String[] args) {
        int temp;
        Scanner inp=new Scanner(System.in);

        System.out.print("SICAKLIK GİRİNİZ : ");
        temp = inp.nextInt();

        String DURUM = (temp < 5) ? "YKAYAK YAPABİLİRSİN."
                : ((5 <= temp && temp < 15) ? "SİNEMAYA GİDEBİLİRSİN."
                : ((15 <= temp && temp <= 25) ? "PİKNİK YAPABİLİRSİN."
                : " YÜZEBİLİRSİN FAKAT DİKKATLİ OL HAVA SICAK."));

        System.out.println(DURUM);
    }
}
