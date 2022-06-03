import java.util.Scanner;

public class flyTicket {
    public static void main(String[] args) {
        double distance, age; //Input
        int triptype;
        double kmp = 0.10, s12a = 0.5, a1224 = 0.1, al65 = 0.3, gab = 0.2; //fixed value
        double normalprice, agediscounts12a, agediscounta1224, agediscountal65, gabdiscountprice; //Calculated values
        double dage12a,dagedisa1224,dageal65;

        Scanner input = new Scanner(System.in);

        System.out.print("Lutfen  Gideceginiz Mesafeyi Giriniz(km) : ");
        distance = input.nextDouble();
        System.out.print("Lutfen Yasinizi Giriniz : ");
        age = input.nextDouble();
        System.out.print("Lutfen Yolculuk Tipinizi Seciniz :  1 =>Tek Yon / 2=> Gidis-Donus :  ");
        triptype = input.nextInt();

        //Caculate the trip price
        normalprice = distance * kmp;
        agediscounts12a =normalprice-( normalprice *s12a);
        dage12a=2*normalprice-(normalprice*1.4);
        agediscounta1224=normalprice-(normalprice*a1224);
        dagedisa1224=2*normalprice-(normalprice*0.6);
        agediscountal65=normalprice-(normalprice*al65);
        dageal65=2*normalprice-(normalprice*0.5);
        gabdiscountprice=(2*normalprice)-(normalprice*gab);


        switch (triptype){

            case 1:
                if(age<12 && distance>=1){
                    System.out.print("Toplam Tutar (Tl) : "+ agediscounts12a);
                } else if (age>12 && age<24 && distance>=1) {
                    System.out.print("Toplam Tutar (Tl) : "+ agediscounta1224);

                } else if (age>65 && distance>=1) {
                    System.out.print("Toplam Tutar (Tl) : "+ agediscountal65);

                } else if (age>24 && age<66 && distance>=1) {
                    System.out.print("Toplam Tutar (Tl) : "+ normalprice);

                }else{
                    System.out.print("Girdiginiz Degerlerde Hata Vardir! Lutfen Tekrar Giriniz.");
                }
            break;

            case 2:
                if(age<12 && distance>=1){
                    System.out.print("Toplam Tutar (Tl) : "+ dage12a );
                }else if (age>12 && age<24 && distance>=1){
                    System.out.print("Toplam Tutar (Tl) : "+ dagedisa1224);

                } else if (age>65 && distance>=1){
                    System.out.print("Toplam Tutar (Tl) : "+ dageal65);

                }else if (age>24 && age<66 && distance>=1){
                    System.out.print("Toplam Tutar (Tl) : "+ gabdiscountprice);

                }else{
                    System.out.print("Girdiginiz Degerlerde Hata Vardir! Lutfen Tekrar Giriniz.");
                }
            break;
        }


    }
}
