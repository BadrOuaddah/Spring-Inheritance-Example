package com.example.parent.types.single_table.controller;

import com.example.parent.types.single_table.entity.Father;
import com.example.parent.types.single_table.repository.FatherRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/fathers_single_table")
@Slf4j
public class ParentSTController {
    private final FatherRepository fatherRepository;

    public ParentSTController(FatherRepository fatherRepository) {
        this.fatherRepository = fatherRepository;
    }

    @GetMapping
    public List<Father> getAllFather() {
        return fatherRepository.findAll();
    }

    @GetMapping(path = "/{fatherId}")
    public ResponseEntity<Father> findFatherById(@PathVariable Long fatherId) {
        Optional<Father> fatherOptional = fatherRepository.findById(fatherId);
        return fatherOptional
                .map(father -> ResponseEntity.ok().body(father))
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<DocumentDto> addNewDocument(@Nullable @RequestParam(value = "document", required = false) String documentDto, @Nullable @RequestParam(value = "file", required = false) MultipartFile file) throws Exception {
        if (documentDto == null) {
            log.warn("Document information is not complete or not found!");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if (file == null) {
            log.warn("File didn't uploaded or not found!");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        log.info("New document added");
        return new ResponseEntity<>(documentService.addDocument(objectMapper.readValue(documentDto, DocumentDto.class), file), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/{documentId}")
    public ResponseEntity<Void> deleteDocument(@PathVariable("documentId") UUID documentId) {
        try {
            documentService.deleteDocument(documentId);
            log.info("The document with id: " + documentId + " has been deleted");
            return ResponseEntity.noContent().build();
        } catch (NoSuchElementException e) {
            log.warn("The document with id: " + documentId + " not found");
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            log.error("An unexpected error occurred while deleting the document with id: " + documentId, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @PutMapping(path = "/{documentId}")
    public ResponseEntity<DocumentDto> updateDocument(@PathVariable UUID documentId, @RequestBody DocumentDto documentDto) throws Exception {
        log.info("Document with id : " + documentId + " has been updated");
        return new ResponseEntity<>(documentService.updateDocument(documentId, documentDto), HttpStatus.OK);
    }
}
