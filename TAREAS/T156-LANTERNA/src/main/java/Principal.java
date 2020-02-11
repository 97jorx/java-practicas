import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

/**
 * FECHA  : 11/03/2019
 * NOMBRE : JORGE
 * HORA   : 13:51
 */
public class Principal {

    public static void main(String[] args) throws IOException {

        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);

        TextGraphics tg = screen.newTextGraphics();
        screen.startScreen();

        tg.putString(10,10,"Hello World");

        screen.refresh();
        screen.readInput();
        screen.stopScreen();

    }

}
