package pe.edu.smt.tes.domain;

import java.io.Serializable;
import java.util.Arrays;

public class RBCCaso implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private String[] features;
	
	private String label;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getFeatures() {
		return features;
	}

	public void setFeatures(String[] features) {
		this.features = features;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "RBCCaso [id=" + id + ", features=" + Arrays.toString(features) + ", label=" + label + "]";
	}

}
