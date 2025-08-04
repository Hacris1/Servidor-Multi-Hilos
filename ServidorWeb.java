import java.io.*;
import java.net.*;
import java.util.*;

public final class ServidorWeb {
    public static void main(String argv[]) throws Exception {
        int puerto = 6789;

        ServerSocket socketdeEscucha = new ServerSocket(puerto);
        System.out.println("Servidor Web escuchando en el puerto " + puerto);

        while (true) {
            Socket socketdeConexion = socketdeEscucha.accept();

            SolicitudHttp solicitud = new SolicitudHttp(socketdeConexion);

            Thread hilo = new Thread(solicitud);

            // Inicia el hilo.
            hilo.start();
        }
    }
}

final class SolicitudHttp implements Runnable {
    final static String CRLF = "\r\n";
    Socket socket;

    public SolicitudHttp(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            proceseSolicitud();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void proceseSolicitud() throws Exception {
        DataOutputStream os = new DataOutputStream(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String lineaDeSolicitud = br.readLine();
        System.out.println();
        System.out.println(lineaDeSolicitud);

        String lineaDelHeader;
        while ((lineaDelHeader = br.readLine()).length() != 0) {
            System.out.println(lineaDelHeader);
        }

        StringTokenizer partesLinea = new StringTokenizer(lineaDeSolicitud);
        partesLinea.nextToken(); 
        String nombreArchivo = partesLinea.nextToken();

        nombreArchivo = "." + nombreArchivo;

        FileInputStream fis = null;
        boolean existeArchivo = true;

        try {
            fis = new FileInputStream(nombreArchivo);
        } catch (FileNotFoundException e) {
            existeArchivo = false;
        }

        String lineaDeEstado;
        String lineaDeTipoContenido;
        String cuerpoMensaje = null;

        if (existeArchivo) {
            lineaDeEstado = "200 OK" + CRLF;
            lineaDeTipoContenido = "Content-Type: " + contentType(nombreArchivo) + CRLF;
        } else {
            lineaDeEstado = "404 Not Found" + CRLF;
            lineaDeTipoContenido = "Content-Type: text/html" + CRLF;
            cuerpoMensaje = "<HTML>" +
                            "<HEAD><TITLE>404 Not Found</TITLE></HEAD>" +
                            "<BODY><b>404</b> Not Found</BODY></HTML>";
        }

        os.writeBytes(lineaDeEstado);

        os.writeBytes(lineaDeTipoContenido);

        os.writeBytes(CRLF);

        if (existeArchivo) {
            enviarBytes(fis, os);
            fis.close();
        } else {
            os.writeBytes(cuerpoMensaje);
        }

        os.close();
        br.close();
        socket.close();
    }

    private static void enviarBytes(FileInputStream fis, OutputStream os) throws Exception {
        byte[] buffer = new byte[1024];
        int bytes = 0;

        while ((bytes = fis.read(buffer)) != -1) {
            os.write(buffer, 0, bytes);
        }
    }

    private static String contentType(String nombreArchivo) {
        if (nombreArchivo.endsWith(".htm") || nombreArchivo.endsWith(".html")) {
            return "text/html";
        }
        if (nombreArchivo.endsWith(".gif")) {
            return "image/gif";
        }
        if (nombreArchivo.endsWith(".png")) {
            return "image/png";
        }
        if (nombreArchivo.endsWith(".css")) {
            return "text/css";
        }
        if (nombreArchivo.endsWith(".js")) {
            return "application/javascript";
        }
        return "application/octet-stream";
    }
}
