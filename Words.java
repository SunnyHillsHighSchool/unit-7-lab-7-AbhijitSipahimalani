//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Abhijit Sipahimalani

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Words
{
	private ArrayList<Word> words;

	public Words(String[] wordList)
	{
    //ask Mrs. Diester about creating a constructor and assigning the words from the words from the wordList into the array list into a word. 
	}

	public int countWordsWithXChars(int size)
	{
		int count=0;
    for(int i = 0; i < words.length; i++)
    {
      if(words.get(i).getLength == size)
      count ++;
    }
		return count;
	}
	
	//this method will remove all words with a specified size / length
	//this method will also return the sum of the vowels in all words removed
	public int removeWordsWithXChars(int size)
	{
    int count = 0;
    for(int i = words.length - 1; i > 0; i--){
      if (words.get(i).getLength == size){
        count += words.get(i).getNumVowel; 
        words.remove(i);
      }
    }
    return count;
	}

	public int countWordsWithXVowels(int numVowels)
	{
		int count=0;
    for (int i = 0; i < words.length; i++){
      if(words.get(i).getNumVowel == numVowels)
        count ++; 
    }
		return count;
  }
	//add in a toString
  public String toString(){
  //ask what should be done for the toString method 
    return words 
  }
}
