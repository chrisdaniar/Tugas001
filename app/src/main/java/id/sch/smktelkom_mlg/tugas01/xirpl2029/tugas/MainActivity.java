package id.sch.smktelkom_mlg.tugas01.xirpl2029.tugas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements {
    EditText etNama;
    RadioGroup rgBaru;
    Spinner spYa;
    CheckBox cbM, cbMa, cbTs;
    Button bD;
    TextView tvH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.EditText);
        rgBaru = (RadioGroup) findViewById(R.id.rgbaru);
        spYa = (Spinner) findViewById(R.id.spB);
        cbM = (CheckBox) findViewById(R.id.cbMedsan);
        cbMa = (CheckBox) findViewById(R.id.cbMac);
        cbTs = (CheckBox) findViewById(R.id.cbTsbc);
        cbM.setOnCheckedChangeListener(this);
        cbMa.setOnCheckedChangeListener(this);
        cbTs.setOnCheckedChangeListener(this);

        bD = (Button) findViewById(R.id.bDt);
        tvH = (TextView) findViewById(R.id.tvHasil);

        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doClick();
            }
        });
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        String hasil = null;
        String kelas = spYa.getSelectedItem().toString();

        if (rgBaru.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(rgBaru.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }

        if (nama.isEmpty()) {
            etNama.setError("Nama Belum Diisi");
        } else if (nama.length() < 3) {
            etNama.setError("Nama Minimal 3 Karakter");
        } else {
            etNama.setError(null);
        }
        tvH.setText("--------------- ( METIC ) ---------------" + "\n Terima Kasih" + nama + "\n dariKelas : " + kelas + "\n Kelas Metic Kamu :" + hasil);
    }

}


