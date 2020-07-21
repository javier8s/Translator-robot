package com.meta4.translationsrobot;

import com.meta4.translationsrobot.ddbb.functional.repositories.FunFieldCRepository;
import com.meta4.translationsrobot.ddbb.functional.repositories.FunWebLiteralsRepository;
import com.meta4.translationsrobot.ddbb.functional.services.FunFieldDService;
import com.meta4.translationsrobot.ddbb.translators.entities.webLiterals.M4RtrMliterals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;

@SpringBootApplication
public class TranslationsRobot implements CommandLineRunner {
    @Autowired
    private LauncherTranslationsRobot launcherTranslationsRobot;
    @Autowired
    private FunFieldDService funFieldDService;

    private String path,name,tab;
    public static void main(String[] args) {
        SpringApplication. run(TranslationsRobot.class, args);
    }
    @Autowired
    private FunWebLiteralsRepository funWebLiteralsRepository;
    @Override
    public void run(String... args) throws Exception {

        /*funWebLiteralsRepository.findByIdTypeAndPathInfoAndBaseNameAndIdLiteralAndIdOrganization(
                BigInteger.valueOf(2),"/translations/","meta4.widget","_april","_M4R"
        );*/
        path="\\Users\\javiersg\\Desktop\\Parche\\";
        name="01_sSAAS_19U1_0001.mdb";
        tab="M4RDL_PACK_CMDS";
        System.out.println("¿Es esta tu configuración?");
        System.out.println("Path "+path);
        System.out.println("Name "+name);
        System.out.println("Table "+tab);
        launcherTranslationsRobot.execute(path,name,tab);
    }
}
