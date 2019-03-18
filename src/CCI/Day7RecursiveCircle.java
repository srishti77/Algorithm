import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

 class Node{
	
	String name;
	int parentID;
	int ID;
	int weight;
	int totalWeight;
	public int getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}

	Node(int parentID, String name, int ID, int weight){
		this.parentID = parentID;
		this.name = name;
		this.ID = ID;
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentID() {
		return parentID;
	}

	public void setParentID(int parentID) {
		this.parentID = parentID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
	
}
public class Day7RecursiveCircle {

	static ArrayList<Node12> arrayObject = new ArrayList<Node12>();
	static int ID = 1;
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String args[]) {
		
		Day7RecursiveCircle day7 = new Day7RecursiveCircle();
		
		
		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Users\\User\\eclipse-workspace\\Algorithm\\src\\day7_input.txt");
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
			String CurrentLine;
			int Weight;
			try {
				while((CurrentLine = bufferedReader.readLine())!=null) {
					
					if(!CurrentLine.contains("->")) {
						Weight = Integer.parseInt(CurrentLine.split(" ")[1].replaceAll("\\(", "").replaceAll("\\)", ""));
						
						CurrentLine = CurrentLine.split(" ")[0];
						//System.out.println("Weight "+Weight);
					if(!day7.isExist(CurrentLine)) {
						
						Node12 node = new Node12(0,CurrentLine,ID, Weight );
						arrayObject.add(node);
					}
					else {
						arrayObject.get(day7.index_Of(CurrentLine)).setWeight(Weight);
					}
					ID++;
					
					}
					
					
					else {
						
						
						String[] myString = CurrentLine.split("->");
						String ParentString = myString[0].split(" ")[0];
						Weight = Integer.parseInt(myString[0].split(" ")[1].replaceAll("\\(", "").replaceAll("\\)", ""));
						String[] childrens = myString[1].replaceAll(" ", "").split(",");
						System.out.println("Weight:"+Weight);
						int ParentId;
						if(day7.isExist(ParentString)) {
						
							ParentId = arrayObject.get(day7.index_Of(ParentString)).getID();
							arrayObject.get(day7.index_Of(ParentString)).setWeight(Weight);
							int i= 0;
							while( i<childrens.length) {
								
								if(day7.isExist(childrens[i])) {
									arrayObject.get(day7.index_Of(childrens[i])).setParentID(ParentId);
								}
								
								else {
									day7.addChildrens(ParentId,childrens[i], ID);
									ID++;
								}
								i++;
							}
							
							
						}
						
						else {
						
							ParentId = ID;
							Node12 parentnode = new Node12(0, ParentString, ParentId, Weight);
							arrayObject.add(parentnode);
							int i= 0;
							ID++;
							while( i<childrens.length) {
								
								if(day7.isExist(childrens[i])) {
									
									arrayObject.get(day7.index_Of(childrens[i])).setParentID(ParentId);
								}
									
								
								else {
								day7.addChildrens(ParentId,childrens[i], ID);
								ID++;
								}
								i++;
							}
							
						}
					
					}
					
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		day7.wrongWeight(145);
		
		day7.displayParent();
	}
	
	public int index_Of(String getString) {
		int i;
		for(i=0; i< arrayObject.size(); i++)
		{
			
			if(getString.equals(arrayObject.get(i).getName()))
			{
				break;
				
			}
				
		}
		return i;
		
	}
	
	public void display() {
		
		for(int i = 0; i<arrayObject.size(); i++) {
			//System.out.print("Parent ID "+arrayObject.get(i).getParentID());
			//System.out.print("Name "+arrayObject.get(i).getName());
			//System.out.print("ID "+ arrayObject.get(i).getID());
			//System.out.println();
		}
	}
	
	public boolean isExist(String getString) {
		boolean isPresent = false;
		
		for(int i=0; i< arrayObject.size(); i++)
		{
			
			if(getString.equals(arrayObject.get(i).getName()))
			{
				
				isPresent = true;
				return isPresent;
			}
				
		}
		return isPresent;
		
		
	}
	
	public void addChildrens(int ParentId, String childName, int id) {
		
		Node12 nodeChild = new Node12(ParentId, childName, id, 0);
		arrayObject.add(nodeChild);
	}
	
	public void displayParent() {

		for(int i= 0; i<arrayObject.size(); i++)
		{
			if(arrayObject.get(i).getParentID() == 0) {
				//System.out.print("Parent is:" + arrayObject.get(i).getName());
				//System.out.println("Main Parent Id"+ arrayObject.get(i).getID());
				
				break;
			}
				
		}
	
	}
	
	static int weight =0;
	public void wrongWeight(int ParentId) {
		
		for(int i = 0; i<arrayObject.size(); i++) {
			
			if(arrayObject.get(i).getParentID() == ParentId) {
				
				System.out.println("ParentID:"+ParentId + "Current Id: " +arrayObject.get(i).getID()+ " WEight "+ arrayObject.get(i).getWeight());
				
				weight = weight+arrayObject.get(i).getWeight();
			
				System.out.println("-------");
				System.out.println("Weight is:"+weight);
			}
			
				
		}
		
		
	
		
	}
}
