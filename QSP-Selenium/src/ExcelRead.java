import java.io.FileInputStream;

import org.apache.poi.poifs.crypt.agile.EncryptionDocument;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {

	public static void main(String[] args) throws EncryptionDocumentException, FileNotfound, {
    String path = "./data/Book.xlsx";
    
    Workbook w1 = WorkbookFactory.create(new FileInputStream(path));
	for (int i=0;i<4;i++)}

}
