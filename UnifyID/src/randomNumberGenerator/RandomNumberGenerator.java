package randomNumberGenerator;

/**
 * 
 */

/**
 * @author Prachi Chachondia
 * Comments: Function to read a stream of random numbers from Random.org
 * and use them to generate a RGB image by setting different start values
 * for the Red, Blue, Green components.
 * This approach requests the smallest possible set of random numbers that
 * can generate a different and interesting pattern on each run.
 */

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.imageio.ImageIO;


public class RandomNumberGenerator {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int imgH = 128, imgW = 128;
		String is;
		BufferedImage image = new BufferedImage(imgH, imgW, BufferedImage.TYPE_INT_ARGB);

		URL url = new URL("https://www.random.org/integers/?num=255&min=0&max=255&col=1&base=10&format=plain&rnd=new");
		HttpURLConnection http = (HttpURLConnection)url.openConnection();
		http.setRequestMethod("GET");
		BufferedReader bread = new BufferedReader(new InputStreamReader(http.getInputStream()));
		ArrayList<Integer> randnumlist = new ArrayList<>();
		while ((is = bread.readLine()) != null) {
			randnumlist.add(Integer.parseInt(is));
		}
//		int count = randnumlist.size();
//		System.out.println("Count: " + count);
//		bread.close();
//		int red = 0, green = 0, blue = 0;
//		count = 0;
		Color colorobj; // = new Color(red, green, blue);
//		red = randnumlist.get(count);
//		count++;
//		green = randnumlist.get(count); 
//		count++;
//		blue = randnumlist.get(count);
		Random r = new Random();
		int red =0;
		int green = 0;
		int blue = 0;
		for(int i = 0; i < imgH; i++){
			for(int j = 0; j < imgW; j++){
				
				red = randnumlist.get(r.nextInt(randnumlist.size()));
				green = randnumlist.get(r.nextInt(randnumlist.size()));
				blue = randnumlist.get(r.nextInt(randnumlist.size()));
				colorobj = new Color(red, green, blue);
				image.setRGB(i, j, colorobj.getRGB());
			}
		}
		
		File file = null;
		try{
			file = new File("/Users/pranjali/Desktop/Training/Programs/UnifyID/RGBImage.png");
	        ImageIO.write(image, "png", file);
	      }catch(IOException e){
	        System.out.println("Error: " + e);
	      }
	}

}
