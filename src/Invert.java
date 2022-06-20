// Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

import java.util.Scanner;

public class Invert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // İlk olarak Kullanıcıdan değer alıyoruz.

        System.out.println();
        System.out.print("Lutfen Olusacak Ucgenin Satir Sayisi Olan n Sayisini Giriniz : ");
        int n = input.nextInt();
        System.out.println();

        // Eksi bir değer girilmemesi için if atıyorum.

        if (n > 0) {

            // Daha sonra for döngüsü yardımıyla girilen değere eşit olacak şekilde satır sayısını yazdırıyoruz.

            for (int i = 0; i <= n; i++) {

                // Yukardaki for döngüsünün içine bir for daha koyarak her satıra yıldızlardan önce gelecek boşluk sayısını ayarlıyoruz.

                for (int j = 0; j <= i; j++) {
                    System.out.print(" ");
                }

                // Son olarak her satıra gelecek yıldız sayısını formülize ederek döngüye koyuyoruz.

                for (int k = 1; k <= ((2 * n) - (2 * i) - 1); k++) {
                    System.out.print("*");
                }

                // Bu soutu atmazsak her satırı yanyana yazdırır. Bu yüzden bunu unutmuyoruz.

                System.out.println();
            }
        } else {
            System.out.print("Lutfen Gecerli Bir Deger Giriniz ! ");
            System.out.println();
        }
    }
}