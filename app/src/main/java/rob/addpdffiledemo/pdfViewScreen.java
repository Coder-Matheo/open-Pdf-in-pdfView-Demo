package rob.addpdffiledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdfViewScreen extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);


        pdfView = findViewById(R.id.pdfView);

        pdfView.fromAsset("assets/articulo.pdf").load();
    }
}