import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;
        Scanner input =new Scanner(System.in);
        System.out.println("Ilk Sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.println("ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-toplama\n2-cikarma\n3-Carpma\n4-bolme");
        System.out.println("Seciniz: ");
        select = input.nextInt();

          // İf-else koşul yapısı kullanarak yapalım
     /*   if(select == 1){
            System.out.println("Toplam: " + (n1 + n2));
        }else if( select == 2){
            System.out.println("Cikarma: " + (n1 - n2));
        }else if( select == 3){
            System.out.println("Carpma: " + (n1 * n2));
        }else if( select == 4){
            if(n2 != 0 ){
                System.out.println("Bolme: " + (n1 / n2));
            }else{
                System.out.println("bir sayi 0'a bolunemez..");
            }
        }else{
            System.out.println("Yanlis bir secim yaptiniz. Tekrar deneyiniz..");
        } */

        //switch case yapısını kullanarak yapalım..

        switch (select){
            case 1:
                System.out.println(" Toplam: "+ (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma: "+ (n1 - n2));
                break;
            case 3:
                System.out.println(" Carpma: "+ (n1 * n2));
                break;
            case 4:
                if(n2 != 0){
                    System.out.println(" Bolme: "+ (n1 / n2));

                }  else {
                    System.out.println("Bir sayi 0'a bolunemez!!");
                } break;
                default:
                System.out.println("Yanlis secim yaptiniz tekrar deneyiniz... ");

        }
    }
}
