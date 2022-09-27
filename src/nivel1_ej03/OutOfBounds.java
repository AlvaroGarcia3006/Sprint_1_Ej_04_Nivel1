package nivel1_ej03;

import java.util.ArrayList;

public class OutOfBounds {
    private ArrayList<Integer> nums = new ArrayList<Integer>();

    public OutOfBounds() {
        nums.add(1);
        nums.add(2);
    }

    public Integer getNum(int index) throws ArrayIndexOutOfBoundsException {
        Integer result = 0;
        try {
             result =  nums.get(index);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Oops");
        }
        return result;
    }
}