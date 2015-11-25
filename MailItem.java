
/**
 * Write a description of class MailItem here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailItem
{
    // Almacena de quien es el correo
    private String from;
    // Almacena para quien va el correo
    private String to;
    // Almacena que lleva el mensaje
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String fromX, String toX, String messageX)
    {
        from = fromX;
        to = toX;
        message = messageX;
    }

    /**
     * Devuelve el usuario quien ha enviado el mensaje
     */
    public String getFrom()
    {
        return from;
    }
    
    /**
     * Devuelve el usuario para quien iba destinado el mensaje
     */
    public String getTo()
    {
        return to;
    }
    
    /**
     * Devuelve el mensaje que se ha escrito
     */
    public String message()
    {
        return message;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("from: " + from);
        System.out.println("to: " + to);
        System.out.println("message: " + message);
    }
}
