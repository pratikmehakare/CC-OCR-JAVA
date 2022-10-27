/*Pratik Mehakare
 *Pdf Convereter in java
 */
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
public class ReadPdf2 
{
 public static void main(String args[]) throws IOException 
 {
  try
  {
   
   
   PrintWriter csvFile = new PrintWriter("data.csv");// this is the name of csv excel file where the pdf data will store...
   
   PDDocument document = PDDocument.load(new File("file2.pdf"));// here file2.pdf is the name of pdf file which we want to read .
   document.getClass();
   if (!document.isEncrypted())
   {
    PDFTextStripperByArea stripper = new PDFTextStripperByArea();
    stripper.setSortByPosition(true);
    PDFTextStripper Tstripper = new PDFTextStripper();
    String str = Tstripper.getText(document);
    
    Scanner scnLine = null;     
    scnLine = new Scanner(str);// scanner to read lines from pdf file...
    
    
    
    String line="";
    String strDate="";
    String strDay="";
    String strTotalProfit="";
    String strDailyProfit="";
    
    while (scnLine.hasNextLine()) 
    {  
     
     line = scnLine.nextLine();
     
     Scanner scnWord = new Scanner(line); // scanner to read words from lines....
     
     strDate=scnWord.next();
     
     strDay=scnWord.next();
     
     strTotalProfit=scnWord.next();
     
     strDailyProfit=scnWord.next();
     
     csvFile.println(strDailyProfit+","+strDay+","+strTotalProfit+","+strDailyProfit);
     
    } 
   }
   document.close();
   csvFile.close();
  }
  catch (Exception e) 
  {
   e.printStackTrace();
  }
   
 }
}