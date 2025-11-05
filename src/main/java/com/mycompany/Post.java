/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author 
 */
public class Post {
   public static void main(String[] args) {

        // 1. URL de conexión - ¡Cuidado con la IP!
        // El formato es: jdbc:postgresql://<HOST>:<PUERTO>/<NOMBRE_BD>
        String url = "jdbc:postgresql://172.27.30.15:5432/postgres"; 
        
        // 2. Credenciales
        String usuario = "postgres"; 
        // ¡REEMPLAZA ESTO con la contraseña real que usaste en pgAdmin!
        String contrasena = "MOON0906"; 
        
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("✅ Conexión establecida con éxito a la BD: siul");
            
            if (conexion != null) {
                conexion.close();
            }

        } catch (SQLException e) {
            System.err.println("❌ Error al conectar a la base de datos.");
            System.err.println("Mensaje de error: " + e.getMessage());
        }
    }
}
