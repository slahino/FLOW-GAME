import java.util.Objects;
import java.util.Random;

public class ModelCase {
    private int x, y;
    private CaseType type;
    private static Random random = new Random();

    public ModelCase(int x, int y) {
        this.x = x;
        this.y = y;
        this.type = randomType();
    }

    public CaseType randomType() {
        type = CaseType.values()[random.nextInt(CaseType.values().length)];
        return type;
    }

    public void setType() {
        this.type = randomType();
    }

    public CaseType getType() {
        return this.type;
    }

    public String toString() {
        return this.x + ", " + this.y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ModelCase modelCase = (ModelCase) o;
        return x == modelCase.x && y == modelCase.y && type == modelCase.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, type);
    }
}





