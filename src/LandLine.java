public class LandLine implements Phone{

   private String myNumber;
   private boolean isRinging;
   private boolean isPowerOn;

    public LandLine(String myNumber) {
        this.myNumber = myNumber;
        this.isRinging=false;
        this.isPowerOn=false;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(String myNumber) {
        this.myNumber = myNumber;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;

    }

    @Override
    public void callNUmber(String number) {
        if(isPowerOn){
            System.out.println("Your are calling" + number);
        }
        else{
            System.out.println("Your land line is off");
        }

    }

    @Override
    public void receiveCall(String number) {

        if(isPowerOn && myNumber.equals(number)){
            this.isRinging=true;
            System.out.println("Hey"+myNumber+"yo");
        }
        else{
            System.out.println("Call not received");
        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging){
            System.out.println("Call answered");
            this.isRinging=false;
            return true;
        }
        return false;
    }

    @Override
    public boolean isRinging() {

        return isRinging;
    }
}
