/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinewordsearcher.bll.util;

import java.util.ArrayList;
import java.util.List;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author pgn
 */
public class HtmlToString
{

    public static final String PARAGRAPH = "P";
    public static final String LINK = "A";

    /**
     * Extracts the text of all paragraphs in the given document.
     *
     * @param doc The document containing the text.
     * @return A List of the text of all paragraphs.
     * @throws TransformerConfigurationException
     * @throws TransformerException
     */
    public static List<String> extractParagraphs(Document doc) throws TransformerConfigurationException, TransformerException
    {
        List<String> allStrings = new ArrayList<>();
        NodeList nodeParagraphs = doc.getElementsByTagName(PARAGRAPH);
        for (int i = 0; i < nodeParagraphs.getLength(); i++)
        {
            Node p = nodeParagraphs.item(i);
            String txtP = p.getTextContent();
            if (!txtP.trim().isEmpty())
            {
                allStrings.add(txtP.trim());
            }
        }
        return allStrings;
    }
    
    

}
