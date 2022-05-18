
package AirlineClasses;

public class Payment {
      private int CardNum;
    private String ExprDate;

    public int getCardNum() {
        return CardNum;
    }

    public void setCardNum(int CardNum) {
        this.CardNum = CardNum;
    }

    public String getExprDate() {
        return ExprDate;
    }

    public void setExprDate(String ExprDate) {
        this.ExprDate = ExprDate;
    }

    public int getCCV() {
        return CCV;
    }

    public void setCCV(int CCV) {
        this.CCV = CCV;
    }
    private int CCV;
    
}
