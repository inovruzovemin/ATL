package PACKAGE_NAME;

import java.util.Arrays;

public class BubleSearch {
    public static void main(String[] args) {
    int[] buble = { 4, 8, 84, 1,85,89,5,2,45};
        int last = buble.length - 1;
        int count = 0; // 25,
        boolean used= false;

        // eger f+1 indexli reqem f indexli reqemden kicik olsa f indexli element f+1 ile yer deyisir

        for(int i = 0; i<buble.length;i++){
            for (int f = 0; f<last; f++) {
                if(buble [f]>buble [f+1]){
                    int hash = buble [f];
                    buble [f]= buble [f+1];
                    buble [f+1] = hash;

                    used = true;
                    count ++;
                }

            }

            System.out.println(used ? count : "");
        }
        System.out.println(Arrays.toString(buble));
        }
    }
