package is.tru.truin;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BaenastundKyrrdFragment extends Fragment {
	
	public BaenastundKyrrdFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_baenastund_kyrrd, container, false);
         
        return rootView;
    }
}
