package com.dpate168.gifis.controller;

import com.dpate168.gifis.data.GifRepository;
import com.dpate168.gifis.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {
    @Autowired
    private GifRepository gifRepository;

    @RequestMapping(value = "/")
    public String listGifs(ModelMap modelMap) {
        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs",allGifs);
        return "home";
    }

    @RequestMapping("/gif/{name}")
    public String gifDetails(ModelMap modelMap, @PathVariable String name) {
        Gif gif = gifRepository.findGifByName(name);
        modelMap.put("gif",gif);
        return "gif-details";
    }

    @RequestMapping("/favorites")
    public String gifFavorites(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.allFavoriteGifs();
        modelMap.put("gifs", gifs);
        return "favorites";
    }

}
