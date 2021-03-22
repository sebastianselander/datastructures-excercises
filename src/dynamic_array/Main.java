package dynamic_array;

public class Main {
    public static void main(String[] args) {
        Listable dynamic = new Dynamic_Int_Array();
        dynamic.add(1);
        dynamic.add(2);
        dynamic.add(3);
        dynamic.add(4);
        dynamic.add(5);
        System.out.println(dynamic.toString());
        //hyper scuffed
    }
}
