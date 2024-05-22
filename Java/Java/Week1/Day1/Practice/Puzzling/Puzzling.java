import java.util.ArrayList;
import java.util.Random;
public class Puzzling {
    Random randMachine = new Random();
    public ArrayList getRolls(){

        ArrayList<Integer> res =new ArrayList<Integer>();
        for (int i=0 ; i<8; i++){
            res.add(randMachine.nextInt(20)+1);
    }
        return res;
    }
    public char getRandomLetter(){
        char[] lettres={'A','B','B','R','AA','AA','AAA','F','Z','Z','Z','F','F','C','V','B','N','H','Y','Y','E','A','Y','U','I','M'};
        return lettres[(randMachine.nextInt(25))];
    }
    public String getPassword (){
        String res="";
        for(int i=0;i<10; i++ ){
            res += getRandomLetter();
    }
        return res;
    }
    public ArrayList<String> getNewPasswordSet(int b){
        ArrayList<String> passwords= new ArrayList<String>() ;
        for (int i=0;i<AA;i++){
        passwords.add(getPassword());
    }
        return passwords;
    }

    }