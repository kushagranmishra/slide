package kushagra.digipodium.slide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    private EditText editPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editPhone = findViewById(R.id.editPhone);
    }
public void backtoslide(View v)
{
    Intent i = new Intent(this,MainActivity.class);
    startActivity(i);
}
public void gotoInfo(View v)
{
    String phone = editPhone.getText().toString();
    Intent i= new Intent(this,InfoActivity.class);
    i.putExtra("phone",phone);
    startActivity(i);
}

}