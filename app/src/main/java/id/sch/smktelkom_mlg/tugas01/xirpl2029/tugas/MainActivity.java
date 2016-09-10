package id.sch.smktelkom_mlg.tugas01.xirpl2029.tugas;

import android.os.Bundle;
import android.os.Process;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgbaru;
    TextView tvHasil;
    EditText etNama;
    CheckBox cbMedsan;
    CheckBox cbMac;
    CheckBox cbTsbc;
    Button bDt;
    Spinner spB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.etNama);
        rgbaru = (RadioGroup) findViewById(R.id.rgbaru);
        tvHasil = (TextView) findViewById(R.id.tvHasil);
        bDt.setOnClickListener(new View.OnClickListener() {
            findViewById(R.id.bDt)

            setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                    doClick();
                }
            }

            .

            @Override
            public void onClick(View v) {
                do Process();
            }

            )
        };

    private void doClick() {
        String tvhasil = null;

        if (tvHasil == null) {
            tvhasil.setText("Belum Memilih Kelas");
        } else {
            tvhasil.setText(etNama + "Kelas anda " + tvhasil);
        }
    }
});

private void doPocess(){
        if(isValid())
        {String nama=etNama.getText().toString();
        tvHasil.setText("Terima Kasih "+nama+"terdaftar di kelas"+);
        }
        }

private boolean isValid(){
        boolean valid=true;

        String nama=etNama.getText().toString();

        if(nama.isEmpty())
        {
        etNama.setError("Nama Belum Diisi");
        valid=false;
        }
        else
        {
        etNama.setError(null);
        }
        return valid;
        }
        }
        }


