
import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand="";
        char dnaUnit,rnaUnit=' ';
        int dnaLength;
        dnaLength=dnaStrand.length();
        for(int i=0;i<dnaLength;i++)
        {
            dnaUnit=dnaStrand.charAt(i);
            rnaUnit=getRnaUnit(dnaUnit);
            rnaStrand = rnaStrand+Character.toString(rnaUnit);
        }
        return rnaStrand;
    }
    public char getRnaUnit(char dnaUnit)
    {
        HashMap<Character,Character> dnaRnaMapping =new HashMap<Character,Character>();
        dnaRnaMapping.put('G', 'C');
        dnaRnaMapping.put('g', 'C');
        dnaRnaMapping.put('C', 'G');
        dnaRnaMapping.put('T','A');
        dnaRnaMapping.put('t','A');
        dnaRnaMapping.put('A', 'U');
        dnaRnaMapping.put('a', 'U');
        return dnaRnaMapping.get(dnaUnit);
    }
}
