package Generic;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> stack = new ArrayList<>();
    Integer top = 0;

    public void push(Integer num){

        stack.add(num);
        top++;
    }

    public List<Integer> pop(){

        top--;
        stack.remove(top);
        return stack;
    }

    public void show(){

        for(Integer j: stack){

            System.out.print(j + " ");
        }
    }


}
