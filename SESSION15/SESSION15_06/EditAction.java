package SESSION15.SESSION15_06;

public class EditAction {
    private String description;
    private String editedBy;
    private String editTime;

    public EditAction(String description, String editedBy, String editTime) {
        this.description = description;
        this.editedBy = editedBy;
        this.editTime = editTime;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getEditedBy() { return editedBy; }
    public void setEditedBy(String editedBy) { this.editedBy = editedBy; }
    public String getEditTime() { return editTime; }
    public void setEditTime(String editTime) { this.editTime = editTime; }

    @Override
    public String toString() {
        return editTime + " | " + editedBy + ": " + description;
    }
}