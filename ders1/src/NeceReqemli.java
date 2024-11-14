import java.util.Scanner;

public class NeceReqemli {
    public static void main(String[] args) {
//        1.eded daxil edilir scanner den
//        2.ededin nece reqemli olmagin tap
//        3.cap edin
//        meselen mne daxil edirem 456 ekrana 3 reqemli olmasin desin

        Scanner sc = new Scanner(System.in);
        System.out.println("Eded daxil edin: ");
        int a = sc.nextInt();
        int uzun=0;

        if (a< 0) {a = -a;} //menfi ededi gotursun deye
        if (a== 0) {uzun=1;} //0 reqemli eded ola bilmez deye

        for(;a>0;a/=10)
        { uzun++;}
        System.out.println(uzun + " reqemlidir");
    }
}
