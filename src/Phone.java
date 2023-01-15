public interface Phone {

    void powerOn();
    void callNUmber(String number);
    void receiveCall(String number);
    boolean answerCall();
    boolean isRinging();
}
