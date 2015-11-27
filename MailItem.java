
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
    private String asunto;
    // Almacena el cuerpo del mensaje
    private String message;

    /**
     * Constructor for objects of class MailItem
     */
    public MailItem(String de, String para, String asunto, String mensaje)
    {
        from = de;
        to = para;
        this.asunto = asunto;
        message = mensaje;
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
    public String getAsunto()
    {
        return asunto;
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
        System.out.println("Asunto: " + asunto);
        System.out.println("Mensaje: " + message);
    }
}
