package exceptions;

public class Deneme {
    private void checker(){
        int numbs[] = {1,2,3,4,5,6};
        for(int x = 0;x<7;x++){
            try{
                System.out.println("--> " + numbs[x]);
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Error!! " + ex);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Let's start : ");
        Deneme deneme = new Deneme();
        deneme.checker();
        System.out.println("Finish!");
    }
}

/*
16.2 Java Dahili İstisnaları

En genel istisnalar, standart tip RuntimeException sınıfının alt sınıflarıdır. Java, çeşitli sınıf kütüphaneleri ile ilgili bir çok türde istisna tanımlar. Aşağıdaki liste, Unchecked RuntimeException’ları göstermektedir.

Exception	Description
ArithmeticException	Aritmetic hata, sıfıra bölünme gibi
ArrayIndexOutOfBoundsException	Dizi index’i sınırların dışında.
ArrayStoreException	Dizi elemanına uyumsuz türde atama.
ClassCastException	Geçersiz cast.
IllegalArgumentException	Metodu çalıştırmak için illegal argüman.
IllegalMonitorStateException	Illegal monitor işlemi, unlocked bir thread üzerinde bekleme gibi .
IllegalStateException	Ortam veya uygulama doğru olmayan durumda.
IllegalThreadStateException	İstenen işlem anlık thread durumu ile uyumlu değil.
IndexOutOfBoundsException	Bazı türde index sınır dışında.
NegativeArraySizeException	Dizi negatif boyutta yaratılmış
NullPointerException	Null referansının geçersiz kullanımı.
NumberFormatException	Bir string’in sayısal formata geçersiz dönüşümü
SecurityException	Güvenlik ihlali denemesi.
StringIndexOutOfBounds	Bir stringe sınırları dışında index verme
UnsupportedOperationException	Desteklenmeyen işlem karşılatırıldı.

Aşağıdaki liste, Javada ki CheckedException’ları göstermektedir:

Exception	Description
ClassNotFoundException	Sınıf bulunamadı.
CloneNotSupportedException	Nesne kopyalama, Kopyalanabilir arayüzde uygulanamadı.
IllegalAccessException	Sınıfa erişim engellendi.
InstantiationException	Abstract bir sınıf veya arayüzde nesne oluşturma.
InterruptedException	Bir thread, diğer bir thread tarafından kesildi.
NoSuchFieldException	İstenen dosya yok.
NoSuchMethodException	İstenen metot yok.
 */
