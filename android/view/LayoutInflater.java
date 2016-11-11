package android.view;

import android.widget.TextView;
import voss.narrator.R;

public class LayoutInflater {

	public View inflate(int id, Object object) {
		View v = new View(id);
		if (id == R.layout.alert_name_prompt)
			v.addEditText(R.id.home_nameET);
		else if( id == R.layout.create_player_list){
			v.addEditText(R.id.addPlayerContent);
			v.addListView(R.id.listView1);
			v.addButton(R.id.addPlayerConfirm);
		}else if( id == R.layout.create_team_builder_layout){
			v.addEditText(R.id.newTeam_colorET);
			v.addEditText(R.id.newTeam_nameET);
			v.addTextView(R.id.newTeam_previewText);
			v.addButton(R.id.newTeam_cancel);
			v.addButton(R.id.newTeam_submit);
		}else if(id == R.layout.create_team_editor){
			v.addListView(R.id.editTeamLV1);
			v.addListView(R.id.editTeamLV2);
			v.addTextView(R.id.editTeamTV1);
			v.addTextView(R.id.editTeamTV2);
			v.addButton(R.id.editTeamConfirm);
		}else if(id == R.layout.home_login){
			v.addButton(R.id.login_loginButton);
			v.addButton(R.id.login_signup);
			v.addButton(R.id.login_cancelLogin);
			v.addEditText(R.id.login_username);
			v.addEditText(R.id.login_password);
		}else if(id == R.layout.action_target_view){
			v.addTextView(R.id.target_name);
			v.addCheckbox(R.id.target_r1);
			v.addCheckbox(R.id.target_r3);
			v.addCheckbox(R.id.target_r2);
		}
		return v;
	}

	public static LayoutInflater from(Object context) {
		return new LayoutInflater();
	}

	public View inflate(int id, ViewGroup parent, boolean b) {
		
		if(id == R.layout.create_roles_right_item)
			return new TextView(0);
		else if(id == R.layout.create_roles_left_item)
			return new TextView(0);
		
		return null;
	}

}
