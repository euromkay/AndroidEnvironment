package android.view;

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
		}
		return v;
	}

	public static LayoutInflater from(Object context) {
		return new LayoutInflater();
	}

	public View inflate(int playerItem, ViewGroup parent, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

}
