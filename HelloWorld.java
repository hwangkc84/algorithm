import java.util.ArrayList;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("stack");
        ArrayStack stack = new ArrayStack(10);
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<arr.length; i++){
            stack.push(arr[i]);
        }

        System.out.println("empty:" + stack.empty());
        System.out.println("full:" + stack.full());

        System.out.println("peek:" + stack.peek());
        
        
    }

}