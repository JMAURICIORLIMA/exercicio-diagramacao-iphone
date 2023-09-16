package domain;

import domain.InternetBrowser;
import domain.ReproductorMusical;
import domain.TelephoneDevice;
import org.w3c.dom.ls.LSOutput;

public class Iphone implements TelephoneDevice, ReproductorMusical, InternetBrowser {

    private int volume;

    //TelephoneDevice
    @Override
    public void makeCall(String phoneNumber) { //realizarChamada
        System.out.println("Discando para o número...\n" + phoneNumber);
    }

    @Override
    public void receiveCall(String callerName) { //receberChamada
        System.out.println("Recebendo ligação...\n" + callerName);
    }

    @Override
    public void endCall() { //encerrarChamada
        System.out.println("Finalizando ligação");
    }

    @Override
    public void sendTextMessage(String phoneNumber, String message) { // enviarMensagemDeTexto
        System.out.println(phoneNumber + " - " + message + "\nEnviando mensagem...");
    }

    @Override
    public void receiveTextMessage(String sender, String message) { //receberMensagemDeTexto
        System.out.println("Mensagem recebida " + sender + " - " + message);
    }

    @Override
    public void startVoiceMail() { //iniciarCaixaPostal
        System.out.println("Chamada caixa postal...");
    }


    //ReproductorMusical

    @Override
    public void play() { //tocar
        System.out.println("Tocando...");
    }

    @Override
    public void pause() { //pausar
        System.out.println("Música pausada...");
    }

    @Override
    public void stop() { //parar
        System.out.println("Reprodutor musical parado.");
    }

    @Override
    public void nextTrack() { //próximaFaixa
        System.out.println(">> próxima música");
    }

    @Override
    public void previousTrack() { //faixaAnterior
        System.out.println("<< voltar música");
    }

    @Override
    public void setVolume(int volume) { //definirVolume
        this.volume = volume;
        System.out.println("Volume: " + this.volume);
    }

    @Override
    public int getVolune() { //obterVolume
        return volume;
    }


    //InternetBrowser
    @Override
    public void openWebsite(String url) { //abrirSite
        System.out.println("Abrindo site\n " + url + "\n...");
    }

    @Override
    public void closeWebsite() { //fecharSite
        System.out.println("Fechando site");
    }

    @Override
    public void search(String query) { //pesquisar
        System.out.println("Pesquisando...");
    }

    @Override
    public void navigateBack() { //navegarParaTrás
        System.out.println("Voltando página...");
    }

    @Override
    public void navigateForward() { //navegarParaFrente
        System.out.println("Avançando página...");
    }

    @Override
    public void bookmarkPage(String url) { //favoritarPágina
        System.out.println("Adicionando " + url + " como favorito.");
    }

    @Override
    public void clearHistory() { //limparHistórico
        System.out.println("Limpando histórico");
    }

    @Override
    public void addNewTab() { //adicionarNovaGuia
        System.out.println("Abrindo nova guia.");
    }

    @Override
    public void refreshPage() { //atualizarPágina
        System.out.println("Atualizando página.");
    }

}
