package compiler488.ast.expn;

/**
 *  References to a scalar variable.
 */
public class IdentExpn extends VarRefExpn {
    private String ident;

    public IdentExpn(String ident) {
        this.ident = ident;
    }

    /**
     * Returns the name of the variable or function.
     */
    @Override
    public String toString () {
        return ident;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }
}
