package ueb10;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class SaveImageFromURL {

    public static void main(String[] args) throws IOException {
	String seite = "<body id=\"www‐wikipedia‐org\">"
		+ "<div class=\"central‐textlogo\">"
		+ "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb/b/bb/Wikipedia_wordmark.svg/500px-Wikipedia_wordmark.svg.png\""
		+ "</div>"
		+ "</body>";
	String bildURL = "";
		
	int startIndex = seite.indexOf("<img src=\""); 
		
	if (startIndex != -1) { //-1 -> nicht gefunden
	    startIndex = startIndex + "<img src=\"".length();
	    int endIndex = seite.indexOf('\"', startIndex);
	    bildURL = seite.substring(startIndex, endIndex);
	}
	String downloadUrl = bildURL;
	URL url = new URL(downloadUrl);
	BufferedImage image = ImageIO.read(url);
	ImageIO.write(image, "png", new File("bild.png"));
    }
}