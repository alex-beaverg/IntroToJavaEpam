package by.epam.bobrikov.stage06.Task03.Server.objects;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Archive {
    private static final String FILENAME = "src/main/java/by/epam/bobrikov/stage06/Task03/Server/database/archive.xml";
    private static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File(FILENAME));
            doc.getDocumentElement().normalize();
            NodeList list = doc.getElementsByTagName("student");
            for (int temp = 0; temp < list.getLength(); temp++) {
                Node node = list.item(temp);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    String surname = element.getElementsByTagName("surname").item(0).getTextContent();
                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    int age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent());
                    int group = Integer.parseInt(element.getElementsByTagName("group").item(0).getTextContent());
                    students.add(new Student(surname, name, age, group));
                }
            }
        }
        catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static String getStudent(String surname) {
        List<Student> students = getStudents();
        for (Student student: students) {
            if (surname.equals(student.getSurname())) {
                return student.toString();
            }
        }
        if (surname.equals("exit")) {
            return "Archive server closed!";
        } else {
            return "Student not found!";
        }
    }

    public static Student getStudentAsObject(String surname) {
        List<Student> students = getStudents();
        for (Student student: students) {
            if (surname.equals(student.getSurname())) {
                return student;
            }
        }
        return null;
    }

    public static void editStudent(Student student, String field, String value) {
        List<Student> students = getStudents();
        for (Student item : students) {
            if (student.getSurname().equals(item.getSurname())) {
                switch (field) {
                    case "surname" -> item.setSurname(value);
                    case "name" -> item.setName(value);
                    case "age" -> item.setAge(Integer.parseInt(value));
                    case "group" -> item.setGroup(Integer.parseInt(value));
                }
                break;
            }
        }
        createXmlFormat(students);
    }

    private static void createXmlFormat(List<Student> students) {
        try (FileOutputStream output = new FileOutputStream(FILENAME)) {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("cases");
            doc.appendChild(rootElement);
            for (Student item : students) {
                Element studentElement = doc.createElement("student");
                rootElement.appendChild(studentElement);

                Element surnameElement = doc.createElement("surname");
                surnameElement.setTextContent(item.getSurname());
                studentElement.appendChild(surnameElement);

                Element nameElement = doc.createElement("name");
                nameElement.setTextContent(item.getName());
                studentElement.appendChild(nameElement);

                Element ageElement = doc.createElement("age");
                ageElement.setTextContent(String.valueOf(item.getAge()));
                studentElement.appendChild(ageElement);

                Element groupElement = doc.createElement("group");
                groupElement.setTextContent(String.valueOf(item.getGroup()));
                studentElement.appendChild(groupElement);
            }
            writeXml(doc, output);
        } catch (ParserConfigurationException | IOException | TransformerException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeXml(Document doc, OutputStream output) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);
        transformer.transform(source, result);
    }

    public static void addStudentToArchive(String surname, String name, int age, int group) {
        List<Student> students = getStudents();
        Student newStudent = new Student(surname, name, age, group);
        students.add(newStudent);
        createXmlFormat(students);
    }
}
