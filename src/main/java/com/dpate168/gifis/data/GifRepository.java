package com.dpate168.gifis.data;

import com.dpate168.gifis.model.Gif;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", LocalDate.of(2015,2,13), "Nicky", false, 3),
            new Gif("ben-and-mike", LocalDate.of(2015,10,30), "Diparth", true,2),
            new Gif("book-dominos", LocalDate.of(2015,9,15), "Dhruv", false, 3),
            new Gif("compiler-bot", LocalDate.of(2015,2,13), "Rocky", true, 1),
            new Gif("cowboy-coder", LocalDate.of(2015,2,13), "Nicks", false, 2),
            new Gif("infinite-andrew", LocalDate.of(2015,8,23), "Hima", true, 2)
    );

    public Gif findGifByName(String name) {
        for (Gif gif: ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> findGifByCategoryId(int id) {
        List<Gif> gifs = new ArrayList<Gif>();
        for (Gif gif: ALL_GIFS) {
            if (gif.getCategoryId() == id) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> allFavoriteGifs() {
        List<Gif> gifs = new ArrayList<Gif>();
        for (Gif gif: ALL_GIFS) {
            if (gif.isFavorite()) {
                gifs.add(gif);
            }
        }
        return gifs;
    }

    public List<Gif> getAllGifs() {

        return ALL_GIFS;
    }
}
