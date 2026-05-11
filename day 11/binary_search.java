public class binary_search {
    public static int binary_search(int number[],int key){
    int start = 0 ; int end = number.length - 1 ;
    while(end>=start){
        int mid  = (start + end)/ 2;

        if (number[mid] == key ){
            return mid;
        }
        if (number[mid] < key){
            start = mid + 1 ;
        }
        else{
        end  = mid - 1 ;

        }
    }
    return -1;   
    }
    public static void main(String[] args) {
        int number[] = {2,3,4,5,7,9};
        int key  = 7;
        int index = binary_search(number,key);
        System.out.println(index);
    }
}
