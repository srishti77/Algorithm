package CCI;

import java.util.ArrayList;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class HashTablesCustom<K,V> {

	//Used to store the array of chains
	private ArrayList<HashNodes<K,V>> bucketArray;
	
	//Current capacity of the array list
	private int numBuckets;
	
	//Current size of the array list
	private int size;
	
	class HashNodes<K,V>{
		K key;
		V value;
		HashNodes<K,V> next;
		HashNodes(K key, V value){
			this.key=key;
			this.value=value;
		}
	}
	
	public HashTablesCustom() {
		bucketArray = new ArrayList<>();
		numBuckets= 10;
		size=0;
		
		//Create empty chains
		for(int i=0; i< numBuckets; i++)
			bucketArray.add(null);
	}
	
	public int getSize() {
		return size;
	}
	
	public int getBucketIndex(K key) {
		int index= key.hashCode();
		
		return Math.abs(index%numBuckets);
	}
	
	public void add(K key, V value) {
		
		int index= getBucketIndex(key);
		HashNodes<K,V> newNode = new HashNodes(key, value);
		HashNodes<K,V> head= bucketArray.get(index); 
		
		//when key already exist
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		
		size++;
		head = bucketArray.get(index);
		newNode.next=head;
		bucketArray.set(index, newNode);
		
		if((1.0*size)/numBuckets >0.7) {
			
			ArrayList<HashNodes<K,V>> temp= bucketArray;
			bucketArray= new ArrayList();
			numBuckets= numBuckets*2;
			
			for(int i=0; i< numBuckets; i++) {
				bucketArray.add(null);
			}
			
			for(HashNodes<K,V> nodes: temp)
			{
				while(nodes!=null) {
					add(nodes.key, nodes.value);
					nodes=nodes.next;
				}
			}
			
		}
	}
	
	public V remove(K key) {
		int index= getBucketIndex(key);
		
		HashNodes<K,V> head= bucketArray.get(index);
		HashNodes<K,V> prev= null;
		
		while(head!=null) {
			if(head.key.equals(key)) {
				break;
			}
			prev=head;
			head=head.next;
		}
		
		
		//if key not exist
		if(head == null)
			return null;
		
		size--;
		
		if(prev!=null)
			prev.next=head.next;
		
		
		else
			bucketArray.set(index, head.next);
		
			
		
		return head.value;
		
	}
	
	public V get(K key) {
		int index= getBucketIndex(key);
		HashNodes<K,V> head= bucketArray.get(index);
		
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
				
			
			}
			
			head=head.next;
		}
		
		return null;
		
	}
	
	public static void main(String s[]) {
		HashTablesCustom<String, Integer> hashtable= new HashTablesCustom();
		hashtable.add("People", 2);
		hashtable.add("Google", 3);
		hashtable.add("Hello", 4);
		hashtable.add("Slim", 5);
		
		System.out.println(hashtable.get("Hello"));
		System.out.println(hashtable.remove("Slim"));
		System.out.println(hashtable.get("Slim"));
		System.out.println(hashtable.get("Google"));
	}
}
