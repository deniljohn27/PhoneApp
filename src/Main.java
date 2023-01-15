public class Main {
    public static void main(String[] args) {

        LandLine l1=new LandLine("121");
        LandLine l2=new LandLine("122");

        l1.callNUmber("122");
        l2.receiveCall("122");
        System.out.println(l2.answerCall());

    }
}