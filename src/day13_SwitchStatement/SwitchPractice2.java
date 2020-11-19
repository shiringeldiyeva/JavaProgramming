package day13_SwitchStatement;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class SwitchPractice2 {
    public static void main(String[] args) {
        String browser = "Chrome";
        String selectedBrowser = "";
        switch (browser){ // chrome
            case "chrome": selectedBrowser = "CHROME BROWSER";
             break;
            case "firefox": selectedBrowser = "FIREFOX BROWSER";
                break;
            case "opera": selectedBrowser = "OPERA BROWSER";
            break;
            case"safari": selectedBrowser = "SAFARI BROWSER";
            break;
            case"edge" : selectedBrowser = "EDGE BROWSER";
            break;
            case"ie": selectedBrowser = "INTERNET EXPLORE BROWSER";
            break;
            default:selectedBrowser= "INVALID BROWSERS NAME";
                System.out.println(selectedBrowser);



        }
    }
}
