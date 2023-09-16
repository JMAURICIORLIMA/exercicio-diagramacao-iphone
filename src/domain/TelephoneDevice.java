package domain;

public interface TelephoneDevice {

    public void makeCall(String phoneNumber);
    public void receiveCall(String callerName);
    public void endCall();
    public void sendTextMessage(String phoneNumber, String message);
    public void receiveTextMessage(String sender, String message);
    public void startVoiceMail();

}
