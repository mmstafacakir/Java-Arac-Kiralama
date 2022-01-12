public class Klasik_Araba implements IFiltre{
    //TANIMLAMA
    private String model;
    private String marka;
    private int yıl;
    private int ucret;
    private String renk;
    //CONST...
    Klasik_Araba(String model, String marka, int yıl, int ucret, String renk) {
        this.model = model;
        this.marka = marka;
        this.yıl = yıl;
        this.ucret = ucret;
        this.renk = renk;
    }

    //YAZDIR
    public void BilgileriYazdir() {
        System.out.println(this.getModel() + "  " + this.getMarka() + "  " + this.getYıl() + "  " + this.getRenk() + "  " +this.getUcret()+ " TL" );
    }


    //GET-SET
    public String getRenk() {
        return renk;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getUcret() {
        return ucret;
    }

    public int getYıl() {
        return yıl;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }
}
