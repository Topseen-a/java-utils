public class Vowel{
    public static void main(String[] args){

    System.out.println(isVowel("I love programming"));


    }

public static int isVowel(String word){

    vowel = 0;
    for (int count = 1; count <= word; count++)
        if (word == "a" && word == "e" && word == "i" && word == "o" && word == "u"){
            vowel += count;
            }

    return vowel;

}



}
