class Solution {
    void rearrange(ArrayList<Integer> arr) {
       
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }
        
        int posIndex = 0, negIndex = 0;
        int i = 0;
        
        
        while (posIndex < pos.size() && negIndex < neg.size()) {
            arr.set(i++, pos.get(posIndex++));
            arr.set(i++, neg.get(negIndex++));
        }
        
        //remaining positive numbers
        while (posIndex < pos.size()) {
            arr.set(i++, pos.get(posIndex++));
        }
        
        //remaining negative numbers
        while (negIndex < neg.size()) {
            arr.set(i++, neg.get(negIndex++));
        }
    }
}
