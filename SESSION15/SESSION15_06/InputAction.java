package SESSION15.SESSION15_06;

public class InputAction {
    private String fieldName;
    private String oldValue;
    private String newValue;
    private String actionTime;

    public InputAction(String fieldName, String oldValue, String newValue, String actionTime) {
        this.fieldName = fieldName;
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.actionTime = actionTime;
    }

    public String getFieldName() { return fieldName; }
    public void setFieldName(String fieldName) { this.fieldName = fieldName; }
    public String getOldValue() { return oldValue; }
    public void setOldValue(String oldValue) { this.oldValue = oldValue; }
    public String getNewValue() { return newValue; }
    public void setNewValue(String newValue) { this.newValue = newValue; }
    public String getActionTime() { return actionTime; }
    public void setActionTime(String actionTime) { this.actionTime = actionTime; }

    @Override
    public String toString() {
        return "[" + actionTime + "] Đổi '" + fieldName + "' từ '" + oldValue + "' thành '" + newValue + "'";
    }
}