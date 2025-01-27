class BigOfTwoNums {
    int bigOfTwo(int x, int y) {
        if (x > y)
            return x;
        return y;
    }
}

public class Demo035 {
    public static void main(String[] args) {
        BigOfTwoNums obj = new BigOfTwoNums();
        int bigNum = obj.bigOfTwo(100, 20);
        System.out.println(bigNum);
    }
}
