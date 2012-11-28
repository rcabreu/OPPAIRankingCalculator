import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;

public class XMLContestReader {
	
	public static Contest parseContestFile(String path) throws Exception {
		File file = new File(path);
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(file);
		doc.getDocumentElement().normalize();
		
		String contestName = doc.getDocumentElement().
		                    getElementsByTagName("Name").
		                    item(0).getNodeValue();
        
        NodeList nList = doc.getElementsByTagName("Contestant");
        Contest contest = new Contest();
        contest.setName(contestName);
        Contestant c;
        for (int i = 0; i < nList.getLength(); ++i) {
			Node nNode = nList.item(i);
			if (nNode.getNodeType() != Node.ELEMENT_NODE) continue;
			
			Element elem = (Element) nNode;
			c = new Contestant();
			c.setName(getTagValue("name", elem));
			c.setID(Integer.parseInt(getTagValue("ID", elem)));
			c.setPreviousRanking(Integer.parseInt(getTagValue("previous", elem)));
			c.setCurrentPosition(Integer.parseInt(getTagValue("position", elem)));
			contest.addContestant(c);
		}
		return contest;
	}
	
	private static String getTagValue(String tag, Element elem) {
		NodeList nList = elem.getElementsByTagName(tag).item(0).getChildNodes();
		Node nValue = (Node) nList.item(0);
		return nValue.getNodeValue();
	}
    
    
}
