public class ArrayFunHouse
{
    public static int getSum(int[] numArray, int start, int stop)
    {
        int sum = 0;
        for (int i = start; i < stop; i++) {
            sum += numArray[i];
        }
        return sum;
    }

    public static int getCount(int[] numArray, int val)
    {
        int count = 0;
        for (int num : numArray) {
            if (num == val) {
                count++;
            }
        }
        return count;
    }

    public static int[] removeVal(int[] numArray, int val)
    {
        int count = 0;
        for (int num : numArray) {
            if (num != val) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : numArray) {
            if (num != val) {
                result[index++] = num;
            }
        }

        return result;
    }
}
