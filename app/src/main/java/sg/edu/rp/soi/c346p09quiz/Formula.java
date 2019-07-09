package sg.edu.rp.soi.c346p09quiz;

public class Formula {
    private String shape;
    private String formula;
    private String type;

    public Formula(String shape, String formula, String type) {
        this.shape = shape;
        this.formula = formula;
        this.type = type;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
