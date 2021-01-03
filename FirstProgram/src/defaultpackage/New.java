package defaultpackage;

public class New {
private String field;
private String function;
public New(String field, String function) {
	super();
	this.field = field;
	this.function = function;
}
public String getField() {
	return field;
}
public void setField(String field) {
	this.field = field;
}
public String getFunction() {
	return function;
}
public void setFunction(String function) {
	this.function = function;
}
@Override
public String toString() {
	return "New [field=" + field + ", function=" + function + "]";
}

}
