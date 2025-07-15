package BrowserHistoryDemo;

public class Main {
    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        browser.visit("https://example.com");
        browser.visit("https://openai.com");
        browser.visit("https://github.com");
        
        browser.back();
        browser.current();

        browser.back();
        browser.current();

        browser.forward();
        browser.current();

        System.out.println("\n-- Music Player --");
        MusicPlayerHistory music = new MusicPlayerHistory();
        music.playSong("Song A");
        music.playSong("Song B");
        music.back();
        music.forward();
    }
}
