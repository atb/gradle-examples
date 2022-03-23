package com.example

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Input

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class CheckWebsite extends DefaultTask {

    @Input
    String url = 'http://www.google.com'

    @TaskAction
    void checkWebsite() {
            // check the given website by using the url
        try {
            Document doc = Jsoup.connect(url).get();
            String title = doc.title();
            println title
            println url
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
