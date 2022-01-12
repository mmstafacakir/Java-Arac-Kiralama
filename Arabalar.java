import java.util.ArrayList;
import java.util.Scanner;

public class Arabalar {
    private static int sayac=0;
    ArrayList arabalar=new ArrayList();
    ArrayList arabalar1=new ArrayList();
    ArrayList arabalar2=new ArrayList();
    ArrayList arabalar3=new ArrayList();
    Scanner musteri=new Scanner(System.in);
    int secim0;
    int secim00=31;

    int u=11;

    public static void main(String[] args) throws InterruptedException {
        KullaniciEkran kullaniciEkran=new KullaniciEkran();

        kullaniciEkran.musteri_ekran();
    }




    //SPOR ARABA
    public void spor_araba(){

        arabalar.add(new Spor_Araba("Focus","Ford",2017,350,"Beyaz"));
        arabalar.add(new Spor_Araba("918 Spyder","Porsche",2016,850,"Siyah"));
        arabalar.add(new Spor_Araba("Gallardo","Lamborghini",2012,650,"Yeşil"));
        arabalar.add(new Spor_Araba("Lancer Evo","Mitsubishi",2011,550,"Mavi"));
        arabalar.add(new Spor_Araba("Supra","Toyota",2002,600,"Gri"));
        arabalar.add(new Spor_Araba("Impraza","Subaru",2011,400,"Mavi"));
        arabalar.add(new Spor_Araba("Senna","Mclaren",2021,750,"Turuncu"));

    }

    public void yazdir_spor_araba(){

        for(int rLoop = 0; rLoop < arabalar.size(); rLoop ++)
        {
            sayac++;
            System.out.print(sayac+"-");
            ((Spor_Araba) arabalar.get(rLoop)).BilgileriYazdir();
        }
        sayac=0;
    }


    //TİCARİ ARABA
    public void ticari_araba(){

        arabalar1.add(new Ticari_Araba("Transit","Ford",2016,200,"Beyaz"));
        arabalar1.add(new Ticari_Araba("Kangoo","Renault",2019,230,"Siyah"));
        arabalar1.add(new Ticari_Araba("Doblo","Fiat",2017,225,"Beyaz"));
        arabalar1.add(new Ticari_Araba("Caddy","Volkswagen",2018,250,"Gri"));

    }

    public void yazdir_ticari_araba(){

        for (int rLoop=0; rLoop < arabalar1.size(); rLoop++)
        {
            sayac++;
            System.out.print(sayac+"-");
            ((Ticari_Araba) arabalar1.get(rLoop)).BilgileriYazdir();
        }
        sayac=0;
    }


    //KLASİK ARABA
    public void klasik_araba(){

        arabalar2.add(new Klasik_Araba("Mustang","Ford",1969,700,"Siyah"));
        arabalar2.add(new Klasik_Araba("Eldorado","Cadillac",1971,600,"Mavi"));
        arabalar2.add(new Klasik_Araba("Corvette","Chevrolet",1969,650,"Beyaz"));
        arabalar2.add(new Klasik_Araba("Beetle","Volkswagen",1963,600,"Sarı"));

    }

    public void yazdir_klasik_araba(){
        for (int rLoop=0; rLoop < arabalar2.size(); rLoop++)
        {
            sayac++;
            System.out.print(sayac+"-");
            ((Klasik_Araba) arabalar2.get(rLoop)).BilgileriYazdir();
        }
        sayac=0;
    }


    //GUNDELIK ARABA
    public void gundelik_araba(){

        arabalar3.add(new Gundelik_Araba("Superb","Skoda",2020,450,"Beyaz"));
        arabalar3.add(new Gundelik_Araba("Megane","Renault",2020,400,"Bordo"));
        arabalar3.add(new Gundelik_Araba("Focus","Ford",2019,350,"Gri"));
        arabalar3.add(new Gundelik_Araba("Passat","Volkswagen",2018,400,"Siyah"));

    }

    public void yazdir_gundelik_araba(){

        for (int rLoop=0; rLoop < arabalar3.size(); rLoop++)
        {
            sayac++;
            System.out.print(sayac+"-");
            ((Gundelik_Araba) arabalar3.get(rLoop)).BilgileriYazdir();
        }
        sayac=0;
    }


    //BUTUN ARABALAR
    public void butun_arabalar(){
        sayac=0;
        yazdir_spor_araba();
        sayac=arabalar.size();
        yazdir_ticari_araba();
        sayac=arabalar1.size()+arabalar.size();
        yazdir_klasik_araba();
        sayac=arabalar2.size()+arabalar1.size()+arabalar.size();
        yazdir_gundelik_araba();
    }


    //ARAÇ KAZA DURUMU
    public void kazaDurumu() {
        String kaza1;
        Scanner kaza = new Scanner(System.in);
        System.out.println("<-------------------->\n");
        System.out.println("Kaza Yaptınız mı?");
        kaza1 = "a";
        while (kaza1.equalsIgnoreCase("Evet") != true && kaza1.equalsIgnoreCase("Hayır") != true) {
            kaza1 = kaza.next();
            if (kaza1.equalsIgnoreCase("hayır")) {
                System.out.println();
                System.out.println("Kaza borçlandırılması yok. İyi günler.");
            } else if (kaza1.equalsIgnoreCase("evet")) {
                System.out.println("Kaza arabanın hangi bölgesinde?\n"
                        + "1-Tampon\n"
                        + "2-Dikiz Aynalar\n"
                        + "3-Camlar\n"
                        + "4-Çamurluklar");
                int kaza2 = 5;
                while (kaza2<1 || kaza2>4) {
                    kaza2=kaza.nextInt();
                    switch (kaza2) {
                        case 1:
                            System.out.println("Kaza Borcunuz = 150 TL");
                            break;
                        case 2:
                            System.out.println("Kaza Borcunuz=135 TL");
                            break;
                        case 3:
                            System.out.println("Kaza Borcunuz=75 TL");
                            break;
                        case 4:
                            System.out.println("Kaza Borcunuz= 90 TL");
                            break;
                        default:
                            System.out.println("Geçersiz değer lütfen tekrar giriniz : ");
                    }
                }

            } else {
                System.out.println("Beklenmedik kelime! Tekrar giriniz.");
            }
        }

    }





    //FILTRELEME
    public int FiltreSpor() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Filtrelemek istediğiniz özelliği seçiniz\n" +
                "1-Marka\n" +
                "2-Model\n" +
                "3-Renk\n" +
                "4-Ücret Aralığı");
        int deger=scanner.nextInt();
        while (deger<1 || deger>4)
        {
            System.out.println("Hatalı değer girildi Lütfen tekrar giriniz :");
            deger=scanner.nextInt();
        }
        String terim;
        int karar;
        switch (deger){
            case 1:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Ford")) {
                        System.out.print("1-");
                        ((Spor_Araba) arabalar.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Porsche")) {
                        System.out.print("2-");
                        ((Spor_Araba) arabalar.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Lamborghini")) {
                        System.out.print("3-");
                        ((Spor_Araba) arabalar.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Mitsubishi")) {
                        System.out.print("4-");
                        ((Spor_Araba) arabalar.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    }
                    else if (terim.equalsIgnoreCase("Toyota")) {
                        System.out.print("5-");
                        ((Spor_Araba) arabalar.get(4)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 5) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    }
                    else if (terim.equalsIgnoreCase("Subaru")) {
                        System.out.print("6-");
                        ((Spor_Araba) arabalar.get(5)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 6) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    }
                    else if (terim.equalsIgnoreCase("Mclaren")) {
                        System.out.print("7-");
                        ((Spor_Araba) arabalar.get(6)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    }
                    else {
                        System.out.println("Böyle bir araç bulunamadı lütfen tekrar giriniz:");
                    }
                }
                break;
            case 2:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Focus")) {
                        System.out.print("1-");
                        ((Spor_Araba) arabalar.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;

                    } else if (terim.equalsIgnoreCase("918 Spyder")) {
                        System.out.print("2-");
                        ((Spor_Araba) arabalar.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Gallardo")) {
                        System.out.print("3-");
                        ((Spor_Araba) arabalar.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Lancer Evo")) {
                        System.out.print("4-");
                        ((Spor_Araba) arabalar.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    }
                    else if (terim.equalsIgnoreCase("Supra")) {
                        System.out.print("5-");
                        ((Spor_Araba) arabalar.get(4)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 5) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    }
                    else if (terim.equalsIgnoreCase("Impraza")) {
                        System.out.print("6-");
                        ((Spor_Araba) arabalar.get(5)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 6) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    }
                    else if (terim.equalsIgnoreCase("Senna")) {
                        System.out.print("7-");
                        ((Spor_Araba) arabalar.get(6)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }
                        }
                        u=10;
                    }

                    else {
                        System.out.println("böyle bir araç bulunamadı. Tekrar giriniz:");
                    }
                }
                break;
            case 3:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Beyaz")) {
                        System.out.print("1-");
                        ((Spor_Araba) arabalar.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Siyah")) {
                        System.out.print("2-");
                        ((Spor_Araba) arabalar.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Yeşil")) {
                        System.out.print("3-");
                        ((Spor_Araba) arabalar.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Mavi")) {
                        System.out.print("4-");
                        ((Spor_Araba) arabalar.get(3)).BilgileriYazdir();
                        System.out.println("6-");
                        ((Spor_Araba) arabalar.get(5)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4 && secim0 !=6) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Gri")) {
                        System.out.print("5-");
                        ((Spor_Araba) arabalar.get(4)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 5) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else if (terim.equalsIgnoreCase("Turuncu")) {
                        System.out.print("7-");
                        ((Spor_Araba) arabalar.get(6)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else {
                        System.out.println("böyle bir araç bulunamadı.Tekrar giriniz:");
                    }
                }
                break;
            case 4:
                System.out.println("Verebileceğiniz en iyi bütçeyi giriniz:");
                u=11;
                while (u==11) {
                    deger = scanner.nextInt();
                    if (deger >= 800) {
                        sayac=0;
                        for (int j = 0; j < arabalar.size(); j++) {
                            sayac++;
                            System.out.print(sayac+"-");
                            ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0 > 7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 750 && deger < 800) {
                        sayac=0;
                        for (int j = 0; j < arabalar.size(); j++) {
                            sayac++;
                            if (j == 1)
                                continue;
                            System.out.print(sayac+"-");
                            ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        sayac=0;
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 ||secim0==2 || secim0>7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 650 && deger < 750) {
                        sayac=0;
                        for (int j = 0; j < arabalar.size(); j++) {
                            sayac++;
                            if (j == 1 || j == 6) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        sayac=0;
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==2 || secim0==7|| secim0>7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else if (deger >= 600 && deger < 650) {
                        sayac=0;
                        for (int j = 0; j < arabalar.size(); j++) {
                            sayac++;
                            if (j == 1 || j == 6 || j==2) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        sayac=0;
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 ||secim0==2 || secim0==3|| secim0==7 || secim0>7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else if (deger >= 550 && deger < 600) {
                        sayac=0;
                        for (int j = 0; j < arabalar.size(); j++) {
                            sayac++;
                            if (j == 1 || j == 6 || j==2 || j==4) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        sayac=0;
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 ||secim0==2 || secim0==3|| secim0==7 ||secim0==5 || secim0>7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else if (deger >= 400 && deger < 550) {
                        sayac=0;
                        for (int j = 0; j < arabalar.size(); j++) {
                            sayac++;
                            if (j == 1 || j == 6 || j==2 || j==4 || j==3) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        sayac=0;
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 ||secim0==2 || secim0==3|| secim0==7 ||secim0==4 ||secim0==5 || secim0>7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else if (deger >= 350 && deger < 400) {
                        sayac=0;
                        for (int j = 0; j < arabalar.size(); j++) {
                            sayac++;
                            if (j == 1 || j == 6 || j==2 || j==4 || j==3 || j==5) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        sayac=0;
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 7) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 ||secim0==2 || secim0==3|| secim0==7 ||secim0==4 ||secim0==5 ||secim0==6 ||secim0>7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else if (deger < 0) {
                        System.out.println("Ücret 0 dan küçük olamaz. Tekrar giriniz:");
                    } else {
                        System.out.println("Belirttiğiniz miktara bir araç bulunamadı. Tekrar giriniz:");
                    }

                }
                break;
        }
        return secim0;
    }


    public int FiltreTicari() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Filtrelemek istediğiniz özelliği seçiniz\n" +
                "1-Marka\n" +
                "2-Model\n" +
                "3-Renk\n" +
                "4-Ücret Aralığı");
        int deger=scanner.nextInt();
        while (deger<1 || deger>4)
        {
            System.out.println("Hatalı değer girildi Lütfen tekrar giriniz :");
            deger=scanner.nextInt();
        }
        String terim;
        int karar;
        switch (deger){
            case 1:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Ford")) {
                        System.out.print("1-");
                        ((Ticari_Araba) arabalar1.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Renault")) {
                        System.out.print("2-");
                        ((Ticari_Araba) arabalar1.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Fiat")) {
                        System.out.print("3-");
                        ((Ticari_Araba) arabalar1.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Volkswagen")) {
                        System.out.print("4-");
                        ((Ticari_Araba) arabalar1.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    }
                    else {
                        System.out.println("Böyle bir araç bulunamadı lütfen tekrar giriniz:");
                    }
                }
                break;
            case 2:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Transit")) {
                        System.out.print("1-");
                        ((Ticari_Araba) arabalar1.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;

                    } else if (terim.equalsIgnoreCase("Kangoo")) {
                        System.out.print("2-");
                        ((Ticari_Araba) arabalar1.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Doblo")) {
                        System.out.print("3-");
                        ((Ticari_Araba) arabalar1.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Caddy")) {
                        System.out.print("4-");
                        ((Ticari_Araba) arabalar1.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else {
                        System.out.println("böyle bir araç bulunamadı. Tekrar giriniz:");
                    }
                }
                break;
            case 3:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Beyaz")) {
                        System.out.print("1-");
                        ((Ticari_Araba) arabalar1.get(0)).BilgileriYazdir();
                        System.out.print("3-");
                        ((Ticari_Araba) arabalar1.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1 && secim0 !=3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Siyah")) {
                        System.out.print("2-");
                        ((Ticari_Araba) arabalar1.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Gri")) {
                        System.out.print("3-");
                        ((Ticari_Araba) arabalar1.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }  else {
                        System.out.println("böyle bir araç bulunamadı.Tekrar giriniz:");
                    }
                }
                break;
            case 4:
                System.out.println("Verebileceğiniz en iyi bütçeyi giriniz:");
                u=11;
                while (u==11) {
                    deger = scanner.nextInt();
                    if (deger >= 250) {
                        sayac=0;
                        for (int j = 0; j < arabalar1.size(); j++) {
                            sayac++;
                            System.out.print(sayac+"-");
                            ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 230 && deger < 250) {
                        sayac=0;
                        for (int j = 0; j < arabalar1.size(); j++) {
                            sayac++;
                            if (j == 3)
                                continue;
                            System.out.print(sayac+"-");
                            ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==4 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 225 && deger < 230) {
                        sayac=0;
                        for (int j = 0; j < arabalar1.size(); j++) {
                            sayac++;
                            if (j == 1 || j == 3) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==2 || secim0==4 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }
                    else if (deger >= 200 && deger < 225) {
                        sayac=0;
                        for (int j = 0; j < arabalar1.size(); j++) {
                            sayac++;
                            if (j == 1 || j == 3 || j==2) {
                                continue;
                            }

                            System.out.print(sayac+"-");
                            ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==2 || secim0==3|| secim0==4 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    }

                    else if (deger < 0) {
                        System.out.println("Ücret 0 dan küçük olamaz. Tekrar giriniz:");
                    } else {
                        System.out.println("Belirttiğiniz miktara bir araç bulunamadı. Tekrar giriniz:");
                    }

                }
                break;
        }
        return secim0;
    }


    public int FiltreKlasik() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Filtrelemek istediğiniz özelliği seçiniz\n" +
                "1-Marka\n" +
                "2-Model\n" +
                "3-Renk\n" +
                "4-Ücret Aralığı");
        int deger=scanner.nextInt();
        while (deger<1 || deger>4)
        {
            System.out.println("Hatalı değer girildi Lütfen tekrar giriniz :");
            deger=scanner.nextInt();
        }
        String terim;
        int karar;
        switch (deger){
            case 1:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Ford")) {
                        System.out.print("1-");
                        ((Klasik_Araba) arabalar2.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Cadillac")) {
                        System.out.print("2-");
                        ((Klasik_Araba) arabalar2.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Chevrolet")) {
                        System.out.print("3-");
                        ((Klasik_Araba) arabalar2.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Volkswagen")) {
                        System.out.print("4-");
                        ((Klasik_Araba) arabalar2.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    }
                    else {
                        System.out.println("Böyle bir araç bulunamadı lütfen tekrar giriniz:");
                    }
                }
                break;
            case 2:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Mustang")) {
                        System.out.print("1-");
                        ((Klasik_Araba) arabalar2.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;

                    } else if (terim.equalsIgnoreCase("Eldorado")) {
                        System.out.print("2-");
                        ((Klasik_Araba) arabalar2.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Corvette")) {
                        System.out.print("3-");
                        ((Klasik_Araba) arabalar2.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Beetle")) {
                        System.out.print("4-");
                        ((Klasik_Araba) arabalar2.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else {
                        System.out.println("böyle bir araç bulunamadı. Tekrar giriniz:");
                    }
                }
                break;
            case 3:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Siyah")) {
                        System.out.print("1-");
                        ((Klasik_Araba) arabalar2.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Mavi")) {
                        System.out.print("2-");
                        ((Klasik_Araba) arabalar2.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Beyaz")) {
                        System.out.print("3-");
                        ((Klasik_Araba) arabalar2.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Sarı")) {
                        System.out.print("4-");
                        ((Klasik_Araba) arabalar2.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else {
                        System.out.println("böyle bir araç bulunamadı.Tekrar giriniz:");
                    }
                }
                break;
            case 4:
                System.out.println("Verebileceğiniz en iyi bütçeyi giriniz:");
                u=11;
                while (u==11) {
                    deger = scanner.nextInt();
                    if (deger >= 700) {
                        sayac=0;
                        for (int j = 0; j < arabalar2.size(); j++) {
                            sayac++;
                            System.out.print(sayac+"-");
                            ((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 650 && deger < 700) {
                        sayac=0;
                        for (int j = 0; j < arabalar2.size(); j++) {
                            sayac++;
                            if (j == 0)
                                continue;
                            System.out.print(sayac+"-");
                            ((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 2 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 600 && deger < 650) {
                        sayac=0;
                        for (int j = 0; j < arabalar2.size(); j++) {
                            sayac++;
                            if (j == 0 || j == 2) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 2 || secim0==3 || secim0>4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger < 0) {
                        System.out.println("Ücret 0 dan küçük olamaz. Tekrar giriniz:");
                    } else {
                        System.out.println("Belirttiğiniz miktara bir araç bulunamadı. Tekrar giriniz:");
                    }

                }
                break;
        }
        return secim0;
    }


    public int FiltreGundelik() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Filtrelemek istediğiniz özelliği seçiniz\n" +
                "1-Marka\n" +
                "2-Model\n" +
                "3-Renk\n" +
                "4-Ücret Aralığı");
        int deger=scanner.nextInt();
        while (deger<1 || deger>4)
        {
            System.out.println("Hatalı değer girildi Lütfen tekrar giriniz :");
            deger=scanner.nextInt();
        }
        String terim;
        int karar;
        switch (deger){
            case 1:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Skoda")) {
                        System.out.print("1-");
                        ((Gundelik_Araba) arabalar3.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Renault")) {
                        System.out.print("2-");
                        ((Gundelik_Araba) arabalar3.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Ford")) {
                        System.out.print("3-");
                        ((Gundelik_Araba) arabalar3.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    } else if (terim.equalsIgnoreCase("Volkswagen")) {
                        System.out.print("4-");
                        ((Gundelik_Araba) arabalar3.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }
                        u=10;
                    }
                    else {
                        System.out.println("Böyle bir araç bulunamadı lütfen tekrar giriniz:");
                    }
                }
                break;
            case 2:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Superb")) {
                        System.out.print("1-");
                        ((Gundelik_Araba) arabalar3.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;

                    } else if (terim.equalsIgnoreCase("Megane")) {
                        System.out.print("2-");
                        ((Gundelik_Araba) arabalar3.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Focus")) {
                        System.out.print("3-");
                        ((Gundelik_Araba) arabalar2.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else if (terim.equalsIgnoreCase("Passat")) {
                        System.out.print("4-");
                        ((Gundelik_Araba) arabalar3.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0=8;
                            }

                        }

                        u=10;
                    } else {
                        System.out.println("böyle bir araç bulunamadı. Tekrar giriniz:");
                    }
                }
                break;
            case 3:
                System.out.println("Aradığınız terimi giriniz:");
                u=11;
                while (u==11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Beyaz")) {
                        System.out.print("1-");
                        ((Gundelik_Araba) arabalar3.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Bordo")) {
                        System.out.print("2-");
                        ((Gundelik_Araba) arabalar3.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Gri")) {
                        System.out.print("3-");
                        ((Gundelik_Araba) arabalar3.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Siyah")) {
                        System.out.print("4-");
                        ((Gundelik_Araba) arabalar3.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else {
                        System.out.println("böyle bir araç bulunamadı.Tekrar giriniz:");
                    }
                }
                break;
            case 4:
                System.out.println("Verebileceğiniz en iyi bütçeyi giriniz:");
                u=11;
                while (u==11) {
                    deger = scanner.nextInt();
                    if (deger >= 450) {
                        sayac=0;
                        for (int j = 0; j < arabalar3.size(); j++) {
                            sayac++;
                            System.out.print(sayac+"-");
                            ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 400 && deger < 450) {
                        sayac=0;
                        for (int j = 0; j < arabalar3.size(); j++) {
                            sayac++;
                            if (j == 0)
                                continue;
                            System.out.print(sayac+"-");
                            ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        sayac=0;
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 2 || secim0 > 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger >= 350 && deger < 400) {
                        sayac=0;
                        for (int j = 0; j < arabalar3.size(); j++) {
                            sayac++;
                            if (j == 0 || j == 1 || j==3) {
                                continue;
                            }
                            System.out.print(sayac+"-");
                            ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                        }
                        sayac=0;
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 8;
                        while (secim0 <= 0 || secim0 > 4) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 3 || secim0>3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 8;
                            }

                        }

                        u = 10;
                    } else if (deger < 0) {
                        System.out.println("Ücret 0 dan küçük olamaz. Tekrar giriniz:");
                    } else {
                        System.out.println("Belirttiğiniz miktara bir araç bulunamadı. Tekrar giriniz:");
                    }

                }
                break;
        }
        return secim0;
    }

    public int FiltreHepsi(){ Scanner scanner=new Scanner(System.in);
        System.out.println("Filtrelemek istediğiniz özelliği seçiniz\n" +
                "1-Marka\n" +
                "2-Model\n" +
                "3-Renk\n" +
                "4-Ücret Aralığı");
        int deger=scanner.nextInt();
        while (deger<1 || deger>19)
        {
            System.out.println("Hatalı değer girildi Lütfen tekrar giriniz :");
            deger=scanner.nextInt();
        }
        String terim;
        int karar;
        switch (deger) {
            case 1:
                System.out.println("Aradığınız terimi giriniz:");
                u = 11;
                while (u == 11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Skoda")) {
                        System.out.print("16-");
                        ((Gundelik_Araba) arabalar3.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 16) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Renault")) {
                        System.out.print("17-");
                        ((Gundelik_Araba) arabalar3.get(1)).BilgileriYazdir();
                        System.out.print("9-");
                        ((Ticari_Araba) arabalar1.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 9 && secim0 != 17) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;

                    } else if (terim.equalsIgnoreCase("Ford")) {
                        System.out.print("1-");
                        ((Spor_Araba) arabalar.get(0)).BilgileriYazdir();
                        System.out.print("8-");
                        ((Ticari_Araba) arabalar1.get(0)).BilgileriYazdir();
                        System.out.print("12-");
                        ((Klasik_Araba) arabalar2.get(0)).BilgileriYazdir();
                        System.out.print("18-");
                        ((Gundelik_Araba) arabalar3.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1 && secim0 != 8 && secim0 != 12 && secim0 != 18) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Volkswagen")) {
                        System.out.print("11-");
                        ((Ticari_Araba) arabalar1.get(3)).BilgileriYazdir();
                        System.out.print("15-");
                        ((Klasik_Araba) arabalar2.get(3)).BilgileriYazdir();
                        System.out.print("19-");
                        ((Gundelik_Araba) arabalar3.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                            karar=3;
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 11 && secim0 != 15 && secim0 != 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Lamborghini")) {
                        System.out.print("3-");
                        ((Spor_Araba) arabalar.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Porsche")) {
                        System.out.print("2-");
                        ((Spor_Araba) arabalar.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Mitsubishi")) {
                        System.out.print("4-");
                        ((Spor_Araba) arabalar.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Toyota")) {
                        System.out.print("5-");
                        ((Spor_Araba) arabalar.get(4)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 5) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Subaru")) {
                        System.out.print("6-");
                        ((Spor_Araba) arabalar.get(5)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 6) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Mclaren")) {
                        System.out.print("7-");
                        ((Spor_Araba) arabalar.get(6)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Fiat")) {
                        System.out.print("10");
                        ((Ticari_Araba) arabalar1.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 10) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Cadillac")) {
                        System.out.print("13-");
                        ((Klasik_Araba) arabalar2.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 13) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else if (terim.equalsIgnoreCase("Chevrolet")) {
                        System.out.println("14-");
                        ((Klasik_Araba) arabalar2.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 14) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }
                        u = 10;
                    } else {
                        System.out.println("Böyle bir araç bulunamadı. Tekrar giriniz.");
                    }
                }
                break;

            case 2:
                System.out.println("Aradığınız terimi giriniz:");
                u = 11;
                while (u == 11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Superb")) {
                        System.out.print("16-");
                        ((Gundelik_Araba) arabalar3.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 16) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Megane")) {
                        System.out.print("17-");
                        ((Gundelik_Araba) arabalar3.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 17) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Focus")) {
                        System.out.print("1-");
                        ((Spor_Araba) arabalar.get(0)).BilgileriYazdir();
                        System.out.print("18-");
                        ((Gundelik_Araba) arabalar3.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1 && secim0 != 18) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Passat")) {
                        System.out.print("19-");
                        ((Gundelik_Araba) arabalar3.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Transit")) {
                        System.out.print("8-");
                        ((Ticari_Araba) arabalar1.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 8) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Kangoo")) {
                        System.out.print("9-");
                        ((Ticari_Araba) arabalar1.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 9) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Doblo")) {
                        System.out.print("10-");
                        ((Ticari_Araba) arabalar1.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 10) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Caddy")) {
                        System.out.print("11-");
                        ((Ticari_Araba) arabalar1.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 11) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("918 Spyder")) {
                        System.out.print("2-");
                        ((Spor_Araba) arabalar.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Gallardo")) {
                        System.out.print("3-");
                        ((Spor_Araba) arabalar.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Lancer Evo")) {
                        System.out.print("4-");
                        ((Spor_Araba) arabalar.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Supra")) {
                        System.out.print("5-");
                        ((Spor_Araba) arabalar.get(4)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 5) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Impraza")) {
                        System.out.print("6-");
                        ((Spor_Araba) arabalar.get(5)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 6) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Senna")) {
                        System.out.print("7-");
                        ((Spor_Araba) arabalar.get(6)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Mustang")) {
                        System.out.print("12-");
                        ((Klasik_Araba) arabalar2.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 12) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Eldorado")) {
                        System.out.print("13-");
                        ((Klasik_Araba) arabalar2.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 13) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Corvette")) {
                        System.out.print("14-");
                        ((Klasik_Araba) arabalar2.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 14) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Beetle")) {
                        System.out.print("15-");
                        ((Klasik_Araba) arabalar2.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 15) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else {
                        System.out.println("böyle bir araç bulunamadı");
                    }
                }
                break;
            case 3:
                System.out.println("Aradığınız terimi giriniz:");
                u = 11;
                while (u == 11) {
                    terim = scanner.next();
                    if (terim.equalsIgnoreCase("Beyaz")) {
                        System.out.print("1-");
                        ((Spor_Araba) arabalar.get(0)).BilgileriYazdir();
                        System.out.print("8-");
                        ((Ticari_Araba) arabalar1.get(0)).BilgileriYazdir();
                        System.out.print("10-");
                        ((Ticari_Araba) arabalar1.get(2)).BilgileriYazdir();
                        System.out.print("14-");
                        ((Klasik_Araba) arabalar2.get(2)).BilgileriYazdir();
                        System.out.print("16-");
                        ((Gundelik_Araba) arabalar3.get(0)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 1 && secim0 != 8 && secim0 != 10 && secim0 != 14 && secim0 != 16) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Bordo")) {
                        System.out.print("17-");
                        ((Gundelik_Araba) arabalar3.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 17) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Gri")) {
                        System.out.print("5-");
                        ((Spor_Araba) arabalar.get(4)).BilgileriYazdir();
                        System.out.print("11-");
                        ((Ticari_Araba) arabalar1.get(3)).BilgileriYazdir();
                        System.out.print("18-");
                        ((Gundelik_Araba) arabalar3.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 5 && secim0 != 11 && secim0 != 18) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Siyah")) {
                        System.out.print("2-");
                        ((Spor_Araba) arabalar.get(1)).BilgileriYazdir();
                        System.out.print("9-");
                        ((Ticari_Araba) arabalar1.get(1)).BilgileriYazdir();
                        System.out.print("12-");
                        ((Klasik_Araba) arabalar2.get(0)).BilgileriYazdir();
                        System.out.print("19-");
                        ((Gundelik_Araba) arabalar3.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 2 && secim0 != 9 && secim0 != 12 && secim0 != 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Mavi")) {
                        System.out.print("4-");
                        ((Spor_Araba) arabalar.get(3)).BilgileriYazdir();
                        System.out.print("6-");
                        ((Spor_Araba) arabalar.get(5)).BilgileriYazdir();
                        System.out.print("13-");
                        ((Klasik_Araba) arabalar2.get(1)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 4 && secim0 != 6 && secim0 != 13) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Sarı")) {
                        System.out.print("15-");
                        ((Klasik_Araba) arabalar2.get(3)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 15) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Yeşil")) {
                        System.out.print("3-");
                        ((Spor_Araba) arabalar.get(2)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 3) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (terim.equalsIgnoreCase("Turuncu")) {
                        System.out.print("7-");
                        ((Spor_Araba) arabalar.get(6)).BilgileriYazdir();
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 != 7) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else {
                        System.out.println("böyle bir araç bulunamadı");
                    }
                }
                break;
            case 4:
                System.out.println("Verebileceğiniz en iyi bütçeyi giriniz:");
                u = 11;
                while (u == 11) {
                    deger = scanner.nextInt();
                    if (deger >= 850) {
                        int a=1;
                        int b=8;
                        int c=12;
                        for (int j = 0; j < arabalar.size(); j++) {
                            System.out.print(a+"-"); ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j=0;j< arabalar1.size();j++){
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;
                        }
                        for (int j=0;j< arabalar2.size();j++){
                            System.out.print(c +"-"); ((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                            c++;
                        }
                        for (int j=0;j< arabalar3.size();j++){
                            System.out.print(c+"-");((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                            karar=3;
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 750 && deger < 850) {
                        int a=1;
                        int b=8;
                        int c=12;
                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 1){
                                a++;
                                continue;
                            }
                            System.out.print(a+"-"); ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c+"-");  ((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                            c++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c+"-");  ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                            karar=3;
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==2 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 700 && deger < 750) {
                        int a=1;
                        int b=8;
                        int c=12;
                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 6 || j == 1) {
                                a++;
                                continue;
                            }
                            System.out.print(a+"-");((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;

                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c+"-");((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                            c++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c +"-");((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;

                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==2 || secim0==6 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 650 && deger < 700) {
                        int a=1;
                        int b=8;
                        int c=12;
                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 6 || j == 1) {
                                a++;
                                continue;
                            }
                            System.out.print(a+"-");((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();

                            b++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            if (j == 0) {
                                c++;
                                continue;
                            }
                            System.out.print(c+"-");((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                            c++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c+"-"); ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                            karar=3;
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==7 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 600 && deger < 650) {
                        int a=1;
                        int b=8;
                        int c=12;
                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 6 || j == 1 || j == 2) {
                                a++;
                                continue;
                            }
                            System.out.print(a+"-"); ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar1.size(); j++) {
                            if (j == 0 || j == 2) {
                                b++;
                                continue;
                            }
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;
                        }
                        for (int j = 0; j < arabalar2.size(); j++) {
                            System.out.print(c+"-");  ((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                            c++;

                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c+"-"); ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;

                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19){
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==3 || secim0==14 || secim0==7 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 550 && deger < 600) {
                        int a=1;
                        int b=8;
                        int c=12;
                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 6 || j == 1 || j == 2 || j == 4) {
                                a++;
                                continue;
                            }
                            System.out.print(a+"-");((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;

                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            if (j == 0 || j == 2 || j == 1 || j == 3) {
                                c++;
                                continue;
                            }
                            System.out.print(c+"-"); ((Klasik_Araba) arabalar2.get(j)).BilgileriYazdir();
                            c++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c+"-"); ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;

                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }
                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==2 || secim0==5 || secim0==3 || secim0==7 || secim0 > 19 ||
                                    secim0==12 || secim0==13 || secim0==14 || secim0==15) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 450 && deger < 550) {
                        int a=1;
                        int b=8;
                        int c=16;
                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 6 || j == 1 || j == 2 || j == 3 || j == 4) {
                                a++;
                                continue;
                            }
                            System.out.print(a+"-"); ((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;

                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(c+"-"); ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;

                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==5 || secim0==13 ||
                                    secim0==15 || secim0==3 || secim0==4 || secim0==14 || secim0==7 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 400 && deger < 450) {
                        int a=1;
                        int b=8;
                        int c=16;

                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 6 || j == 1 || j == 2 || j == 3 || j == 4) {
                                a++;
                                continue;
                            }
                            System.out.print(a+"-");((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-");  ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;

                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            if (j == 0) {
                                c++;
                                continue;
                            }
                            System.out.print(c+"-"); ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==5 || secim0==13 ||
                                    secim0==15 || secim0==3 || secim0==4 || secim0==14 || secim0==7 ||
                                    secim0==16 ||secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 350 && deger < 400) {
                        int a=1;
                        int b=8;
                        int c=16;
                        for (int j = 0; j < arabalar.size(); j++) {
                            if (j == 6 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5) {
                                a++;
                                continue;
                            }
                            System.out.print(a+"-");((Spor_Araba) arabalar.get(j)).BilgileriYazdir();
                            a++;
                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;

                        }
                        for (int j = 0; j < arabalar3.size(); j++) {
                            if (j == 0 || j == 1 || j == 3) {
                                c++;
                                continue;
                            }
                            System.out.print(c+"-"); ((Gundelik_Araba) arabalar3.get(j)).BilgileriYazdir();
                            c++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==5 || secim0==6 || secim0==13 ||
                                    secim0==15 || secim0==3 || secim0==4 || secim0==14 || secim0==7 ||
                                    secim0==16 || secim0==17 || secim0==19 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 250 && deger < 350) {
                        int b=8;
                        for (int j = 0; j < arabalar3.size(); j++) {
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==5 || secim0==6 || secim0==13 ||
                                    secim0==15 || secim0==3 || secim0==4 || secim0==14 || secim0==7 ||
                                    secim0==16 || secim0==17 || secim0==19 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 230 && deger < 250) {
                        int b=8;
                        for (int j = 0; j < arabalar1.size(); j++) {
                            if (j == 3) {
                                b++;
                                continue;
                            }
                            System.out.print(b+"-");((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==5 || secim0==6 || secim0==11 || secim0==13 ||
                                    secim0==15 || secim0==3 || secim0==4 || secim0==14 || secim0==7 ||
                                    secim0==16 || secim0==17 || secim0==19 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 225 && deger < 230) {
                        int b=8;
                        for (int j = 0; j < arabalar1.size(); j++) {
                            if (j == 1 || j == 3) {
                                b++;
                                continue;
                            }
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==5 || secim0==6 || secim0==9 || secim0==11 || secim0==13 ||
                                    secim0==15 || secim0==3 || secim0==4 || secim0==14 || secim0==7 ||
                                    secim0==16 || secim0==17 || secim0==19 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger >= 200 && deger < 225) {
                        int b=8;
                        for (int j = 0; j < arabalar1.size(); j++) {
                            if (j == 1 || j == 2 || j == 3) {
                                b++;
                                continue;
                            }
                            System.out.print(b+"-"); ((Ticari_Araba) arabalar1.get(j)).BilgileriYazdir();
                            b++;
                        }
                        System.out.println("-----------------------------");
                        System.out.println("1-Araç kirala" +
                                "\n2-Çıkış");
                        karar=3;
                        while (karar<1 || karar>2){
                            karar=scanner.nextInt();
                            if (karar==2)
                            {
                                karar=32111;
                                return karar;
                            }
                            else if (karar==1){
                                continue;
                            }
                            else
                                System.out.println("Hatalı değer girildi. Tekrar giriniz :");
                        }

                        System.out.println("Kiralamak istediğiniz aracı seçiniz");
                        secim0 = 20;
                        while (secim0 <= 0 || secim0 > 19) {
                            secim0 = musteri.nextInt();
                            if (secim0 < 1 || secim0==12 || secim0==2 || secim0==5 || secim0==6 || secim0==9 || secim0==10 ||
                                    secim0==11 || secim0==13 ||
                                    secim0==15 || secim0==3 || secim0==4 || secim0==14 || secim0==7 ||
                                    secim0==16 || secim0==17 || secim0==19 || secim0 > 19) {
                                System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                secim0 = 20;
                            }

                        }

                        u = 10;
                    } else if (deger < 0) {
                        System.out.println("Ücret 0 dan küçük olamaz");
                    } else {
                        System.out.println("Belirttiğiniz miktara bir araç bulunamadı.");
                    }
                }
                break;
        }
        return secim0;
    }



    //FİLTRE KİRALAMA SÜRESİ
    public int filtre_deger_dondur(int p){
        secim00=-1;
        while (secim00 <= 0 || secim00 > 30) {
            System.out.println("Aracı kaç günlüğüne kiralayacaksınız?(en az 1,en fazla 30 gün)");
            secim00 = musteri.nextInt();
            if (secim00 <= 0 || secim00 > 30) {
                System.out.println("Arabaları en az 1,en fazla 30 gün kiralayabilirsiniz.");
            }

        }
        p=secim00;
        return p;
    }

}
