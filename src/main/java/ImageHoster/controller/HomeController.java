package ImageHoster.controller;

import ImageHoster.model.Comment;
import ImageHoster.model.Image;
import ImageHoster.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ImageService imageService;

    @RequestMapping("/")
    public String getAllImages(Model model) {
        List<Image> images = imageService.getAllImages();

        Collections.sort(images, new ImageSorter());

        model.addAttribute("images", images);
        return "index";
    }

    private class ImageSorter implements Comparator<Image> {

        @Override
        public int compare(Image o1, Image o2) {
            if(o1.getDate().before(o2.getDate()))
                return 1;
            else if(o1.getDate().after(o2.getDate()))
                return -1;
            else
                return 0;
        }
    }
}