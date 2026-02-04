package model;

public class Position {

    // ===== Private Attributes =====
    private String positionId;
    private String positionName;

    // ===== Constructors =====
    public Position() {
    }

    public Position(String positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    // ===== Getter & Setter =====
    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
