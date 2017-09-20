package exercise1;

import java.util.ArrayList;
import java.util.List;

public class IntegerTreeNode{
	
	private int value; 
	private IntegerTreeNode left; 
	private IntegerTreeNode right;
	private static StringBuilder returnString = new StringBuilder();

    public int getValue() {
        return value;
    }

    public IntegerTreeNode(int value) {

	    this.value = value;
	}

    public void add(int newNumber){


        if (newNumber > value) {

            if (right == null) {
                right = new IntegerTreeNode(newNumber);

            } else {
                right.add(newNumber);
            }

        } else {

            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n){

        if (n == this.value) {

            return true;

        } else if (n > this.value) {

            if (right == null) {

                return false;

            } else {

                return right.contains(n);
            }

        } else {

            if (left == null) {
                return false;

            } else {

                return left.contains(n);
            }
        }
    }


    public int getMax(){
        if (right == null){
            return value;
        } else {
            return right.getMax();
        }
    }

    public int getMin(){
        if(left == null){
            return value;
        }else{
            return left.getMin();
        }
    }
    @Override
    public String toString() {
        returnString.append('[');
        recurse();
        returnString.append(']');

        return returnString.toString();
    }

    private void recurse(){
        returnString.append(value);
        if (left != null){
            returnString.append("[");
            left.recurse();
            returnString.append(']');

        }

        if (right != null) {
            returnString.append("[");
            right.recurse();
            returnString.append(']');
        }
    }


    public int depth(){
        return depthRecurse(this);
    }


    private int counter, depth;

    private int depthRecurse(IntegerTreeNode n) {
        if (n != null) {
            counter++;

            if (counter > depth) {
                depth = counter;
            }

            depthRecurse(n.left);
            depthRecurse(n.right);

            counter--;
        }
        return depth;
    }
    private static List<IntegerTreeNode> toReturn = new ArrayList<>();

    private void helper(){
        if(left != null){
            left.helper();
        }

        toReturn.add(this);

        if(right != null){
            right.helper();
        }

    }
    public List<IntegerTreeNode> trave(){
        helper();
        return  toReturn;
    }


}
