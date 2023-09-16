import domain.InternetBrowser;
import domain.ReproductorMusical;
import domain.TelephoneDevice;

public class Iphone implements TelephoneDevice, ReproductorMusical, InternetBrowser {
    //TelephoneDevice
    @Override
    public void makeCall(String phoneNumber) { //realizarChamada

    }

    @Override
    public void receiveCall(String callerName) { //receberChamada

    }

    @Override
    public void endCall() { //encerrarChamada

    }

    @Override
    public void sendTextMessage(String phoneNumber, String message) { // enviarMensagemDeTexto

    }

    @Override
    public void receiveTextMessage(String sender, String message) { //receberMensagemDeTexto

    }

    @Override
    public void startVoiceMail() { //iniciarCaixaPostal

    }


    //ReproductorMusical

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void nextTrack() {

    }

    @Override
    public void previousTrack() {

    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public int getVolune() {
        return 0;
    }


    //InternetBrowser
    @Override
    public void openWebsite(String url) { //abrirSite

    }

    @Override
    public void closeWebsite() { //fecharSite

    }

    @Override
    public void search(String query) { //pesquisar

    }

    @Override
    public void navigateBack() { //navegarParaTrás

    }

    @Override
    public void navigateForward() { //navegarParaFrente

    }

    @Override
    public void bookmarkPage(String url) { //favoritarPágina

    }

    @Override
    public void clearHistory() { //limparHistórico

    }

    @Override
    public void addNewTab() { //adicionarNovaGuia

    }

    @Override
    public void refreshPage() { //atualizarPágina

    }

}
