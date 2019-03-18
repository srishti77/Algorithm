package CCI;
import java.lang.*;
public class UserInput {
    
    public static interface TextInput {
        public  void add(char c);
        public  String getValue();
    }

    public static class NumericInput implements TextInput {
        String value="";
        String value1="";
        
        NumericInput(){
            
        }
        public void add(char c){
            value = value+c;
           // System.out.println(value);
        }
        
        public String getValue(){
            char[] array= value.toCharArray();
            for(int i = 0; i< array.length;i++){
                 if(Character.isDigit(array[i])){
                     value1 = value1+array[i];
                 }
            }
            
           
            return value1;
        }
        
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('.');
        input.add('0');
        System.out.println(input.getValue());
    }
}