public class Algorithms {

        private int[] theArray = new int[25];

        private int arraySize = 10;



        public void generateRandomArray() {

            for (int i = 0; i < arraySize; i++) {

                theArray[i] = (int) (Math.random() * 10) + 10;
            }
        }


        public void printArray() {

            for (int i = 0; i < arraySize; i++) {

                System.out.print(" | " + i + " | ");
                System.out.print(theArray[i] + " |");

                System.out.println();
            }
        }


        public void linearSearch (Integer value){

            StringBuilder indexes = new StringBuilder();

            boolean valueFound = false;

            for (int i = 0; i < arraySize; i++ ){

                if(value == theArray[i]) {

                    valueFound = true;

                   indexes.append(i).append(" ");
                }

            }
            System.out.println( "The value was found in the following indexes: " + indexes);

            if (!valueFound) {

                System.out.println("None");
            }
        }


        public void binarySearch(int value){

            int low = 0;
            int high = arraySize - 1;

            while(low <= high){

                int middle = (high + low)/2 ;

                if(theArray[middle] < value) low = middle + 1;
                else if(theArray[middle] > value) high = middle -1;
                else {

                    System.out.println("Found a match at index: " + middle + " ");

                    low = high + 1;
                }
            }

        }

        public void bubbleSort(){

             for(int i = arraySize -1; i > 0; i--){

                 for (int j = 0 ; j < i; j++ ){

                     if(theArray[j] > theArray[j+1]){

                         swapValues(j,j+1);
                     }
                 }
             }
        }

    private void swapValues(int firstIndex, int secondIndex) {

           int temp = theArray[firstIndex];
           theArray[firstIndex] = theArray[secondIndex];
           theArray[secondIndex] = temp;



    }


    public static void main(String[] args) {

        Algorithms newArray = new Algorithms();

        newArray.generateRandomArray();
        newArray.printArray();
        newArray.bubbleSort();
        System.out.println();
        newArray.printArray();
        newArray.binarySearch(12);

    }
}
