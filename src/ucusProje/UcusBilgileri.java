package kasim30;

import java.util.Scanner;


public class UcusBilgileri {
    Scanner scan = new Scanner(System.in);
    public void ucusKontrol() {



        System.out.println("yapmak istediğiniz yolculuk şeklini seciniz. tek yön için 1, çift yön için 2 ye basınız:");
        int secim = scan.nextInt();

        switch (secim) {
            case 1: {
                tekYon();
                break;
            }
            case 2: {

            }
            default: {
                System.out.println("yanliş girdiniz");
                ucusKontrol();
            }
        }

    }



    private void tekYon() {
        int fiyat = (int) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);
        System.out.println("kalkıs noktası giriniz");
        String kalkis = scan.nextLine();
        System.out.println("iniş noktası giriniz");
        String inis = scan.nextLine();
        System.out.println("gidiş tari giriiz");
        String tari = scan.nextLine();
        char kalkisIlkarf=kalkis.charAt(0);
        char inisIlkarf=inis.charAt(0);
        String ucusBilgileri=kalkis+"===="+inis+""+tari+""+kalkisIlkarf+inisIlkarf+"nolu ucus fiyatı"+fiyat;
        System.out.println(ucusBilgileri+"onaylıyor musunuz Y/N");
        char secim=scan.next().toUpperCase().charAt(0);
        if (secim=='y'){
            System.out.println("bilet onaylandı"+ucusBilgileri);
        }else {
            System.out.println("bilet onaylanmadı");

        }
    }
}
