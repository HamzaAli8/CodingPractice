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

            String indexes = "";

            boolean valueFound = false;

            for (int i = 0; i < arraySize; i++ ){

                if(value == theArray[i]) {

                    System.out.println("The value was found in the following: ");

                    valueFound = true;

                    System.out.println(indexes += i + " ");
                }
            }
            if (!valueFound) {

                System.out.println("None");
            }
        }




    public static void main(String[] args) {

        Algorithms newArray = new Algorithms();

        newArray.generateRandomArray();
        newArray.printArray();
        newArray.linearSearch(12);
    }
}
