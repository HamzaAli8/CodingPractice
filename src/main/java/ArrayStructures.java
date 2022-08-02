public class ArrayStructures {

    private int [] theArray = new int[25];

    private int arraySize = 10;

    public void generateRandomArray(){

        for (int i = 0; i < arraySize; i++){

          theArray[i] = (int)(Math.random() * 10)+90;
        }
    }

    public void printArray(){

        for(int i = 0; i < arraySize; i++){

            System.out.print(" | " + i + " | ");
            System.out.print(theArray[i] + " |");

            System.out.println();
        }
    }

    public void deleteNumber(int number){

        if(number < arraySize){

            for(int i = number; i < arraySize -1 ; i++){

                theArray[i] = theArray[i+1];
            }

            arraySize --;
        }
    }


    public static void main(String[] args) {

        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        newArray.printArray();
        newArray.deleteNumber(3);
        System.out.println();
        newArray.printArray();
    }
}
