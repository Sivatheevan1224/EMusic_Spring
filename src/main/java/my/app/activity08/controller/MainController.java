package my.app.activity08.controller;

import java.util.List;
import my.app.activity08.dto.LoginDTO;
import my.app.activity08.entity.Album;
import my.app.activity08.entity.User;
import my.app.activity08.service.AlbumService;
import my.app.activity08.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
    private final UserService userService;
    private final AlbumService albumService;
    

    public MainController(UserService userService, AlbumService albumService) {
        this.userService = userService;
        this.albumService = albumService;
    }
    @GetMapping("/")
    public String getHomePage(){
        return "sign-in";
    }
    
    @PostMapping("/login")
    public String performLogin(@ModelAttribute LoginDTO login_dto, Model model,RedirectAttributes reditectAttr){
        User user= userService.processLogin(login_dto);
        if(user!=null){
            reditectAttr.addFlashAttribute("user",user);
            return "redirect:/view-albums";
        }else{ 
            model.addAttribute("errMsg","Incorrect username or password");
            return "sign-in";
        }
    }
    
    @GetMapping("/view-albums")
    public String displayAlbums(Model model ){
        List<Album> albumList = albumService.getAlbums();
        model.addAttribute("albumlist",albumList);
        return "album-list";
    }
    
    @GetMapping("/album-view")
    public String getAlbumById(@RequestParam Integer id, Model model){
        Album album =albumService.getAlbumById(id);
        model.addAttribute("album", album);
        return"album-view";
    }
}
