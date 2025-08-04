# Servidor-Multi-Hilos

# Servidor Web Multihilo en Java

Este proyecto implementa un **servidor HTTP multihilo básico en Java**, capaz de servir archivos HTML e imágenes desde el sistema de archivos local. Cada solicitud entrante se maneja en un hilo independiente, lo que permite la atención simultánea a múltiples clientes.

## Características

- Manejo de múltiples conexiones simultáneas mediante hilos (`Thread`).
- Soporte básico para archivos HTML, imágenes (.jpg, .png, .gif), CSS y JS.
- Retorno de respuestas HTTP 200 OK y 404 Not Found.
- Lectura de encabezados HTTP entrantes desde el cliente.
- Compatible con navegadores como Chrome y Brave.

## Estructura

- `ServidorWeb.java`: Código fuente principal. Define la lógica del servidor y el manejo de solicitudes.
- `miarchivo.html`: Archivo HTML de prueba que puede ser servido desde el servidor.
- `imagen.jpg`: Imagen referenciada dentro del archivo HTML.

## Cómo ejecutar

1. **Compilar el servidor:** javac ServidorWeb.java
2. **Ejecutar el servidor:** java ServidorWeb
3. **Acceder desde el navegador:** http://127.0.0.1:6789/miarchivo.html


## Ejemplo de salida

GET /miarchivo.html HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: none
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /imagen.jpg HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
sec-ch-ua-platform: "Windows"
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: image
Referer: http://127.0.0.1:6789/miarchivo.html
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /favicon.ico HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
sec-ch-ua-platform: "Windows"
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: image
Referer: http://127.0.0.1:6789/miarchivo.html
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /marchivo.html HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: none
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /miarchivo.html HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: none
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /imagen.jpg HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
sec-ch-ua-platform: "Windows"
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: image
Referer: http://127.0.0.1:6789/miarchivo.html
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /.well-known/appspecific/com.chrome.devtools.json HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: empty
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
Accept-Encoding: gzip, deflate, br, zstd
Accept-Language: es-419,es;q=0.9,en;q=0.8
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /miarchivo.html HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
Cache-Control: max-age=0
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
sec-ch-ua-platform: "Windows"
Upgrade-Insecure-Requests: 1
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
Accept: text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: none
Sec-Fetch-Mode: navigate
Sec-Fetch-User: ?1
Sec-Fetch-Dest: document
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /imagen.jpg HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
sec-ch-ua-platform: "Windows"
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
sec-ch-ua: "Not)A;Brand";v="8", "Chromium";v="138", "Brave";v="138"
sec-ch-ua-mobile: ?0
Accept: image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8
Sec-GPC: 1
Accept-Language: es-419,es;q=0.5
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: image
Referer: http://127.0.0.1:6789/miarchivo.html
Accept-Encoding: gzip, deflate, br, zstd
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v

GET /.well-known/appspecific/com.chrome.devtools.json HTTP/1.1
Host: 127.0.0.1:6789
Connection: keep-alive
Sec-Fetch-Site: same-origin
Sec-Fetch-Mode: no-cors
Sec-Fetch-Dest: empty
User-Agent: Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/138.0.0.0 Safari/537.36
Accept-Encoding: gzip, deflate, br, zstd
Accept-Language: es-419,es;q=0.9,en;q=0.8
Cookie: csrftoken=QQSSCUsBwKRUEo5XseO1162wArATix1v
