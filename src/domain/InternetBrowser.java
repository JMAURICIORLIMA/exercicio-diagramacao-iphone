package domain;

public interface InternetBrowser {

    public void openWebsite(String url);
    public void closeWebsite();
    public void search(String query);
    public void navigateBack();
    public void navigateForward();
    public void bookmarkPage(String url);
    public void clearHistory();
    public void addNewTab();
    public void refreshPage();

}
