interface PhoneInterFace {
    int TIMEOUT = 10000;

    void sendCall();

    void receiveCall();

    private void internalCall() {
        System.out.println("Interanal use only");
    }

    public static void notMain(String args) {
        System.out.println("TIMEOUT = "+TIMEOUT + "args");

    }

    public default void printLogo(){
        System.out.println("** Phone");
        internalCall();
    }
}


interface MobilePhoneInterfacce extends PhoneInterFace{

    void sendSMS();
    void receiveSMS();

}


interface MP3Interface{
    void play();
    void stop();
}

interface  MusicePhoneInterface extends MobilePhoneInterfacce, MP3Interface{
    void playMP3ringTone();

}

interface AI_Interface{
    void recognizeSpeech();
    void sythesizeSpeech();
}

class PDAPhone {
    public int calculate(int x, int y){
        return  x+y;
    }
}

class smartPhone extends PDAPhone implements MP3Interface, MobilePhoneInterfacce{


    public void schedule(){
        System.out.println("일정관리");
    }
    @Override
    public void sendCall() {
        System.out.println("전화감");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화옴");
    }

    @Override
    public void sendSMS() {
        System.out.println("문자감");
    }

    @Override
    public void receiveSMS() {
        System.out.println("문자옴");
    }

    @Override
    public void play() {
        System.out.println("재생중");
    }

    @Override
    public void stop() {
        System.out.println("멈춤");
    }
}


class AiPhone implements MobilePhoneInterfacce, AI_Interface{


    public int touch() {
        return 0;
    }
    @Override
    public void sendCall() {
        System.out.println("전화 하겠습니다( 음성합성되어)");
    }

    @Override
    public void receiveCall() {
        System.out.println("전화왔따 (온사람목소리로)");
    }

    @Override
    public void sendSMS() {
        System.out.println("메세지 보내겠습니다 (합성된 목소리로)");
    }

    @Override
    public void receiveSMS() {
        System.out.println("메세지 왔다 (온사람 목소리로)");
    }

    @Override
    public void recognizeSpeech() {
        System.out.println("인식되었습니다.");
    }

    @Override
    public void sythesizeSpeech() {
        System.out.println("합성되었습니다");
    }
}




public class myPhone implements PhoneInterFace{

    @Override
    public void sendCall() {
        System.out.println("전화거는중");

    }

    @Override
    public void receiveCall() {
        System.out.println("전화 받는중");
    }


    public void sound(){
        System.out.println("밸소리 연주중");
    }

    public static void main(String[] args) {
        smartPhone p = new smartPhone();

        p.printLogo();
        p.sendCall();
        p.receiveCall();
        p.play();
    }
}



