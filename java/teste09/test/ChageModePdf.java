package com.pdf.pdfmetods;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.itextpdf.layout.element.Paragraph;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ChageModePdf {
    

    public void ImageToText(String inputPath, String outputPath) throws java.io.IOException{
        File imageFile = new File(inputPath);
        Tesseract tesseract = new Tesseract();
        tesseract.setLanguage("por");
        tesseract.setDatapath("demo\\src\\main\\resources\\tessdata");

        File newText = new File(outputPath+"texto_01.txt");
        FileWriter fileWriter = new FileWriter(newText);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        

        try{
           String text =  tesseract.doOCR(imageFile);
           bufferedWriter.write(text);
           bufferedWriter.close();
           
           System.out.println(text);
        }catch(TesseractException e){
            e.printStackTrace();
        }



    }
}
