public class oddEven {
    public static void oddOrEven(int bit){
        int bitMask=1;
        if((bit & bitMask)==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(110);
    }
}
