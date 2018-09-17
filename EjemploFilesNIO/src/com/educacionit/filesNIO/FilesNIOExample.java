/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.educacionit.filesNIO;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author Rodolfo Durante
 */
public class FilesNIOExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Verificamos si el archivo existe");
        FilesExists();
        System.out.println("Creamos un directorio");
        createDirectory();
        System.out.println("Hacemos una copia del archivo");
        copyFile();
        System.out.println("movemos la copia del archivo");
        moveFile();
        System.out.println("borramos el archivo original");
        deleteFile();
    }

    public static void createDirectory() {
        Path path = Paths.get("data");
        try {
            Path newDir = Files.createDirectory(path);
        } catch (FileAlreadyExistsException e) {
            // El directorio ya existe.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile() {
        Path sourcePath = Paths.get("logging.properties");
        Path destinationPath = Paths.get("logging-copy.properties");

        try {
            Files.copy(sourcePath, destinationPath);
            // Si quisieramos sobreescribir el archivo existente en caso de que exista:
            // Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (FileAlreadyExistsException e) {
            //El archivo de destino ya existe
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFile() {
        Path sourcePath = Paths.get("logging-copy.properties");
        Path destinationPath = Paths.get("data/logging-moved.properties");
        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteFile() {
        Path path = Paths.get("logging.properties");
        try {
            Files.delete(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void FilesExists() {
        /*
         El metodo Files.exists() verifica si un Path dado existe en el File System.
         */
        Path path = Paths.get("logging.properties");
        boolean pathExists = Files.exists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
        /*
         LinkOption.NOFOLLOW_LINK   S => el metodo Files.exists() no debe seguir links simbolicos 
         en el file system para determinar si el archivo existe.
         */
        if (pathExists) {
            System.out.println("El archivo existe");
        } else {
            System.out.println("El archivo no existe");
        }

    }

}
