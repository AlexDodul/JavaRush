package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;


public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes p) {
            ImageReader reader;
            if (p == (ImageTypes.JPG)){
                JpgReader jpgReader = new JpgReader();
                reader = jpgReader;
            }
            else if (p == ImageTypes.BMP) {
                BmpReader bmpReader = new BmpReader();
                reader = bmpReader;
            }
            else if (p == ImageTypes.PNG) {
                PngReader pngReader = new PngReader();
                reader = pngReader;
            }
            else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
            return reader;
    }
}