class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand="";
        char dnaUnit,rnaUnit=' ';
        int dnaLength;
        dnaLength=dnaStrand.length();
        for(int i=0;i<dnaLength;i++)
        {
            dnaUnit=dnaStrand.charAt(i);
            if(dnaUnit == 'G')
                rnaUnit='C';
            else if(dnaUnit == 'C')
                rnaUnit = 'G';
            else if(dnaUnit == 'T')
                rnaUnit = 'A';
            else if(dnaUnit == 'A')
                rnaUnit = 'U';
            rnaStrand = rnaStrand+Character.toString(rnaUnit);
        }
        return rnaStrand;
    }
}
