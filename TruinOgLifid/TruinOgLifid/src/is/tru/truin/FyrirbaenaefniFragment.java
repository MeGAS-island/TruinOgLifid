package is.tru.truin;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FyrirbaenaefniFragment extends Fragment implements OnClickListener {
	
	Button sendafyrirbaenButton;
	EditText Fyrirbaen;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_fyrirbaenaefni, container, false);
        
        Fyrirbaen = (EditText) rootView.findViewById(R.id.fyrirbaenaefni);
        
        Button sendafyrirbaenButton = (Button) rootView.findViewById(R.id.sendafyrirbaenButton);
        sendafyrirbaenButton.setOnClickListener(this);     
        
        return rootView;
    }

	@Override
	public void onClick(View v) {
		//Hér verður emailið sent!
		//sækja textann, vista senda í maili
		
		String baenin = Fyrirbaen.getText().toString();
		
		Intent postur = new Intent(Intent.ACTION_SEND);
		postur.putExtra(Intent.EXTRA_TEXT, baenin);
		
	}

}
