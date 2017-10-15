package shell;

import java.io.InputStream;

/**
 *
 * @author Haris
 */
 
public class ShellThread extends Thread {

    public ShellThread() {
    }
    
	
    private String command;

    @Override
    public void run() {
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            InputStream s = p.getInputStream();
            int b = s.read();
            while (b != -1) {
                System.out.print((char)b);
                b = s.read();
            }
            System.out.println();
            Shell.latch.countDown();
        } catch (Exception e) {
            System.out.println("ERROR: Command not found: " + command);
            Shell.latch.countDown();
        }

    }
    void setCommand(String string) {
        command = string;
    }
    
}
