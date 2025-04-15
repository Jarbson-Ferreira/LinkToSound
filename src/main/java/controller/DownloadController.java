package controller;

import dto.DownloadRequest;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.DownloadService;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class DownloadController {

    @PostMapping("/download")
    public ResponseEntity<?> download(@RequestBody DownloadRequest request) {
        String message = DownloadService.downloadAudio(request.getUrl());

        if (message.equals("url is invalid") || message.equals("Error when processing the URL.")) {
            return ResponseEntity.badRequest().body(Map.of("status", "error", "message", message));
        }

        return ResponseEntity.ok(Map.of("status", "success", "fileName", message));
    }

    @GetMapping("/file")
    public ResponseEntity<InputStreamResource> getFile(@RequestParam String fileName) throws IOException {
        File file = new File("src/main/java/com/example/LinkToSound/controller/downloaded-audios/" + fileName);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + file.getName()).contentLength(file.length()).contentType(MediaType.APPLICATION_OCTET_STREAM).body(resource);
    }

}
