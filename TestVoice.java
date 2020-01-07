import edu.cmu.sphinx.api.*;
import java.util.*;
import java.io.*;


public class TestVoice
{
   private Configuration configuration =	new Configuration();
   private BufferedWriter bw = null;
   private LiveSpeechRecognizer recognizer; 
   
   
   public TestVoice() throws Exception
   {
      
      
      //	Set path	to	acoustic	model.
      configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
      //	Set path	to	dictionary.
      configuration.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
      //	Set language model.
      configuration.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");
      
    /*
      PrintStream p = System.out;
      System.setOut(new PrintStream(
      new OutputStream() {
         public void write(int b) {
               //DO NOTHING
         }
      }));
      //do stuff you don't want to print
      */
      recognizer = new LiveSpeechRecognizer(configuration);
      //System.setOut(p);
   
   
   }
   public String writeSpeech(Game game)
   {
                
         
      //	Start	recognition	process pruning previously	cached data. 
      recognizer.startRecognition(true);
      System.out.println(game);  
      System.out.println("SAY YOUR COLUMN (remember, columns start from 1 through 8):"); 
      SpeechResult result = recognizer.getResult();
      String words = result.getHypothesis();
      //	Pause	recognition	process.	It	can be resumed	then with startRecognition(false).
      recognizer.stopRecognition();     
      return words;

   }
   public String go()
   {
      //	Start	recognition	process pruning previously	cached data.
      recognizer.startRecognition(true);    
      SpeechResult result = recognizer.getResult();
      String words = result.getHypothesis();
      //	Pause	recognition	process.	It	can be resumed	then with startRecognition(false).
      recognizer.stopRecognition();
   
      return words;

   }
}
