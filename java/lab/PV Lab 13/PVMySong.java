/** File: Week13/Lab13Sol/Song0/PVMySong.java @PV Pho Vu
Choose a song that is a *.wav file and hear it
- You need to have StdDraw.java and StdAudio.java in the same folder
- Your choice: file.wav
- Try out all the files in a folder
 In IntelliJ: say File/OPEN and click on folder Song0
 If it asks, set the Java environment again
 */
public class PVMySong { // start PVMySong class
	public static void main(String[] args) { // start main
		int x = 500; // set size for canvas w/ variable x; x = 500
		int y = 500; // set size for canvas w/ variable y; y = 500
		StdDraw.setCanvasSize(x, y);//change coordinate system 500 x 500
		StdDraw.setScale(0, 320); // set scale for canvas
		String filename = "BEGIN.wav"; // set string variable filename for audio file
		StdDraw.setPenColor(StdDraw.RED); // set color for first line of text
		StdDraw.text(150,180,"Let's listen to..."); // 1st line
		StdDraw.setPenColor(StdDraw.BLUE); // set color for second line of text
		StdDraw.text(150,150,"Pho Vu's favorite song:  " + filename); // 2nd line
		StdAudio.play(filename); // play the audio
	} // end main
} // end class