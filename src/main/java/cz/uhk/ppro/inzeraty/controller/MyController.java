package cz.uhk.ppro.inzeraty.controller;



import cz.uhk.ppro.inzeraty.model.Inzerat;
import cz.uhk.ppro.inzeraty.sluzby.PametoveUlozisteInzeratu;
import cz.uhk.ppro.inzeraty.sluzby.UlozisteInzeratu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MyController {


    private UlozisteInzeratu ulozisteInzeratu = new PametoveUlozisteInzeratu();

    public List<Inzerat> getListInzeratu(){
        return ulozisteInzeratu.getInzeraty();
    }

    public void pridejInzerat(Inzerat i){
        ulozisteInzeratu.pridej(i);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/nakup", method = RequestMethod.GET)
    public ModelAndView nakup(){
            ModelAndView model = new ModelAndView("nakup");
            model.addObject("inzeraty", ulozisteInzeratu.getInzeraty());
            Map<Integer, Inzerat> mk = new HashMap<Integer, Inzerat>();
            if(ulozisteInzeratu!=null){
                for (Inzerat i : ulozisteInzeratu.getInzeraty()){
                    mk.put(i.getId(), i);
                }
            }
            model.addObject("mapaInzeratu", mk);
            System.out.println(model);
            return model;

    }
    @RequestMapping(value = "/prodej", method = RequestMethod.GET)
    public String prodej(){
        return "prodej";
    }

}
