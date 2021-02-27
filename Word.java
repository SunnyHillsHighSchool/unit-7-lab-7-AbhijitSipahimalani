//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Abhijit Sipahimalani

import static java.lang.System.*;

public class Word
{
  
   //add an instance variable
private String word;
private int count;
	//create a constructor
public Word()
{
  word ="";
}	
public Word(String z)
{
  word = z;
}	
public int getNumVowels() {
  for(int i = 0; i < word.length(); i++){
     if(word.charAt(i) == 'a' || word.charAt(i) ==  'A' || word.charAt(i) ==  'e' || word.charAt(i) ==  'E' || word.charAt(i) ==  'i' || word.charAt(i) ==  'I' || word.charAt(i) ==  'o' || word.charAt(i) ==  'O' || word.charAt(i) ==  'u' || word.charAt(i) ==   'U') {
    count += 1;
    
     }
  }
return count;
}
	//look at the sample runner code
	//on the lab handout

	//create a toString method
public String toString(){
return word;
}
public String getWord (){
  return word;
}
public void setWord (String s){
  word = s;
}
public int getLength (){
  return word.length(); 
} 
}