package pl.waw.sgh;

import javax.xml.crypto.Data;
import java.util.Date;

public class Numbers {

    //psvm
    /*
    comment
    multiple line

     */


    public static void main(String[] args) {
        int b;
        b=7;

        int a=4;


        int c= a + b;

        Integer aa=a;
        aa = 5656*a;

        //operators: + - * /
        // % is modulo
        int a1= b % a;
        System.out.println("a1=" +a1 );

        //add 1 to a1
        a1++;

        // substract 1 from a1
        a1--;

        int a2 = a1++;  //wynik to 3
        int a5 = ++a1; //wynik to 4

        System.out.println("a5=" + a5);


        Float f1 = 353.5f;
        Double d1 = 755.6d;

        //Float f2 = f1 + d1; won't work, because doulbe has higher precision
        Double d2 = f1 +d1;

        Long l1 = 54L;
        // when long z dużej litery, to po cyfrze dodaje L

        int i1 = 35472;
        //Integer i2 = i1 + l1; won't work, because has lower precision than long
        long l2 = i1 + l1;

        byte b1= 56;
        short s1 = 342; //rarely used
        long l3 = b1 * s1;

        //Long.valueOf(l2)- covert from long to Long (from primitive to object type)
        int i3 = Long.valueOf(l2).intValue();
        int i4 = l1.intValue();

        long l4 = 283437492938023L;
        System.out.println("14=" + l4 );
        int i5 = Long.valueOf(l4).intValue();
        System.out.println("i5=" + i5);

        Date curDate = new Date();
        System.out.println(System.currentTimeMillis());
        System.out.println(curDate);


        Double dd = 5.348753*1e12;

        Long dd2 = Math.round(dd);

        System.out.println(dd);
        System.out.println(dd2);

        //double dd4 =Math.pow(2.0, 4.0);
        //Math.PI
        // floor- rounding down
        //random- generates random
        //squareroot - pierwiastek kwadratowy



    }

}
