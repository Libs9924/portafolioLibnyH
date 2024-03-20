
package com.tienda.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "techshop-14c36.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "C:\\Projects\\PortafolioLibnyH";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "C:\\Projects\\PortafolioLibnyH\\Tienda_LibnyHernandezBarreda\\src\\main\\resources\\firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-14c36-firebase-adminsdk-akgjy-7df468243c.json";
}//final de la interfaz
