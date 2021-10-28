package secmelisiralama;

public class secmelisiralamaalgoritmasi {
    public static void main(String[] args) { // bazen psvm gözükmüyor elle yazmam gerekiyor çözümünü bulamadım hocam.Bu koduna araştırdım birşey elde edemedim.Yardımcı olursanız bu konu hakkında sevinirim :)
        int[] dizi = {7, 3, 15, 40, 18, 2}; //Dİzilerimi oluşturduk ve int olarak atadık.Tam sayı değerlerimizi girdik.
//döngüsünün özelliği kullanılarak dizi değerleri aldık.
   /*1.FOR DÖNGÜSÜ */
        for (int i = 0; i < dizi.length - 1; i++) { //Dizinin ilk verisini i=0 olarak atadık dizi.length-1 komutu kullanılarak dizinin bütün değerlerini alacağız.
// int sayi = dizi[i] komutu ile değerler sayı değişkenine göre atamasını yapıyoruz.
            int sayi = dizi[i];
            //int geçici_deger = i ise belirtilen sayının dizideki indeksi geçici ,geçici değer olarak kaydeder.
            int gecici_sayi= i;
            /*2.FOR DÖNGÜSÜ */
            for (int j = i + 1;j <dizi.length; j++) { //ikinci for döngüsünde ise dizideki i teriminden sonraki elemanlara bakarak dizi uzunluğunca işlemi yaptırdık.

                if (dizi[j]<sayi){
                    sayi =dizi[j];
                    gecici_sayi = j;

                }
                if (gecici_sayi !=1){
                    dizi[gecici_sayi] = dizi[i];
                    dizi[i]=sayi;
                    //dizinin ilk sayı en küçük öge kabul ederek başlar.
                    //Sonra diğer sayılara e bakarak bu veriler arasında, seçilen sayıdan daha küçük bir sayı varsa bu sayı en  başa koyulur.
                    //dizimizden en küçük sayı bulunduktan sonra kalan diziye tekrar 1.for döngüsündeki  işlem uygulanır.
                    //Kalan diziden seçilen en küçük sayıyı, ilk seçilen sayının yanına koyar. Böylece sayılar soldan sağa doğru küçükten büyüğe doğru sıralanmaya başlar.

                }
                //Eldeki sayıdan daha küçük değerde sayı varsa sayı değişkeni ve indeksi değiştirilerek işlemler(dizimizdeki 40 sayısına kadar yada en büyük sayıya kadar devam eder.)

            }
            /*3.FOR DÖNGÜSÜ */
        }for(int sayi:dizi){
            //Boolean ile (":") birbirine çevililebilen ifadeler  yada aynı tip ifadeler olduğu için bu for döngümüzdede gelen sayı dizideki sayılarımızla true olana kadar devam eder.
            // false ise dizilerimizdeki sayıyla aynı değilse atlar true ise ekrana yazdırır.
            System.out.println(sayi);

            /* MUSTAFA ÖZDEMİR*/
            /*ÖĞRENCİ NO : 2005010019 */

        }

    }
}
