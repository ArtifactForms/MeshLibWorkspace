package workspace.command;

import mesh.render.Shading;
import workspace.WorkspaceModel;

public class ShadeSmoothFlatCommand extends AbstractWorkspaceKeyCommand {

	public ShadeSmoothFlatCommand(WorkspaceModel model) {
		super(model);
		setName("Shade Smooth");
		setKey('s');
	}

	@Override
	public void execute() {
		getModel().setShading(getModel().getShading() == Shading.SMOOTH ? Shading.FLAT : Shading.SMOOTH);
	}

}
