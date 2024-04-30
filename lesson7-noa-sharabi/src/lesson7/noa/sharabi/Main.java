package lesson7.noa.sharabi;

import java.io.*;

public class Main {
    public static void writeToFile(String path,String content){
        try (DataOutputStream dataOutputStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)));){
            dataOutputStream.writeChars(content);

        }
        catch (FileNotFoundException o){
            System.out.println("on write: "+o.getMessage());
        } catch (IOException e) {
            System.out.println("on write: "+e.getMessage());
        }
    }
    public static String readFromFile(String path){
        StringBuilder str=new StringBuilder();

        try(DataInputStream dataInputStream=new DataInputStream(new BufferedInputStream(new FileInputStream(path)));){
            while(true){
                char x=dataInputStream.readChar();
                str.append(x);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("on read: "+e.getMessage());
        } catch (IOException e) {
            System.out.println(1);
            System.out.println("on read: " + e.getMessage());
        }
        finally {
            return str.toString();
        }
    }
    public static void copyFile(String dirFile,String filePath){

    }

    public static void main(String[] args) {
        writeToFile("C: \\file.txt","hello");
        readFromFile("C: \\file.txt");
        copyFile("C:\\new.txt","C: \\file.txt");
    }
}
