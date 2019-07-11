import java.util.ArrayList;

class TwelveDays {
    String verse(int verseNumber) {
        String verse;
        VerseCreater verseCreater =new VerseCreater();
        verse=verseCreater.getVersePartOne(verseNumber)+verseCreater.versePartTwo(verseNumber);
        return verse;
    }

    String verses(int startVerse, int endVerse) {
        String verses="";
        for(int verseNo=startVerse;verseNo<=endVerse;verseNo++)
            verses=verses+verse(verseNo)+(verseNo!=endVerse?"\n":"");
        return verses;
    }
    
    String sing() {
        String song;
        song=verses(1,12);
        return song;
    }
    
}

class Gift
{
    private String name,amount;
    public String getName(){
        return name;
    }
    public String getAmount()
    {
        return amount;
    }
    Gift(String name,String amount)
    {
        this.name=name;
        this.amount=amount;
    }
}
class DayNumber
{
    private String dayNoInwords;
    DayNumber(String dayNoInWords){
        this.dayNoInwords = dayNoInWords;
    }
    public String getDayInWords()
    {
        return dayNoInwords;
    }
}

class VerseCreater
{
    public String getVersePartOne(int verseNumber){
        String versePartOne;
        versePartOne="On the "+getDays().get(verseNumber-1).getDayInWords()+" day of Christmas my true love gave to me: ";
        return versePartOne;
    }
    public String versePartTwo(int verseNumber){
        String versePartTwo="";
        for(int giftNo = verseNumber-1; giftNo>=0;giftNo--)
        {
            versePartTwo=versePartTwo+(giftNo == 0 && verseNumber != 1? "and " :"")+(getGifts().get(giftNo).getAmount()+" "+getGifts().get(giftNo).getName()) + (giftNo != 0 ? ", " :".\n");
        }
        return versePartTwo;
    }
    private ArrayList<DayNumber> getDays()
    {
        ArrayList<DayNumber> days =new ArrayList();
        days.add(new DayNumber("first"));
        days.add(new DayNumber("second"));
        days.add(new DayNumber("third"));
        days.add(new DayNumber("fourth"));
        days.add(new DayNumber("fifth"));
        days.add(new DayNumber("sixth"));
        days.add(new DayNumber("seventh"));
        days.add(new DayNumber("eighth"));
        days.add(new DayNumber("ninth"));
        days.add(new DayNumber("tenth"));
        days.add(new DayNumber("eleventh"));
        days.add(new DayNumber("twelfth"));
        return days;
    }
    private ArrayList<Gift> getGifts()
    {
        ArrayList<Gift> gifts = new ArrayList();
        gifts.add(new Gift("Partridge in a Pear Tree","a"));
        gifts.add(new Gift("Turtle Doves","two"));
        gifts.add(new Gift("French Hens","three"));
        gifts.add(new Gift("Calling Birds","four"));
        gifts.add(new Gift("Gold Rings","five"));
        gifts.add(new Gift("Geese-a-Laying","six"));
        gifts.add(new Gift("Swans-a-Swimming","seven"));
        gifts.add(new Gift("Maids-a-Milking","eight"));
        gifts.add(new Gift("Ladies Dancing","nine"));
        gifts.add(new Gift("Lords-a-Leaping","ten"));
        gifts.add(new Gift("Pipers Piping","eleven"));
        gifts.add(new Gift("Drummers Drumming","twelve"));
        return gifts;
    }
    
}
