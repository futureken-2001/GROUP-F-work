import org.example.MusicCatalogue;

import javax.swing.*;
import java.awt.*;

public class MusicCatalogueTest {

    public static void main(String[] args) {
        MusicCatalogue musicCatalogue = new MusicCatalogue();

        testNorthText(musicCatalogue);
        testWestlist(musicCatalogue);
        testSubmitButtonFunc(musicCatalogue);
        testCombo(musicCatalogue);

        testCatalogueWindow(musicCatalogue);
        testSubmitButtonAction(musicCatalogue);
    }

    // Unit Tests
    public static void testNorthText(MusicCatalogue musicCatalogue) {
        JLabel label = musicCatalogue.northText();
        System.out.println("Testing northText():");
        System.out.println("Label Text: " + label.getText() + " (Expected: My Music Catalogue)");
        System.out.println("Label Font: " + label.getFont() + " (Expected: Verdana, Bold, Size 26)");
        System.out.println("Label Alignment: " + label.getHorizontalAlignment() + " (Expected: CENTER)");
        System.out.println();
    }

    public static void testWestlist(MusicCatalogue musicCatalogue) {
        JList<String> list = musicCatalogue.westlist();
        System.out.println("Testing westlist():");
        System.out.println("List Size: " + list.getModel().getSize() + " (Expected: 3)");
        System.out.println("List Item 1: " + list.getModel().getElementAt(0) + " (Expected: Rap)");
        System.out.println("List Item 2: " + list.getModel().getElementAt(1) + " (Expected: Raggae)");
        System.out.println("List Item 3: " + list.getModel().getElementAt(2) + " (Expected: Ballads)");
        System.out.println();
    }

    public static void testSubmitButtonFunc(MusicCatalogue musicCatalogue) {
        JButton submitButton = musicCatalogue.submitButtonFunc();
        System.out.println("Testing submitButtonFunc():");
        System.out.println("Button Text: " + submitButton.getText() + " (Expected: SUBMIT)");
        System.out.println("Button Background Color: " + submitButton.getBackground() + " (Expected: [60, 179, 113])");
        System.out.println("Button Foreground Color: " + submitButton.getForeground() + " (Expected: White)");
        System.out.println();
    }

    public static void testCombo(MusicCatalogue musicCatalogue) {
        JComboBox<String> comboBox = musicCatalogue.combo();
        System.out.println("Testing combo():");
        System.out.println("ComboBox Size: " + comboBox.getItemCount() + " (Expected: 3)");
        System.out.println("ComboBox Item 1: " + comboBox.getItemAt(0) + " (Expected: Rap)");
        System.out.println("ComboBox Item 2: " + comboBox.getItemAt(1) + " (Expected: Raggae)");
        System.out.println("ComboBox Item 3: " + comboBox.getItemAt(2) + " (Expected: Ballads)");
        System.out.println();
    }

    // Integration Tests
    public static void testCatalogueWindow(MusicCatalogue musicCatalogue) {
        JFrame frame = musicCatalogue.catalogueWindow();
        System.out.println("Testing catalogueWindow():");
        System.out.println("Frame Title: " + frame.getTitle() + " (Expected: Catalogue)");
        System.out.println("Frame Layout: " + frame.getLayout().getClass().getSimpleName() + " (Expected: BorderLayout)");
        System.out.println("Frame Visibility: " + frame.isVisible() + " (Expected: true)");
        System.out.println();
    }

    public static void testSubmitButtonAction(MusicCatalogue musicCatalogue) {
        JButton submitButton = musicCatalogue.submitButtonFunc();
        JTextField field = musicCatalogue.field();
        JTextField field2 = musicCatalogue.field2();
        JComboBox<String> comboBox = musicCatalogue.combo();
        JCheckBox checkBox = musicCatalogue.check();

        field.setText("Artist Name");
        field2.setText("Studio Name");
        comboBox.setSelectedIndex(1);
        checkBox.setSelected(true);

        System.out.println("Testing submitButtonAction():");
        System.out.println("Simulating button click...");
        submitButton.doClick();

    }
}








