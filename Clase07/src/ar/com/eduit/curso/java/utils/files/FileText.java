package ar.com.eduit.curso.java.utils.files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
public class FileText implements I_File{
    private File file;
    public FileText(File file) {
        this.file = file;
    }
    public FileText(String file){
        this.file = new File(file);
    }
    @Override
    public void print() {
        // a partir de java 7 existe try whith resource
        int car;
        try(FileReader in=new FileReader(file);){
            while((car=in.read())!=-1) System.out.print((char)car);
        } catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        } catch(IOException e){
            System.out.println("Problemas al leer el archivo.");
        } catch (Exception e) {
            System.out.println("Ocurrio un error no esperado");
            System.out.println(e);
        }
        System.out.println();
    }
    @Override
    public String getText() {
        int car;
        StringBuilder sb=new StringBuilder();
        try(FileReader in=new FileReader(file)){
            while((car=in.read())!=-1) sb.append((char)car);
        }catch(Exception e){ System.out.println(e); }
        return sb.toString();
    }
    @Override
    public void setText(String text) {
        try(FileWriter out=new FileWriter(file)){
            out.write(text);
        }catch(Exception e){ System.out.println(e); }
    }
    @Override
    public void appendText(String text) {
        try(FileWriter out=new FileWriter(file,true)){
            out.write(text);
        }catch(Exception e){ System.out.println(e); }
    }
    @Override
    public void addLine(String line) {
        //appendText(line+"\n");
        try(BufferedWriter out=new BufferedWriter(new FileWriter(file,true))){
            out.write(line);
            out.newLine();
        }catch(Exception e){ System.out.println(e);}
    }
    @Override
    public void addLines(Collection<String> lines){
        try(BufferedWriter out=new BufferedWriter(new FileWriter(file,true))){
            for(String st:lines){
                out.write(st);
                out.newLine();
            }
        }catch(Exception e){ System.out.println(e);}
    }
    @Override
    public List<String> getLines() {
        List<String> lista=new ArrayList();
        try(BufferedReader in=new BufferedReader(new FileReader(file))){
            in.lines().forEach(lista::add);
        }catch(Exception e){ System.out.println(e); }
        return lista;
    }

    @Override
    public Set<String> getLinkedHashSetLines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Set<String> getTreeSetLines() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(String line) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
