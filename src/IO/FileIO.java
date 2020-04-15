package IO;

import java.io.FileNotFoundException;
import java.io.*;

public class FileIO {
    private PrintWriter yazici;

    public void fileOpen(){
        try{
            yazici = new PrintWriter("C://RaFiles/deneme.txt");
        }catch (FileNotFoundException e){
            System.err.println("File not found!");
            System.exit(1);
        }
    }

    public void newRecord(){
        Personal persOne = new Personal(6,"Ramazan","Acikgoz",29);
        yazici.println(persOne.getPersID());
        yazici.println(persOne.getName());
        yazici.println(persOne.getSurname());
        yazici.println(persOne.getAge());
    }
    public void fileClose(){
        if(yazici != null){
            yazici.close();
        }
    }
}
