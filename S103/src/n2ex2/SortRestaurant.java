package n2ex2;

import java.util.Comparator;

public class SortRestaurant implements Comparator<Restaurant> {

    public int compare(Restaurant a, Restaurant b) {
        
        byte[] stringANameCode = a.getName().getBytes();
        byte[] stringBNameCode = b.getName().getBytes();
        
        int shorterStringLength = min(stringANameCode.length, stringBNameCode.length);
        boolean finished = false;
        int result = 0, i = 0;

        while (!finished && i < shorterStringLength) {
            if (stringANameCode[i] < stringBNameCode[i]) {
                finished = true;
                result = 1;
            }
            else if (stringANameCode[i] > stringBNameCode[i]) {
                finished = true;
                result = -1;
            }
            ++i;
        }
        if (result == 0) {
            return stringBNameCode.length - stringANameCode.length;
        }
        
        else if (result == 0) {
            return b.getScore() - a.getScore();
        }
        return result;

    }

    private int min(int length, int length2) {
        if (length < length2) {
            return length;
        }
        return length2;
    }
    
}
