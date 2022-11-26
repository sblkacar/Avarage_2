import java.util.Scanner;

public class Avarage_2 {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,muz,avarage;
        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Notunu giriniz");
        mat=input.nextByte();
        System.out.println("Fizik Notunu Giriniz");
        fiz= input.nextByte();
        System.out.println("kimya Notunu giriniz");
        kim=input.nextInt();
        System.out.println("Turkçe Notunu Giriniz");
        tur=input.nextByte();
        System.out.println("Müzik Notunu Gininiz");
        muz=input.nextInt();
        avarage=(muz+fiz+kim+tur+mat)/5;
        if (avarage>=55)
        {
            System.out.println("geçtiniz");

        }
        else if (avarage<55)
        {
            System.out.println("kaldınız");
        }

    }
}
