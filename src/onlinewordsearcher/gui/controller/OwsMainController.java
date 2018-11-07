/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinewordsearcher.gui.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.web.WebView;
import javax.xml.transform.TransformerException;
import onlinewordsearcher.bll.util.HtmlToString;
import org.w3c.dom.Document;

/**
 *
 * @author pgn
 */
public class OwsMainController implements Initializable
{

    /**
     * The TextField containing the URL of the targeted website.
     */
    @FXML
    private TextField txtUrl;

    /**
     * The TextField containing the query word.
     */
    @FXML
    private TextField txtSearch;

    /**
     * The list of search results.
     */
    @FXML
    private ListView<?> lstResults;

    /**
     * The WebView displaying the targeted URL.
     */
    @FXML
    private WebView webview;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        webview.getEngine().javaScriptEnabledProperty().setValue(Boolean.FALSE);
        webview.getEngine().load("https://www.version2.dk/");
        
    }

    @FXML
    public void handleSearch(ActionEvent event) throws TransformerException
    {
        Document doc = webview.getEngine().getDocument();
        List<String> texts = HtmlToString.extractParagraphs(doc);
        for (String text : texts)
        {
            System.out.println(text);
        }
    }

}