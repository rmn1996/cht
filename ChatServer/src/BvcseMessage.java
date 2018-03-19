
public class BvcseMessage
{
    public String messageFor;
    public String messageFrom;
    public String text;

    public BvcseMessage(String whoFor, String whoFrom, String info)
    {
	messageFor = whoFor;
	messageFrom = whoFrom;
	text = info;
    }
}

