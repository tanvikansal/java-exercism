import java.util.HashMap;

public class Palindrome {
    HashMap<String,AllowedSymbol> allowedSymbols;
    public boolean check(String sentence) {
        boolean sentenceWithoutPunctuation=isSentenceWithoutPunctuation(sentence);
        if(sentenceWithoutPunctuation){
            sentence = removeSpace(sentence);
            sentence = sentence.toLowerCase();
            int sentenceLength=sentence.length();
           for(int i=0;i<sentenceLength/2;i++)
           {
               if(sentence.charAt(i) != sentence.charAt(sentenceLength-1-i)){
                  return false; 
               }
           } 
        }
        else{
            return false;
        }
        return true;
    }
    
    public boolean isSentenceWithoutPunctuation(String sentence)
    {
        char letter;
        allowedSymbols = new HashMap<String,AllowedSymbol>();
        allowedSymbols.put("UpperCaseAlphabet",new AllowedSymbol("UCA",65,90));
        allowedSymbols.put("LowerCaseAlphabet",new AllowedSymbol("LCA",97,122));
        allowedSymbols.put("Numerals", new AllowedSymbol("No",48,57));
        allowedSymbols.put("Space",new AllowedSymbol("S",32,32));
        for(int i=0;i<sentence.length();i++)
        {
            letter = sentence.charAt(i);
            boolean isAllowedLetter=false;
            for(AllowedSymbol allowedSymbol:allowedSymbols.values())
            {
                if(letter>=allowedSymbol.getLowerLimit() && letter<=allowedSymbol.getUpperLimit())
                    isAllowedLetter=true;
            }
            if(isAllowedLetter)
                continue;
            else
                return false;
        }
        return true;
    }
    
    public String removeSpace(String sentence){
        String sent="";
        char letter;
        for(int i=0;i<sentence.length();i++)
        {
            letter=sentence.charAt(i);
            if(letter != allowedSymbols.get("Space").getLowerLimit())
                sent=sent+letter;
        }
        return sent;
    }
}
class AllowedSymbol
{
    private String name;
    private int upperLimit;
    private int lowerLimit;
    
    AllowedSymbol(String name,int lowerLimit,int upperLimit)
    {
        this.name = name;
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }
    public String getName(){
        return name;
    }
    
    public int getLowerLimit()
    {
        return lowerLimit;
    }
    
    public int getUpperLimit()
    {
        return upperLimit;
    }
}