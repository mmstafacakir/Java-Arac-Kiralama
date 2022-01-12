
import java.util.Scanner;

public class KullaniciEkran extends Arabalar {
    Scanner musteri = new Scanner(System.in);
    Scanner ekleme = new Scanner(System.in);

    public void musteri_ekran() throws InterruptedException {
        String [] kiralanacak_arac=new String[19];


        //Arraylistlerdeki arabaları ekleme
        spor_araba();
        ticari_araba();
        klasik_araba();
        gundelik_araba();


        //KULLANICIDAN BİLGİLERİ ALMA
        System.out.println("Araç kiralama sistemimize hoş geldiniz.");
        Thread.sleep(2000);
        String belge;
        int k,l;
        int z;
        int p= 0,i=0;
        while (p == 0) {
            System.out.println("Sürücü belgeniz var mı?");
            belge = musteri.next();
            while (belge.equalsIgnoreCase("hayır") != true && belge.equalsIgnoreCase("evet") != true) {
                System.out.println("İstenmeyen kelime! Tekrar giriniz:");
                belge = musteri.next();
            }
            if (belge.equalsIgnoreCase("hayır")) {
                System.out.println("Sürücü belgesi olmadan araç kiralayamazsınız!");
                Thread.sleep(1000);
            }
            else if (belge.equalsIgnoreCase("evet")) {
                System.out.print("\nİsminizi girin:");
                String ad = musteri.next();
                System.out.print("Soyadınızı girin:");
                String soyad = musteri.next();
                System.out.print("\nBilgileriniz kaydediliyor...\n\n");
                Thread.sleep(2000);
                System.out.println("Bilgileriniz başarıyla kaydedilmiştir.");
                System.out.println("--------------------------------------");
                System.out.println("Kiralamak istediğiniz araç türünü seçiniz:" +
                        "\n1-Spor Arabalar" +
                        "\n2-Ticari Arabalar" +
                        "\n3-Klasik Arabalar" +
                        "\n4-Gündelik Arabalar" +
                        "\n5-Tümünü Listele" +
                        "\n\n---->");
                int secim,secim1;
                secim=5;
                secim1=31;

                while (secim >= 5 || secim <= 0) {
                    secim = musteri.nextInt();

                    //ARABALARI LISTELEME KİRALAMA VE FİLTRELEME İŞLEMLERİ


                    //SPOR ARABA
                    if (secim == 1) {
                        yazdir_spor_araba();
                        yazdir();
                        z=deger_dondur(secim);
                        if (z == 1) {

                            System.out.println("Kiralamak istediğiniz aracı seçiniz");
                            secim = 8;
                            while (secim <= 0 || secim > 7) {
                                secim = musteri.nextInt();

                                if (secim <= 0 || secim > 7) {
                                    System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                }
                            }
                            while (secim1 <= 0 || secim1 > 30) {
                                System.out.println("Aracı kaç günlüğüne kiralayacaksınız?(en az 1,en fazla 30 gün)");
                                secim1 = musteri.nextInt();
                                if (secim1 <= 0 || secim1 > 30) {
                                    System.out.println("Arabaları en az 1,en fazla 30 gün kiralayabilirsiniz.");
                                }

                            }
                            System.out.print("\nKiralanacak araç :");
                            kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                    + ((Spor_Araba) arabalar.get(secim - 1)).getMarka()
                                    + " " + ((Spor_Araba) arabalar.get(secim - 1)).getModel();
                            System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                            System.out.print(((Spor_Araba) arabalar.get(secim - 1)).getMarka() + " ");
                            System.out.print(((Spor_Araba) arabalar.get(secim - 1)).getModel());
                            System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Spor_Araba) arabalar.get(secim - 1)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");
                            kazaDurumu();
                            break;
                        }
                        //FİLTRELEMEDEN SONRAKİ KİRALAMA
                        else if (z==2) {
                            l = FiltreSpor(); //secim degeri versiyonu
                            if (l != 32111) {
                                k = filtre_deger_dondur(31); //secim1 degeri versiyonu
                                System.out.print("\nKiralanacak araç :");
                                kiralanacak_arac[i] = ad + " " + soyad + " " + " --> "
                                        + ((Spor_Araba) arabalar.get(l - 1)).getMarka()
                                        + " " + ((Spor_Araba) arabalar.get(l - 1)).getModel();
                                System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Spor_Araba) arabalar.get(l - 1)).getMarka() + " ");
                                System.out.print(((Spor_Araba) arabalar.get(l - 1)).getModel());
                                System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Spor_Araba) arabalar.get(l - 1)).getUcret() * k) + " " + "TL fiyatına kiraladı.");
                                kazaDurumu();
                                break;
                            }
                        }
                    }

                    //TİCARİ ARABA
                    else if (secim == 2) {
                        yazdir_ticari_araba();
                        yazdir();
                        z=deger_dondur(secim);
                        if (z == 1) {
                            System.out.println("Kiralamak istediğiniz aracı seçiniz");
                            secim = 5;
                            while (secim <= 0 || secim > 4) {
                                secim = musteri.nextInt();

                                if (secim <= 0 || secim > 4) {
                                    System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                }
                            }
                            while (secim1 <= 0 || secim1 > 30) {
                                System.out.println("Aracı kaç günlüğüne kiralayacaksınız?(en az 1,en fazla 30 gün)");
                                secim1 = musteri.nextInt();
                                if (secim1 <= 0 || secim1 > 30) {
                                    System.out.println("Arabaları en az 1,en fazla 30 gün kiralayabilirsiniz.");
                                }

                            }
                            System.out.print("\nKiralanacak araç :");

                            kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                    + ((Ticari_Araba) arabalar1.get(secim - 1)).getMarka()
                                    + " " + ((Ticari_Araba) arabalar1.get(secim - 1)).getModel();

                            System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                            System.out.print(((Ticari_Araba) arabalar1.get(secim - 1)).getMarka() + " ");
                            System.out.print(((Ticari_Araba) arabalar1.get(secim - 1)).getModel());
                            System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Ticari_Araba) arabalar1.get(secim - 1)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");
                            kazaDurumu();
                            break;
                        }
                        //FİLTRE SEÇİLMESİ
                        else if (z==2) {
                            l = FiltreTicari(); //secim degeri versiyonu
                            if (l != 32111) {
                                k = filtre_deger_dondur(31); //secim1 degeri versiyonu
                                System.out.print("\nKiralanacak araç :");
                                kiralanacak_arac[i] = ad + " " + soyad + " " + " --> "
                                        + ((Ticari_Araba) arabalar1.get(l - 1)).getMarka()
                                        + " " + ((Ticari_Araba) arabalar1.get(l - 1)).getModel();
                                System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Ticari_Araba) arabalar1.get(l - 1)).getMarka() + " ");
                                System.out.print(((Ticari_Araba) arabalar1.get(l - 1)).getModel());
                                System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Ticari_Araba) arabalar1.get(l - 1)).getUcret() * k) + " " + "TL fiyatına kiraladı.");
                                kazaDurumu();
                                break;
                            }
                        }
                    }


                    //KLASİK ARABA
                    else if (secim == 3) {
                        yazdir_klasik_araba();
                        yazdir();
                        z=deger_dondur(secim);
                        if (z == 1) {
                            System.out.println("Kiralamak istediğiniz aracı seçiniz");
                            secim = 5;
                            while (secim <= 0 || secim > 4) {
                                secim = musteri.nextInt();
                                if (secim <= 0 || secim > 4) {
                                    System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                }
                            }
                            while (secim1 <= 0 || secim1 > 30) {
                                System.out.println("Aracı kaç günlüğüne kiralayacaksınız?(en az 1,en fazla 30 gün)");
                                secim1 = musteri.nextInt();
                                if (secim1 <= 0 || secim1 > 30) {
                                    System.out.println("Arabaları en az 1,en fazla 30 gün kiralayabilirsiniz.");
                                }

                            }
                            System.out.print("\nKiralanacak araç :");

                            kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                    + ((Klasik_Araba) arabalar2.get(secim - 1)).getMarka()
                                    + " " + ((Klasik_Araba) arabalar2.get(secim - 1)).getModel();

                            System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                            System.out.print(((Klasik_Araba) arabalar2.get(secim - 1)).getMarka() + " ");
                            System.out.print(((Klasik_Araba) arabalar2.get(secim - 1)).getModel());
                            System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Klasik_Araba) arabalar2.get(secim - 1)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");
                            kazaDurumu();
                            break;
                        }
                        //FİLTRE SEÇİLMESİ
                        else if (z==2) {
                            l = FiltreKlasik(); //secim degeri versiyonu
                            if (l != 32111) {
                                k = filtre_deger_dondur(31); //secim1 degeri versiyonu
                                System.out.print("\nKiralanacak araç :");
                                kiralanacak_arac[i] = ad + " " + soyad + " " + " --> "
                                        + ((Klasik_Araba) arabalar2.get(l - 1)).getMarka()
                                        + " " + ((Klasik_Araba) arabalar2.get(l - 1)).getModel();
                                System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Klasik_Araba) arabalar2.get(l - 1)).getMarka() + " ");
                                System.out.print(((Klasik_Araba) arabalar2.get(l - 1)).getModel());
                                System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Klasik_Araba) arabalar2.get(l - 1)).getUcret() * k) + " " + "TL fiyatına kiraladı.");
                                kazaDurumu();
                                break;
                            }
                        }

                    }


                    //GUNDELİK ARABA
                    else if (secim == 4) {
                        yazdir_gundelik_araba();
                        yazdir();
                        z=deger_dondur(secim);
                        if (z == 1) {
                            System.out.println("Kiralamak istediğiniz aracı seçiniz");
                            secim = 5;
                            while (secim <= 0 || secim > 4) {
                                secim = musteri.nextInt();
                                if (secim <= 0 || secim > 4) {
                                    System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                }
                            }
                            while (secim1 <= 0 || secim1 > 30) {
                                System.out.println("Aracı kaç günlüğüne kiralayacaksınız?(en az 1,en fazla 30 gün)");
                                secim1 = musteri.nextInt();
                                if (secim1 <= 0 || secim1 > 30) {
                                    System.out.println("Arabaları en az 1,en fazla 30 gün kiralayabilirsiniz.");
                                }

                            }
                            System.out.print("\nKiralanacak araç :");

                            kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                    + ((Gundelik_Araba) arabalar3.get(secim - 1)).getMarka()
                                    + " " + ((Gundelik_Araba) arabalar3.get(secim - 1)).getModel();

                            System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                            System.out.print(((Gundelik_Araba) arabalar3.get(secim - 1)).getMarka() + " ");
                            System.out.print(((Gundelik_Araba) arabalar3.get(secim - 1)).getModel());
                            System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Gundelik_Araba) arabalar3.get(secim - 1)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");
                            kazaDurumu();
                            break;
                        }
                        //FİLTRE SEÇİLMESİ
                        else if (z==2){
                            l=FiltreGundelik(); //secim degeri versiyonu
                            if (l!=32111) {
                                k = filtre_deger_dondur(31); //secim1 degeri versiyonu
                                System.out.print("\nKiralanacak araç :");
                                kiralanacak_arac[i] = ad + " " + soyad + " " + " --> "
                                        + ((Gundelik_Araba) arabalar3.get(l - 1)).getMarka()
                                        + " " + ((Gundelik_Araba) arabalar3.get(l - 1)).getModel();
                                System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Gundelik_Araba) arabalar3.get(l - 1)).getMarka() + " ");
                                System.out.print(((Gundelik_Araba) arabalar3.get(l - 1)).getModel());
                                System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Gundelik_Araba) arabalar3.get(l - 1)).getUcret() * k) + " " + "TL fiyatına kiraladı.");
                                kazaDurumu();
                                break;
                            }
                        }
                    }


                    //TÜM ARABALAR
                    else if (secim == 5) {
                        butun_arabalar();
                        yazdir();
                        z=deger_dondur(secim);
                        if (z == 1) {
                            System.out.println("Kiralamak istediğiniz aracı seçiniz");
                            secim = 20;
                            while (secim <= 0 || secim > 19) {
                                secim = musteri.nextInt();

                                if (secim <= 0 || secim > 19) {
                                    System.out.println("Hatalı bir değer girdiniz. Lütfen tekrar giriniz:");
                                }
                            }
                            while (secim1 <= 0 || secim1 > 30) {
                                System.out.println("Aracı kaç günlüğüne kiralayacaksınız?(en az 1,en fazla 30 gün)");
                                secim1 = musteri.nextInt();
                                if (secim1 <= 0 || secim1 > 30) {
                                    System.out.println("Arabaları en az 1,en fazla 30 gün kiralayabilirsiniz.");
                                }

                            }
                            System.out.print("\nKiralanacak araç :");
                            if (secim >= 1 && secim < 8) {

                                kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                        + ((Spor_Araba) arabalar.get(secim - 1)).getMarka()
                                        + " " + ((Spor_Araba) arabalar.get(secim - 1)).getModel();

                                System.out.print(ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Spor_Araba) arabalar.get(secim - 1)).getMarka() + " ");
                                System.out.print(((Spor_Araba) arabalar.get(secim - 1)).getModel());
                                System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Spor_Araba) arabalar.get(secim - 1)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");

                                kazaDurumu();
                                break;
                            } else if (secim >= 8 && secim < 12) {

                                kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                        + ((Ticari_Araba) arabalar1.get(secim - 8)).getMarka()
                                        + " " + ((Ticari_Araba) arabalar1.get(secim - 8)).getModel();

                                System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Ticari_Araba) arabalar1.get(secim - 8)).getMarka() + " ");
                                System.out.print(((Ticari_Araba) arabalar1.get(secim - 8)).getModel());
                                System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Ticari_Araba) arabalar1.get(secim - 8)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");
                                kazaDurumu();
                                break;
                            } else if (secim >= 12 && secim < 16) {

                                kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                        + ((Klasik_Araba) arabalar2.get(secim - 12)).getMarka()
                                        + " " + ((Klasik_Araba) arabalar2.get(secim - 12)).getModel();

                                System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Klasik_Araba) arabalar2.get(secim - 12)).getMarka() + " ");
                                System.out.print(((Klasik_Araba) arabalar2.get(secim - 12)).getModel());
                                System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Klasik_Araba) arabalar2.get(secim - 12)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");
                                kazaDurumu();
                                break;
                            } else if (secim >= 16 && secim < 20) {

                                kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                        + ((Gundelik_Araba) arabalar3.get(secim - 16)).getMarka()
                                        + " " + ((Gundelik_Araba) arabalar3.get(secim - 16)).getModel();

                                System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                System.out.print(((Gundelik_Araba) arabalar3.get(secim - 16)).getMarka() + " ");
                                System.out.print(((Gundelik_Araba) arabalar3.get(secim - 16)).getModel());
                                System.out.println(" aracını" + " " + secim1 + " " + " günlüğüne" + " " + (((Gundelik_Araba) arabalar3.get(secim - 16)).getUcret() * secim1) + " " + "TL fiyatına kiraladı.");
                                kazaDurumu();
                                break;
                            }
                        }
                        //FİLTRE
                        else if (z==2){
                            l=FiltreHepsi(); //secim degeri versiyonu
                            if (l!=32111) {
                                k = filtre_deger_dondur(31); //secim1 degeri versiyonu
                                if (l >= 1 && l < 8) {

                                    kiralanacak_arac[i] = ad + " " + soyad + " " + " --> "
                                            + ((Spor_Araba) arabalar.get(l - 1)).getMarka()
                                            + " " + ((Spor_Araba) arabalar.get(l - 1)).getModel();

                                    System.out.print(ad + " " + soyad + " adlı kullanıcı ");
                                    System.out.print(((Spor_Araba) arabalar.get(l - 1)).getMarka() + " ");
                                    System.out.print(((Spor_Araba) arabalar.get(l - 1)).getModel());
                                    System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Spor_Araba) arabalar.get(l - 1)).getUcret() * k) + " " + "TL fiyatına kiraladı.");

                                    kazaDurumu();
                                    break;
                                } else if (l >= 8 && l < 12) {

                                    kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                            + ((Ticari_Araba) arabalar1.get(l - 8)).getMarka()
                                            + " " + ((Ticari_Araba) arabalar1.get(l - 8)).getModel();

                                    System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                    System.out.print(((Ticari_Araba) arabalar1.get(l- 8)).getMarka() + " ");
                                    System.out.print(((Ticari_Araba) arabalar1.get(l - 8)).getModel());
                                    System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Ticari_Araba) arabalar1.get(l - 8)).getUcret() * k) + " " + "TL fiyatına kiraladı.");
                                    kazaDurumu();
                                    break;
                                } else if (l >= 12 && l < 16) {

                                    kiralanacak_arac[i]=ad + " " + soyad +" "+" --> "
                                            + ((Klasik_Araba) arabalar2.get(l - 12)).getMarka()
                                            + " " + ((Klasik_Araba) arabalar2.get(l - 12)).getModel();

                                    System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                    System.out.print(((Klasik_Araba) arabalar2.get(l - 12)).getMarka() + " ");
                                    System.out.print(((Klasik_Araba) arabalar2.get(l - 12)).getModel());
                                    System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Klasik_Araba) arabalar2.get(l - 12)).getUcret() * k) + " " + "TL fiyatına kiraladı.");
                                    kazaDurumu();
                                    break;
                                } else if (l >= 16 && l < 20) {

                                    kiralanacak_arac[i] = ad + " " + soyad + " " + " --> "
                                            + ((Gundelik_Araba) arabalar3.get(l - 16)).getMarka()
                                            + " " + ((Gundelik_Araba) arabalar3.get(l - 16)).getModel();

                                    System.out.print(" " + ad + " " + soyad + " adlı kullanıcı ");
                                    System.out.print(((Gundelik_Araba) arabalar3.get(l - 16)).getMarka() + " ");
                                    System.out.print(((Gundelik_Araba) arabalar3.get(l - 16)).getModel());
                                    System.out.println(" aracını" + " " + k + " " + " günlüğüne" + " " + (((Gundelik_Araba) arabalar3.get(l - 16)).getUcret() * k) + " " + "TL fiyatına kiraladı.");
                                    kazaDurumu();
                                    break;
                                }
                            }
                            secim=1;
                        }
                        else if(z==3){
                            secim=1;
                        }
                    }

                    else
                        System.out.println("Yanlış değer girildi. Lütfen geçerli bir değer giriniz");
                }

            }
            //KULLANICI EKLENME DURUMU
            System.out.println("Yeni müşteri eklensin mi?");
            String musteri1;
            musteri1 = ekleme.next();
            while (musteri1.equalsIgnoreCase("Evet")!=true && musteri1.equalsIgnoreCase("Hayır")!=true)
            {
                System.out.println("Hatalı değer girildi. Lütfen tekrar giriniz : ");
                musteri1=ekleme.next();
            }
            if (musteri1.equalsIgnoreCase("Evet")) {
                i++;
            }

            else if (musteri1.equalsIgnoreCase("Hayır")) {
                System.out.println("         Kiralanan Araçlar        " +
                        "\n------------------------------------");
                for (int j=0;j<=i;j++)
                {
                    if (kiralanacak_arac[j]!=null)
                        System.out.println(kiralanacak_arac[j]);
                }
                System.exit(0);
            }

        }


    }


    //KULLANICIDAN BİLGİ ALMA 2
    public void yazdir(){
        System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz : " +
                "\n1-Araç kirala" +
                "\n2-Filtreleme işlemleri" +
                "\n3-Çıkış" +
                "\n-----------------\n");
    }
    public int deger_dondur(int x) throws InterruptedException {
        x = 4;
        while (x <= 0 || x > 3) {
            x = musteri.nextInt();
            if (x <= 0 || x > 3)
                System.out.println("lütfen geçerli bir değer giriniz");
        }
        return x;
    }



}