package PACKAGE_NAME;

public class BinarySearch {
    public static void main(String[] args) {
        int [] number = {1,2,5,10,25,35,50,75,100};
        int first =0;
        int last = number.length-1;
        int middle = (first+last)/2;
        int search =75;
        int count = 0;

            for(int num=0;num<last;num++){
                if(number[middle]<search){
                    num=last+1;
                    count++;
                    System.out.println(count);
            }
                else if(number[middle]>search){
                    last=middle;
                    count++;
                }
                else {
                    System.out.println("This number don't available");
                }
        }
        System.out.println(count);

    }

}
