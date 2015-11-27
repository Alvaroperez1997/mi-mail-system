
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
    // Almacena el asunto del mensaje
    private String subject;
    // Almacena el cuerpo del mensaje
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String from, String to, String subject, String message)
    {
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
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
     * Devuelve el asunto del mensaje
     */
    public String getSubject()
    {
        return subject;
    }
    
    /**
     * Devuelve el mensaje que se ha escrito
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.println("De: " + from);
        System.out.println("Para: " + to);
        System.out.println("Asunto: " + subject);
        System.out.println("Mensaje: " + message);
    }
}
