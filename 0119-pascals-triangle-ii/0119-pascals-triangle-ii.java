class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> list = new ArrayList<>();
        if (rowIndex == 0) {
            list.add(1);
            return list;
        }
        if (rowIndex == 1) {
            list.add(1);
            list.add(1);
            return list;
        }
        list.add(1);
        list.add(2);
        list.add(1);
        for (int i = 2; i < rowIndex; i++) {
            List<Integer> templist = list;
            list = new ArrayList<>();
            list.add(1);
            for (int j = 0; j <= i - 1; j++) {
                list.add(templist.get(j) + templist.get(j + 1));
            }
            list.add(1);
        }
        return list;
    }
}