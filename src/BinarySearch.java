package PACKAGE_NAME;

public class BinarySearch {
    public static void main(String[] args) {
        int [] number = {1,2,5,10,25,35,50,75,100};
        int first =0;
        int last = number.length-1;
        int middle = (first+last)/2;
        int search =75;
        int count = 0; // 25,

            for(int f=0;f<last;f++){
                if(number[middle]==search) {
                    System.out.println("Search number found. Index N-" + middle );
                    break;
                }
                else if(number[middle]<search) {
                    first = middle+1;
                    middle = (last + first)/2;
                    count++;
                }

                else {
                    last= middle -1;
                    middle=(last+first)/2;
                }
        }
        System.out.println(count);

    }

}
