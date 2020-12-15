package question1.entity;

import question1.entity.enumValue.TypeName;

public class TypeQuestion {
	private int typeID;
	private TypeName typeName;

	public TypeQuestion() {
		// TODO Auto-generated constructor stub
	}

	public TypeQuestion(int typeID, TypeName typeName) {
		super();
		this.typeID = typeID;
		this.typeName = typeName;
	}

	public int getTypeID() {
		return typeID;
	}

	public void setTypeID(int typeID) {
		this.typeID = typeID;
	}

	public TypeName getTypeName() {
		return typeName;
	}

	public void setTypeName(TypeName typeName) {
		this.typeName = typeName;
	}

}
