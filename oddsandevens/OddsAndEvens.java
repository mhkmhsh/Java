public class OddsAndEvens
{
    private static int countEm(int[] array, boolean odd)
    {
        int count = 0;
        for (int num : array) {
            if (odd) {
                if (num % 2 != 0) {
                    count++;
                }
            } else {
                if (num % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[] getAllEvens(int[] array)
    {
        int count = countEm(array, false);
        int[] evens = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                evens[index++] = num;
            }
        }
        return evens;
    }

    public static int[] getAllOdds(int[] array)
    {
        int count = countEm(array, true);
        int[] odds = new int[count];
        int index = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                odds[index++] = num;
            }
        }
        return odds;
    }
}
