import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int mat, kimya, fizik, muzik, turkce, topl = 0;
                double avarage;

                Scanner input = new Scanner(System.in);

                System.out.print("Matmetik ders notunuz : ");
                mat = input.nextInt();
                System.out.print("Fizik ders notunuz :");
                fizik = input.nextInt();
                System.out.print("muzik ders notunuz :");
                muzik = input.nextInt();
                System.out.print("kimya ders notunuz  :");
                kimya = input.nextInt();
                System.out.print("Türkçe ders notunuz :");
                turkce = input.nextInt();

                if (mat < 0 || mat > 100) {
                    topl = topl + mat;
                }
                if (fizik < 0 || fizik > 100) {
                    topl += fizik;

                }
                if (kimya < 0 || kimya > 100) {
                    topl += kimya;

                }
                if (turkce < 0 || turkce > 100) {
                    topl += muzik;

                }
                if (muzik < 0 || muzik > 100) {
                    topl += turkce;
                }
                if (!(topl >= 0 && topl <= 100)) {
                    System.out.println("Notları Yanlış Girdiniz. Düzeltiniz.");

                } else {
                    avarage = (mat + fizik + muzik + kimya + turkce) / 5;
                    if (avarage >= 55) {
                        System.out.println("Tebrikler.Sınıfı Geçtiniz !");

                    } else {
                        System.out.println("Üzgünüz Sınıfta Kaldınız .Seneye Görüşmek Üzere ");
                    }
                    System.out.println("Not Ortalamanız :" + avarage);

                }
            }
}
