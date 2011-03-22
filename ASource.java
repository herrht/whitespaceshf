package szlab4_whitespaces;

public abstract class ASource extends AElement {

    public abstract void SetValue();

    @Override
    public int GetValue() {
        System.out.println(this + " | GetValue() | CALL | RETURN\n");
        return value;           //visszaadja az elem értékét
    }
}
