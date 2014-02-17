package is.tru.truin;


import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class BaenastundOrdGudsFragment extends Fragment implements OnClickListener {
	
    Button btnHaldaAfram04;
	
	public BaenastundOrdGudsFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_baenastund_ord_guds, container, false);
        
        Button btnHaldaAfram04 = (Button) rootView.findViewById(R.id.button_004);
        btnHaldaAfram04.setOnClickListener(this);       
         
        return rootView;
    }
	
    @Override
    public void onClick(View v) {

        // Create new fragment and transaction
        Fragment newFragment = new BaenastundBaeninFragment(); 
        // consider using Java coding conventions (upper char class names!!!)
        android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.frame_container, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit(); 


    }
  
}