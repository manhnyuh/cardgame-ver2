public class Human {

    int cardNum;

    public int getCard(){
        return cardNum;
    }

    public void setCard(int min, int max){
        cardNum = ((int)(Math.random()*(max-min)))+min;
    }
}
