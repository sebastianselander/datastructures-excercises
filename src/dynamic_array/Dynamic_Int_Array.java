package dynamic_array;

public class Dynamic_Int_Array implements Listable {

    private int[] array;
    private int counter;

    public Dynamic_Int_Array(){
        this.array = new int[1];
        this.counter = 0;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void add(int item) {
        if (array.length == counter){
            copyArray();
        }
        array[counter] = item;
        counter++;
    }

    @Override
    public int size() {
        return array.length;
    }

    private void copyArray(){
        int[] newArray = new int[array.length * 2];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public String toString(){
        String result = "";
        for (int i = 0; i < counter; i++){
            result += Integer.toString(array[i]);
        }
        return result;
    }
}
