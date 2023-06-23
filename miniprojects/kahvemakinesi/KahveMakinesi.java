package miniprojects.kahvemakinesi;

import java.util.Scanner;

public class KahveMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi Kahveyi istersiniz? (Türk Kahvesi - Filtre Kahve - Espresso)");
        String hangiKahve = input.nextLine();

        //1. Kısım

        switch (hangiKahve.toLowerCase()){
            case "türk kahvesi":
                System.out.println("Türk kahveniz hazırlanıyor..");
                break;

            case "filtre kahve":
                System.out.println("Filtre kahveniz hazırlanıyor..");
                break;

            case "espresso":
                System.out.println("Espresso kahveniz hazırlanıyor..");
                break;

            default:
                System.out.println("Hatılı giriş yaptınız, lütfen yeniden giriş yaptınız.");

        }


        //2. Kısım
        System.out.println("Süt eklemek ister misiniz? (Evet veya hayır olarak yanıtlayınız.)");
        String sut = input.nextLine();


        String s = sut.equalsIgnoreCase("evet") ? "süt ekleniyor." : (sut.equalsIgnoreCase("hayır") ? "süt eklenmiyor." : "hatalı giriş yaptınız, yanıtınızı konrol edin");
        System.out.println(s);


        // 3. Kısım

        System.out.println("Şeker eklemek ister misiniz? (Evet veya hayır olarak yanıtlayınız.)");
        String seker = input.nextLine();

        if (seker.equalsIgnoreCase("evet")){
            System.out.println("Kaç şeker istersiniz?");
            int sekersayisi= input.nextInt();

            String bosKod = input.nextLine();  // ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine
            //koymamız gerekiyor. (String bosKod = sc.nextLine(); dummy kod ekleyiniz.
            if (sekersayisi>0){
                System.out.println(sekersayisi +" şeker ekleniyor.");
            }
        } else if (seker.equalsIgnoreCase("hayir")) {
            System.out.println("Şeker eklenmiyor.");
        }


        //4. Kısım
        System.out.println ("Kahveniz hangi boyutta olsun? (Büyük, küçük veya orta şeklinde giriş yapınız.");
        String boy = input.nextLine();

        switch (boy.toLowerCase()){
            case "büyük":
                System.out.println("Kahveniz "+ boy.toLowerCase()+ " boy olarak hazırlanıyor");
                break;

            case "küçük":
                System.out.println("Kahveniz "+ boy.toLowerCase()+ " boy olarak hazırlanıyor");
                break;


            case "orta":
                System.out.println("Kahveniz "+ boy.toLowerCase()+ " boy olarak hazırlanıyor");
                break;

        }

        System.out.println(hangiKahve+" "+ boy +" boy olarak hazırdır.");
    }
}
