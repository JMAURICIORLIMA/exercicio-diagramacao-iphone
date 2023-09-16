package test;

import domain.Iphone;

public class IphoneTest {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.startVoiceMail();
        iphone.endCall();
        iphone.makeCall("81996633122");
        iphone.endCall();
        iphone.receiveCall("Call center");
        iphone.endCall();
        iphone.sendTextMessage("81996633122", "Testando sms.");
        iphone.receiveTextMessage("Marcos", "Testando sms.");

        System.out.println("--------------------------");

        iphone.play();
        iphone.nextTrack();
        iphone.nextTrack();
        iphone.previousTrack();
        iphone.setVolume(32);
        System.out.println(iphone.getVolune());
        iphone.stop();

        System.out.println("--------------------------");

        iphone.openWebsite("www.google.com");
        iphone.refreshPage();
        iphone.search("YouTube");
        iphone.bookmarkPage("google.com");
        iphone.navigateForward();
        iphone.navigateBack();
        iphone.clearHistory();
        iphone.addNewTab();

    }
}
