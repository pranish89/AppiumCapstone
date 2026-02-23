import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class Runner {

	public static void main(String args[])
	{
		String classlist = System.getenv("TEST_CLASSES");
		
		if(classlist==null) {
			System.err.println("Missing Parameters");
			return;
		}
		
		XmlSuite suite = new XmlSuite();
		suite.setName("DynamicSuite");
		
		XmlTest test = new XmlTest(suite);
		test.setName("DynamicTestRun");
		
		List<XmlClass> classes = new ArrayList<>();
		for(String classname: classlist.split(","))
		{
			try {
				classes.add(new XmlClass(classname.trim()));
			} catch(Exception e) {
				System.err.println("Class not found");
				return;
			}
		}
		
		test.setXmlClasses(classes);
		
	    TestNG testng = new TestNG();
	    testng.setXmlSuites(Collections.singletonList(suite));
	    testng.run();
		
	}
}
