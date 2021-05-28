
package assignment3;

public class scrabbleModel {
    private String valueEntered;

    public scrabbleModel(String valueEntered){

        this.valueEntered = valueEntered;
    }
    public void ValidateInput()throws Exception{

        char[] arrayWord = valueEntered.toLowerCase().toCharArray();
        int numberOfVowels = 0;
        for(int i = 0;i < valueEntered.length();i++) {
            if(arrayWord[i] == 'a' || arrayWord[i] == 'e' || arrayWord[i] == 'i' || arrayWord[i] == 'o' || arrayWord[i] == 'u') {
                numberOfVowels++;

            }
        }

        if(valueEntered.isEmpty()){
            throw new IllegalArgumentException("Enter a word");
        }
        else if(valueEntered.length()<2){
            throw new IllegalArgumentException("The word must have minimum of 2 letters");
        }
        else if(valueEntered.length()>8){
            throw new IllegalArgumentException("The word must not be exceed the maximum limit of 8 letters");
        }
        else if(numberOfVowels==0){
            throw new IllegalArgumentException("The word must have atleast 1 vowel");
        }
        else{
            throw new IllegalArgumentException("");
        }
    }
}
