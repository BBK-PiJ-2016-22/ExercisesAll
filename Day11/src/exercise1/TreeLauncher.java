package exercise1;

public class TreeLauncher{
	 

	public static void main (String[] args){
		
		TreeLauncher t  = new TreeLauncher();
		t.Launcher();
	 
	}
	
	public void Launcher(){
		
		IntegerTreeNode newTree = new IntegerTreeNode(6);
		newTree.add(5);
		newTree.add(9);
		newTree.add(3);
		newTree.add(8);
		newTree.add(11);
		newTree.add(5);
		newTree.add(9);
		newTree.add(3);
		newTree.add(8);
		newTree.add(11);
		newTree.add(5);
		newTree.add(9);
		newTree.add(3);
		newTree.add(8);
		newTree.add(11);
		newTree.add(5);
		newTree.add(9);
		newTree.add(3);
		newTree.add(8);
		newTree.add(11);
		newTree.add(5);
		newTree.add(9);
		newTree.add(3);
		newTree.add(8);
		newTree.add(11);
		newTree.add(5);
		newTree.add(9);
		newTree.add(3);
		newTree.add(8);
		newTree.add(11);
		System.out.println(newTree.toString());

		System.out.println(newTree.depth());
		newTree.trave().forEach(a -> System.out.println(a.getValue()));



	}


}