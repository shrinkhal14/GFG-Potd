class Solution {
   
    public void sort012(ArrayList<Integer> arr) {
        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 0) {
                zero++;
            } else if (arr.get(i) == 1) {
                one++;
            } else {
                two++;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (zero > 0) {
                arr.set(i, 0);
                zero--;
            } else if (one > 0) {
                arr.set(i, 1);
                one--;
            } else {
                arr.set(i, 2);
                two--;
            }
        }
    }
}
