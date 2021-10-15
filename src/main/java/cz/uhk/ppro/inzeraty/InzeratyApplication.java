package cz.uhk.ppro.inzeraty;

import cz.uhk.ppro.inzeraty.controller.MyController;
import cz.uhk.ppro.inzeraty.model.Inzerat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.math.BigDecimal;
import java.util.List;


@SpringBootApplication
@ComponentScan({"cz.uhk.ppro.inzeraty.controller"})
public class InzeratyApplication implements WebMvcConfigurer {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(InzeratyApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        List<Inzerat> inzeraty = controller.getListInzeratu();

        Inzerat i = new Inzerat();
        i.setText("Prodám novou Škodu fabia v4");
        i.setCena(new BigDecimal(200));
        i.setKategorie("Vozidla");
        controller.pridejInzerat(i);

        Inzerat i2 = new Inzerat();
        i2.setText("Prodám novou Škodu octavia");
        i2.setCena(new BigDecimal(400));
        i2.setKategorie("Vozidla");
        controller.pridejInzerat(i2);
        for (Inzerat inzerat : inzeraty) {
            System.out.println(inzerat.getText());
        }

    }


}
