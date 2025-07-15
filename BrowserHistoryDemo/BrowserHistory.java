package BrowserHistoryDemo;
import java.util.LinkedList;
import java.util.ListIterator;

class BrowserHistory {
    private LinkedList<String> history = new LinkedList<>();
    private ListIterator<String> iterator;
    private String currentPage = null;

    public void visit(String url) {
        if (iterator != null && iterator.hasNext()) {
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
        }
        history.add(url);
        iterator = history.listIterator(history.size());
        currentPage = url;
        System.out.println("Visited: " + url);
    }

    public void back() {
        if (iterator != null && iterator.hasPrevious()) {
            currentPage = iterator.previous();
            System.out.println("Back to: " + currentPage);
        } else {
            System.out.println("No previous page.");
        }
    }

    public void forward() {
        if (iterator != null && iterator.hasNext()) {
            currentPage = iterator.next();
            System.out.println("Forward to: " + currentPage);
        } else {
            System.out.println("No forward page.");
        }
    }

    public void current() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No page visited yet.");
        }
    }
}

class MusicPlayerHistory extends BrowserHistory {
    public void playSong(String songName) {
        visit(songName);
        System.out.println("Now playing: " + songName);
    }
}
