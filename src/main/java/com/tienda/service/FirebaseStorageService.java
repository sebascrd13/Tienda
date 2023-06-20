package com.tienda.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    public     
    String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "techshop-18ebb.appspot.com";
    
    //Esta es la ruta básica de este proyecto TechShop
    final String rutaSuperiorStorage = "techshop";
    
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "techshop-18ebb-firebase-adminsdk-5a4s0-de471bc4ce";
    
}
