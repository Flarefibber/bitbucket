package HW_02_1;
import java.util.ArrayList;

public class CollectionHolder {

        private ArrayList<Integer> col = new ArrayList<Integer>(){
            @Override
            public boolean add(Integer integer) {

                for (int i = 0; i < this.size(); i++) {
                    this.set(i,this.get(i)+integer);
                }
                return super.add(integer);
            }

            @Override
            public Integer remove(int index) {
                int vindex = this.get(index);
                for (int i = 0; i < this.size(); i++) {
                    this.set(i,this.get(i)-vindex);
                }

                return super.remove(index);
            }
        };


        public void addCollection(int integer) {
            this.col.add(integer);
        }

        public void removeCollection(int integer) {
            this.col.remove(integer);
        }



    public int sizeCollection() {
            int size;
            size = this.col.size();
            return size;

    }
    public void printCollection() {
        System.out.println("============= Elements of the collection =============");
        for(Object o : col) {
            System.out.println("Item:" + o);
        }

    }

    public int indexOfCollection(int value) {
        return this.col.indexOf(value);

    }
    public int getCollection(int index) {
        return this.col.get(index);

    }
    public int maximum_elementCollection() {
        int max = this.col.get(0);
        for(Object o : col) {
            if((int)o>max)
                max=(int)o;

        }
        return max;
    }
    public int minimum_elementCollection() {
            int min = this.col.get(0);
        for(Object o : col) {
            if((int)o<min)
                min=(int)o;

        }
        return min;
    }
    public int arithmetic_meanCollection() {
        int value = 0;
        for(Object o : col) {
            value+=(int)o;

        }
        return value;
    }

}
