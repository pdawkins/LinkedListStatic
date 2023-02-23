public class MyLinkedList {
    // data fields
    private String[] Data;
    private int amount;
    private int last;

    // Constructor
    public MyLinkedList(int size){
        Data = new String[size];
        amount = 0;
        last = 0;
    }

    public boolean isEmpty(){
        return (amount == 0) ? true : false;
    }

    public int count(){return amount;}

    public void insert(String name, int position){
        if(position >= Data.length)
            System.out.println("Can't insert beyond " + (Data.length-1));
        else{
            // check if there is a space in the array
            if(amount == Data.length)
                System.out.println("No space remaining");
            else {
                if(position > last + 1)
                    System.out.println("Last item is in position "+ last);
                else{
                    // shift all items down and insert the new item
                    for(int i = last; i > position; i--)
                        Data[i] = Data[i-1];


                    // now write the value in
                    Data[position] = name;
                    System.out.println(name + " inserted in position "+position);

                    // now update the pointers
                    amount++;
                    last++;
                }
            }
        }
    }

    // check the last index
    private int locate(String name){
        boolean found = false;
        int position = 0;

        while (!found && position < last){
            if(Data[position].equals(name))
                found = true;
            else
                position++;
        }

        return  (found)? position: -1;
    }

    public void delete(String name){
        int position = locate(name);

        if (position == -1)
            System.out.println(name + " is not in the list");
        else{
            for(int i = position; i<last-1; i++)
                Data[i] = Data[i+1];
            Data[last-1] = null;
        }
        last--;
        amount--;
    }

    // overload Insert
    public void insert(String name){
        insert(name, last);
    }

    public String toString(){
        String result = "| ";
        for(int i=0; i< Data.length; i++){
            result = result + Data[i] + " | ";
        }
        return result;
    }
}
