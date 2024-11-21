package PACKAGE_NAME;

import java.util.Arrays;
import java.util.Scanner;

public class ResizedArray {
    public static void main(String[] args) {
//        1.Arrayin uzanligi iste +
//        2.Arrayin elementlerini iste +
//        3.Yeni arrayin uzunlugunu iste +
//        4.Eger kohneden uzundursa elave ne qeder element varsa onlari iste
//        5.Eger kohneden qisadirsa ilk elementlerini yansit
//        6.Kohne arrayi ve yeni arayi ekrana ver+

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int[] oldBox = new int[sc.nextInt()];
        System.out.println("Enter elements in the array: ");
        for (int i = 0; i < oldBox.length; i++) {
            oldBox[i] = sc.nextInt();
        }
        System.out.println("Enter the new array size");
        int[] newBox = new int[sc.nextInt()];

        for (int i = 0; i < oldBox.length; i++) {
            newBox[i] = sc.nextInt();
        }


                }

            }
//
//            System.out.println("Old array : " + Arrays.toString(oldBox));
//            System.out.println("New array : " + Arrays.toString(newBox));
//        }
//    }
//    }
//        if (newBox.length <= oldBox.length) { // new array is same or short better than old
//            for (int i = 0; i < newBox.length; i++) {
//                newBox[i] = oldBox[i];
//            }
//
//        } else { //  new array is long better than old
//            System.out.println("Enter the extra array elements");
//            for (int i = 0; i < oldBox.length; i++) {
//                newBox[i] = oldBox[i];
//                for (int o = (newBox.length - oldBox.length); i < newBox.length; i++) {
//                    newBox[o] = sc.nextInt();