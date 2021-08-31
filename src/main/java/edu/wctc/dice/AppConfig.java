package edu.wctc.dice;

import edu.wctc.dice.iface.DiceRoller;
import edu.wctc.dice.iface.GameInput;
import edu.wctc.dice.iface.GameOutput;
import edu.wctc.dice.impl.PopupInput;
import edu.wctc.dice.impl.PopupOutput;
import edu.wctc.dice.impl.rollDodecahedron;
import edu.wctc.dice.impl.rollIcosahedron;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("edu.wctc.dice")
public class AppConfig {
    @Bean
    public GameOutput gameOutput() {
//        return new ConsoleOutput();
        return new PopupOutput();
    }

    @Bean
    public GameInput gameInput() {
//        return new ConsoleInput();
        return new PopupInput();
    }

    //Two beans
    //Two @Component classes that implement the interface
    @Bean(name="d12")
    public DiceRoller dieRoller1(){
        return new rollDodecahedron();
    }

    @Bean(name="d20")
    public DiceRoller dieRoller2(){
        return new rollIcosahedron();
    }


    //Modified configuration
    //Configuration class selects the appropriate DieRoller bean at startup
}
