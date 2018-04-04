package pl.waw.sgh;

public class Arrays {

    public static void main(String[] args) {

        //int[] iArr= new int[5];  <- here will be 0 for 4 and 5
        Integer[] iArr = new Integer[5]; //here will be null for 4 and 5, because it's not defined
        iArr[0] = 32;
        iArr[1] = 665;
        iArr[2] = 8987;

        for (int i=0; i<iArr.length; i++) {

            System.out.println("element at i " +i+ "=" + iArr[i]);

        }
        System.out.println();
        //for each
        for (Integer el : iArr) {
            System.out.println("E1: " + el);
        }
    }
}
