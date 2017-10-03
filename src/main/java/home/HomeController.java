package home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "stars";
    }

    @ResponseBody
    @RequestMapping("/files")
    public List<String> files(){
        List<String> returnList = new ArrayList<>();

        File folder = new File("C:\\");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                returnList.add(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                returnList.add(listOfFiles[i].getName());
            }
        }

        return returnList;
    }

}
