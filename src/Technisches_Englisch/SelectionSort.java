package Technisches_Englisch;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {
    public static void selectionSort(List<String> artists, List<Integer> listeners) {
        int n = listeners.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (listeners.get(j) > listeners.get(maxIndex)) {
                    maxIndex = j;
                }
            }

            // Swap elements at maxIndex and i
            int tempListener = listeners.get(maxIndex);
            String tempArtist = artists.get(maxIndex);
            listeners.set(maxIndex, listeners.get(i));
            artists.set(maxIndex, artists.get(i));
            listeners.set(i, tempListener);
            artists.set(i, tempArtist);
        }
    }

    public static void main(String[] args) {
        List<String> artists = new ArrayList<>();
        List<Integer> listeners = new ArrayList<>();

        // Add artists and their number of listeners to the lists
        artists.add("Drake"); listeners.add(80);
        artists.add("Justin Bieber"); listeners.add(76);
        artists.add("The Weeknd"); listeners.add(113);
        artists.add("Ariana Grande"); listeners.add(90);
        artists.add("Kanye West"); listeners.add(75);
        artists.add("Dua Lipa"); listeners.add(76);
        artists.add("Beyonce"); listeners.add(78);
        artists.add("Coldplay"); listeners.add(74);
        artists.add("Taylor Swift"); listeners.add(104);
        artists.add("Rihanna"); listeners.add(85);



        // Sort the artists based on their number of listeners
        selectionSort(artists, listeners);

        // Display the sorted list
        System.out.println("Top 10 artists based on number of listeners:");
        for (int i = 0; i < artists.size(); i++) {
            System.out.println((i + 1) + ". " + artists.get(i) + ", " + listeners.get(i) + " million listeners");
        }
    }
}

