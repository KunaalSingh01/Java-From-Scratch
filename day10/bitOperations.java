public class bitOperations {
    //get ith bit
    public static int getBit(int num, int position){
        int bitMask= 1<<position;
        if((num&1<<position)==0){
            return 0;
        }else{
            return 1;
        }
    }

    //Set ith bit
    public static int setBit(int bit,int position){
        int bitMask = 1<<position;
        bit= bit|bitMask;
        return bit;
    }

    //CLear ith bit
    public static int clearBit(int bit, int position){
        int bitMask=~(1<<position);
        return bit&bitMask;
    }

    //Update ith bit to 0 or 1;
    public static void updateBit(int bit, int position, int update){
        
        if(update==0){
            System.out.println(clearBit(bit, position)); 
        }else{
            System.out.println(setBit(bit, position));
        }
        
    }
    // clear till last ith bit 
    public static int clearTillBit(int bit,int position){
        int bitMask=~(0)<<position;
        return bit&bitMask;
    }

    //clear range of bits????????
    //?
    //?

    //To check if a number is of the power two
    public static boolean powOfTwo(int number){
        return (number&(number-1))==0;
    }

    //to check the number of 1's in a binary number 
    public static int countOnes(int num){
        int count=0;
        while(num>0){
            if ((num &1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(getBit(10, 0));
        System.out.println(setBit(10,2));
        System.out.println(clearBit(10, 1));
        updateBit(10, 1, 0);
        updateBit(10, 2, 1);
        System.out.println(clearTillBit(15, 2));
        System.out.println(powOfTwo(64));
        System.out.println(countOnes(15));
    }
    

}
