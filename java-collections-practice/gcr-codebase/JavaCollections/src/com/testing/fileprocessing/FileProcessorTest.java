package com.testing.fileprocessing;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Problem 8: Testing File Handling Methods
 */
public class FileProcessorTest {
    private FileProcessor fileProcessor;
    private static final String TEST_FILE = "test_file.txt";
    
    @BeforeEach
    void setUp() {
        fileProcessor = new FileProcessor();
    }
    
    @AfterEach
    void tearDown() throws IOException {
        // Clean up test file
        if (fileProcessor.fileExists(TEST_FILE)) {
            java.nio.file.Files.delete(java.nio.file.Paths.get(TEST_FILE));
        }
    }
    
    @Test
    void testWriteToFile() throws IOException {
        String content = "Hello, World!";
        fileProcessor.writeToFile(TEST_FILE, content);
        
        assertTrue(fileProcessor.fileExists(TEST_FILE));
    }
    
    @Test
    void testReadFromFile() throws IOException {
        String content = "Test content";
        fileProcessor.writeToFile(TEST_FILE, content);
        
        String readContent = fileProcessor.readFromFile(TEST_FILE);
        assertEquals(content, readContent);
    }
    
    @Test
    void testFileExists() throws IOException {
        assertFalse(fileProcessor.fileExists(TEST_FILE));
        
        fileProcessor.writeToFile(TEST_FILE, "test");
        assertTrue(fileProcessor.fileExists(TEST_FILE));
    }
    
    @Test
    void testReadFromNonExistentFile() {
        assertThrows(IOException.class, () -> {
            fileProcessor.readFromFile("non_existent.txt");
        });
    }
}
