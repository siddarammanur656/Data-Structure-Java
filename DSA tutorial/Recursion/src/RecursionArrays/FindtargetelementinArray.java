package RecursionArrays;

public class FindtargetelementinArray {

    public static void main(String[] args) {
        int [] arr={1,2,3,41,5,6};
        int target=44;
        System.out.println(FindEle3(arr,target,0));
    }

    static int FindEle3(int [] arr, int target, int index){
        if(index== arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return FindEle3(arr, target, index+1);
    }

    static boolean FindEle(int [] arr, int target, int index){
        if(index== arr.length-1){
            return false;
        }
        return (arr[index]==target) || FindEle(arr, target, index+1);
    }

    static boolean FindEle1(int [] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    static int FindEle2(int [] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            //if target finds it will return index of that findouted element
            if(arr[i]==target){
                return i;//or we print findouted element also using this arr[i]
            }
        }
        return -1;// if targeted element not find in given array if will print -1
    }

}
